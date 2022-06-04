package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.EditSerialChecker;
import gui.WindowFrame;

public class EditSerialListener implements ActionListener {
	
	WindowFrame frame;

	public EditSerialListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		EditSerialChecker editchecker = frame.getEditSerialChecker();
		frame.setupPanel(editchecker);
	}

}
