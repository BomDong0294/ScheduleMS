package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.DelSerialChecker;
import gui.WindowFrame;

public class DelSerialListener implements ActionListener {
	
	WindowFrame frame;

	public DelSerialListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		DelSerialChecker delchecker = frame.getDelSerialChecker();
		frame.setupPanel(delchecker);
	}

}
