package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import serialChecker.EditSerialC;

public class EditSerialL implements ActionListener {
	
	WindowFrame frame;

	public EditSerialL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		EditSerialC editchecker = frame.getEditSerialChecker();
		frame.setupPanel(editchecker);
	}

}
