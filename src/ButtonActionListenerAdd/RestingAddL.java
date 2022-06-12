package ButtonActionListenerAdd;
import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import guiAdder.RestingAdder;

public class RestingAddL implements ActionListener {
	
	WindowFrame frame;

	public RestingAddL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		RestingAdder restadder = frame.getRestingadder();
		frame.setupPanel(restadder);
	}

}
