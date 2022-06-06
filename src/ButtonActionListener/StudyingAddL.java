package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import guiAdder.MeetingAdder;
import guiAdder.StudyingAdder;

public class StudyingAddL implements ActionListener {
	
	WindowFrame frame;

	public StudyingAddL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		StudyingAdder adder = frame.getStudyingadder();
		frame.setupPanel(adder);
	}

}
