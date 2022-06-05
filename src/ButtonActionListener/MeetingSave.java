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
	MeetingAdder meeting_adder;

	public MeetingSave(MeetingAdder ma) {
		this.frame = ma.frame;
		this.meeting_adder = ma;
	}
	public void saveMeeting() {
		ScheduleMethod sm = ScheduleMethod.getInstance();
		
		int snum = Integer.parseInt(meeting_adder.fieldSerial.getText());
		int year = Integer.parseInt(meeting_adder.fieldYear.getText());
		int mon = Integer.parseInt(meeting_adder.fieldMonth.getText());
		int day = Integer.parseInt(meeting_adder.fieldDay.getText());
		int hour = Integer.parseInt(meeting_adder.fieldHour.getText());
		int min = Integer.parseInt(meeting_adder.fieldMinute.getText());
		int peoplecount = Integer.parseInt(meeting_adder.fieldPeoplecount.getText());
		int schhour = Integer.parseInt(meeting_adder.fieldSchhour.getText());
		sm.schedule_list.add(new Meeting(Kind.Meeting, snum,year, mon, day, hour, min, peoplecount, schhour));
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		saveMeeting();
		JButton b = (JButton)e.getSource();
		MeetingSaver saver = frame.getMeetingsaver();
		frame.setupPanel(saver);
	}

}
