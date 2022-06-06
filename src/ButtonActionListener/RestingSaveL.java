package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.*;
import guiAdder.*;
import guiSaver.RestingS;

public class RestingSaveL implements ActionListener {
	
	WindowFrame frame;

	public RestingSaveL(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		RestingS saver = frame.getRestingsaver();
		frame.setupPanel(saver);
	}

}
