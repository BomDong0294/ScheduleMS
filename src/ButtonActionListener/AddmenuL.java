package ButtonActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import gui.WindowFrame;
import guiAdder.AdderMenu;

public class AddmenuL implements ActionListener {
	
	WindowFrame frame;
	
	public AddmenuL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		AdderMenu addermenu = frame.getAdderMenu();
		frame.setupPanel(addermenu);
	}

}
