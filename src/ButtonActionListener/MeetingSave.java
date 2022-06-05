package ButtonActionListener;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import data.*;
import function.ScheduleMethod;
import gui.*;

public class MeetingSave implements ActionListener {
	WindowFrame frame;
	ScheduleMethod schfunction;

	public MeetingSave(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		this.schfunction = schfunction;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingSaver saver = frame.getMeetingsaver();
		frame.setupPanel(saver);
	}

}
