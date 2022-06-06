package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import serialChecker.DelSerialC;
import serialChecker.ViewSerialC;

public class ViewSerialL implements ActionListener {
	
	WindowFrame frame;

	public ViewSerialL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ViewSerialC viewchecker = frame.getViewserialchecker();
		frame.setupPanel(viewchecker);
	}

}
