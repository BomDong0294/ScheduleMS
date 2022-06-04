package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;
import gui.MeetingAdder;
import gui.StudyingAdder;
import gui.WindowFrame;

public class StudyingAddListener implements ActionListener {
	
	WindowFrame frame;

	public StudyingAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		StudyingAdder adder = frame.getStudyingadder();
		frame.setupPanel(adder);
	}

}
