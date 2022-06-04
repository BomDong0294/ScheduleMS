package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.DelSerialChecker;
import gui.ViewSerialChecker;
import gui.WindowFrame;

public class ExitListener implements ActionListener {
	
	WindowFrame frame;

	public ExitListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		System.exit(0);
	}

}
