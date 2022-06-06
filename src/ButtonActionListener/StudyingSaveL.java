package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.*;
import guiSaver.ShoppingS;
import guiSaver.StudyingS;

public class StudyingSaveL implements ActionListener {
	
	WindowFrame frame;

	public StudyingSaveL(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		StudyingS saver = frame.getStudyingsaver();
		frame.setupPanel(saver);
	}

}
