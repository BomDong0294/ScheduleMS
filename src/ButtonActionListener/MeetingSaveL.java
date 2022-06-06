package ButtonActionListener;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import data.*;
import function.ScheduleFunction;
import gui.*;
import guiAdder.MeetingAdder;
import guiSaver.MeetingS;

public class MeetingSaveL implements ActionListener {
	
	WindowFrame frame;

	public MeetingSaveL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingS saver = frame.getMeetingsaver();
		frame.setupPanel(saver);
	}

}
