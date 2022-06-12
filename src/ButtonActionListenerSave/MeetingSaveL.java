package ButtonActionListenerSave;

import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import Exceptions.Exceptions;
import commander.ScheduleFunction;
import data.*;
import gui.*;
import guiSaver.MeetingS;

public class MeetingSaveL implements ActionListener{
	WindowFrame frame;
	JTextField fieldSerial;
	JTextField fieldYear;
	JTextField fieldMonth;
	JTextField fieldDay;
	JTextField fieldHour;
	JTextField fieldMinute;
	JTextField fieldPeoplecount;
	JTextField fieldSchhour;
	ScheduleFunction schfunction;
	
	public MeetingSaveL(WindowFrame frame,
			JTextField fieldSerial,
			JTextField fieldYear,
			JTextField fieldMonth,
			JTextField fieldDay,
			JTextField fieldHour,
			JTextField fieldMinute,
			JTextField fieldPeoplecount,
			JTextField fieldSchhour, ScheduleFunction schfunction) {
		super();
		this.frame = frame;
		this.fieldSerial = fieldSerial;
		this.fieldYear = fieldYear;
		this.fieldMonth = fieldMonth;
		this.fieldDay = fieldDay;
		this.fieldHour = fieldHour;
		this.fieldMinute = fieldMinute;
		this.fieldPeoplecount = fieldPeoplecount;
		this.fieldSchhour = fieldSchhour;
		this.schfunction = schfunction;
	}


	public MeetingSaveL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingS saver = frame.getMeetingsaver();
		frame.setupPanel(saver);

		InputInterface scheduleInput = new Meeting(Kind.Meeting);
		try {
			scheduleInput.setSerial(Integer.parseInt(fieldSerial.getText()));
			scheduleInput.setYear(Integer.parseInt(fieldYear.getText()));
			scheduleInput.setMonth(Integer.parseInt(fieldMonth.getText()));
			scheduleInput.setDay(Integer.parseInt(fieldDay.getText()));
			scheduleInput.setHour(Integer.parseInt(fieldHour.getText()));
			scheduleInput.setMinute(Integer.parseInt(fieldMinute.getText()));
			scheduleInput.setPeoplecount(Integer.parseInt(fieldPeoplecount.getText()));
			scheduleInput.setSchhour(Integer.parseInt(fieldSchhour.getText()));
			schfunction.addMeetingSchedule(scheduleInput);
			putObject(schfunction, "ScheduleMethod.ser");
			scheduleInput.printInfo();
		} catch (NumberFormatException | Exceptions e1) {
			e1.printStackTrace();
		}

	}
	
	public static void putObject(ScheduleFunction schfunction, String filename) {
		try { // 객체를 텍스트 파일에 작성함.
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(schfunction);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외처리
		} catch (IOException e) {
			e.printStackTrace(); // 예외처리
		}
	}

}
