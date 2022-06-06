package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import guiAdder.MeetingAdder;

public class MeetingAddL implements ActionListener {
	
	WindowFrame frame;

	public MeetingAddL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingAdder adder = frame.getAdder();
		frame.setupPanel(adder);
	}

}
