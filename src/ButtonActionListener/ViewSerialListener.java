package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.DelSerialChecker;
import gui.ViewSerialChecker;
import gui.WindowFrame;

public class ViewSerialListener implements ActionListener {
	
	WindowFrame frame;

	public ViewSerialListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ViewSerialChecker viewchecker = frame.getViewserialchecker();
		frame.setupPanel(viewchecker);
	}

}
