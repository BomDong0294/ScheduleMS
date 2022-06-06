package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import serialChecker.DelSerialC;

public class DelSerialL implements ActionListener {
	
	WindowFrame frame;

	public DelSerialL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		DelSerialC delchecker = frame.getDelSerialChecker();
		frame.setupPanel(delchecker);
	}

}
