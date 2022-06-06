package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import serialChecker.DelSerialC;
import serialChecker.ViewSerialC;

public class ExitL implements ActionListener {
	
	WindowFrame frame;

	public ExitL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		System.exit(0);
	}

}
