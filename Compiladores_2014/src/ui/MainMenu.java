package ui;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenu extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	public MainMenu(ActionListener actionListener) {
		JMenu menu = null;
		
		menu = new JMenu("Arquivo");
		menu.add(this.getMenuItem("Carregar Arquivo", actionListener, UserCommand.LOAD_FILE, true));
		menu.add(this.getMenuItem("Salvar Arquivo", actionListener, UserCommand.SAVE_FILE, true));
		menu.addSeparator();
		menu.add(this.getMenuItem("Sair", actionListener, UserCommand.EXIT, true));
		this.add(menu);
		
		menu = new JMenu("Analisador");
		menu.add(this.getMenuItem("Léxico", actionListener, UserCommand.LEXICON_ANALYZER, true));
		menu.add(this.getMenuItem("Sintático", actionListener, UserCommand.SINTACTIC_ANALYZER, true));
		menu.add(this.getMenuItem("Semântico", actionListener, UserCommand.SEMANTIC_ANALYZER, true));
		this.add(menu);
		
		menu = new JMenu("Ajuda");
		menu.add(this.getMenuItem("Sobre", actionListener, UserCommand.ABOUT, true));
		menu.add(this.getMenuItem("Ajuda", actionListener, UserCommand.HELP, true));
		this.add(menu);
	}
	
	private JMenuItem getMenuItem(String name, ActionListener actionListener, UserCommand command, Boolean enabled) {
		JMenuItem item = new JMenuItem(name);
		item.addActionListener(actionListener);
		item.setActionCommand(command.name());
		item.setEnabled(enabled);
		return item;
	}

}
