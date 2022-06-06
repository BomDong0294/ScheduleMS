package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.AllViewer;
import gui.MenuSelection;
import gui.WindowFrame;

public class MenuL implements ActionListener {
	
	WindowFrame frame;

	public MenuL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MenuSelection menu = frame.getMenuselection();
		frame.setupPanel(menu);
	}

}
