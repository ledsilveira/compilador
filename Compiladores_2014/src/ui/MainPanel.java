
package ui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
import javax.swing.border.EtchedBorder;

import analisador.Analyzer;
import analisador.LexiconAnalyzer;
import analisador.SyntacticAnalyzer;
import analisador.SemanticAnalyzer;
import gals.FileManager;
import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;
import logic.message.Message;

public class MainPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private Dimension size;
	private Font font;
	private JLabel contentLabel, resultLabel;
	private JTextArea contentTextArea, resultTextArea;
        private JScrollPane scroll1;
	
	public MainPanel(Dimension size) {
		this.size = size;
	//	this.setPreferredSize(size);
		this.initializeComponents();
		this.positionComponents();
	}
        
        private void setCursor( int pos ){
            contentTextArea.requestFocus();
            contentTextArea.setCaretPosition(pos);
        }
 
	private void initializeComponents() {
		font = new Font("Courier New", Font.PLAIN, 14);
		contentLabel = new JLabel("Programa");
		resultLabel = new JLabel("Resultado");
		
		Dimension dimensionContent = new Dimension((int) (size.width*0.7), (int) (size.height*0.85));
		contentTextArea = new JTextArea();
		contentTextArea.setText("Escreva seu programa aqui ou use o menu Arquivo para carregar um.");
		contentTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
		contentTextArea.setFont(font);
		contentTextArea.setRows(20);
                contentTextArea.scrollRectToVisible(null);
                contentTextArea.setEditable(true);   

                //aki fazendo quebra de linha automatica   
                contentTextArea.setLineWrap(true); 
                

                //aki colocando a barra de rolangem quando necessario   
//                int policy = scroll1.getVerticalScrollBarPolicy(); scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);   
                scroll1 = new JScrollPane(); 
                // aki colocando uma borda   
                scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
                scroll1.setViewportView(contentTextArea);
      
               // this.add(scroll1);
             
		//this.setsetContentPane(scroll);
		Dimension dimensionResult = new Dimension((int) ((size.width-dimensionContent.width)*0.9), dimensionContent.height);
		resultTextArea = new JTextArea();
		resultTextArea.setEditable(false);
		resultTextArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1, false));
		resultTextArea.setAutoscrolls(true);
		resultTextArea.setFont(font);
		resultTextArea.setLineWrap(true);
		resultTextArea.setWrapStyleWord(true);
		resultTextArea.setPreferredSize(dimensionResult);
		resultTextArea.setMaximumSize(dimensionResult);
		resultTextArea.setMinimumSize(dimensionResult);
	}
	
	private void positionComponents() {
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		layout.setHorizontalGroup(
			layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
					.addComponent(contentLabel)
					//.addComponent(contentTextArea)
                                        .addComponent(scroll1)
                                        )
				.addGroup(layout.createParallelGroup()
					.addComponent(resultLabel)
					.addComponent(resultTextArea))
		);
		
		layout.setVerticalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addGroup(layout.createSequentialGroup()
					.addComponent(contentLabel)
					//.addComponent(contentTextArea)
                                        .addComponent(scroll1)
                                        )
				.addGroup(layout.createSequentialGroup()
					.addComponent(resultLabel)
					.addComponent(resultTextArea))
		);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String actionCommand = event.getActionCommand();
		String inputText = contentTextArea.getText();
		JFileChooser jfc = new JFileChooser(); jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		Analyzer analyzer = null;
		FileManager fileManager = null;
		switch(actionCommand) {
		case "LOAD_FILE" :
			if(jfc.showOpenDialog(jfc) == JFileChooser.APPROVE_OPTION) {
				fileManager = new FileManager();
				contentTextArea.setText(fileManager.loadFile(jfc.getSelectedFile().getPath()));
				resultTextArea.setText("");
				resultTextArea.setForeground(Color.BLUE);
	        }
			break;
		case "SAVE_FILE" :
			if(jfc.showOpenDialog(jfc) == JFileChooser.APPROVE_OPTION) {   
				fileManager = new FileManager();
				fileManager.saveFile(inputText, jfc.getSelectedFile().getPath()); 
				resultTextArea.setText("");
				resultTextArea.setForeground(Color.BLUE);
			}
			break;
		case "EXIT" :
			System.exit(0);
			break;
		case "LEXICON_ANALYZER" :
			analyzer = new LexiconAnalyzer();
			setResultText(analyzer.analyze(inputText));
                        break;
		case "SINTACTIC_ANALYZER" :
			analyzer = new SyntacticAnalyzer();
			setResultText(analyzer.analyze(inputText));
			break;
		case "SEMANTIC_ANALYZER" :
			analyzer = new SemanticAnalyzer();
			setResultText(analyzer.analyze(inputText));
			break;
		case "ABOUT" :
			showAbout();
			break;
		case "HELP" :
			showHelp();
			break;
		}
	}
	
	private void setResultText(List<Message> messages) {
		resultTextArea.setText("");
		resultTextArea.setForeground(Color.BLUE);
		String messageToDisplay = "";
		if(messages == null || messages.size() == 0) {
			messageToDisplay = "Nenhuma mensagem de resposta.";
		} else {
			for(Message message : messages) {
				messageToDisplay += "Mensagem: "+message.getName().toUpperCase()+"\n";
				messageToDisplay += "Descrição: " + message.getDescription()+"\n";
                                /*
                                 * Manda o cursor onde ocorreu erro
                                 */
                                this.setCursor( message.getCaracterError());
                                //System.out.println( message.getCaracterError() );
				switch(message.getTypeMessage())
                                {
                                    case 0:
                                        resultTextArea.setForeground(Color.BLUE);
                                        break;
                                    case 1:
                                        resultTextArea.setForeground(Color.GREEN);
                                        break;
                                    case 2:
                                        messageToDisplay += "Possível Solução: "+message.getSolution();
					resultTextArea.setForeground(Color.RED);
                                        break;
                                }
                                       
                               
			}
		}
		resultTextArea.setText(messageToDisplay);
	}
	
	private void showAbout() {
		String message = "Trabalho Prático da Disciplina INE5622 - Introdução a Compiladores\n"+
			"Alunos: \nLeandro Silveira";
		showMessage(message);
	}

	private void showHelp() {
		String message = "Utilize o menu Arquivo para abrir e salvar os arquivos.\nCom os itens de menu Analisador é possível fazer as três análises do programa: Léxica, Sintática e Semântica.";
		showMessage(message);
	}
	
	private void showMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

}
