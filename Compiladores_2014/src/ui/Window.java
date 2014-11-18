
package ui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {

	private Dimension size = new Dimension(1200,600);
	private JFrame frame = new JFrame("Leandro Silveira - Compilador LSI-14/2");
	private MainPanel panel = new MainPanel(size);
	
	public Window() {
		panel.setMaximumSize(size);
		panel.setMinimumSize(size);
		
		frame.setPreferredSize(size);
		frame.setMaximumSize(size);
		frame.setMinimumSize(size);
		frame.setResizable(false);
		frame.setContentPane(panel);
		frame.setJMenuBar(new MainMenu(panel));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocationRelativeTo(null);
	}
	
	public void start() {
		frame.setVisible(true);
	}

}
