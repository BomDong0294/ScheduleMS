package ButtonActionListenerSave;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import Exceptions.Exceptions;
import commander.ScheduleFunction;
import data.*;
import gui.*;
import guiSaver.RestingS;

public class RestingSaveL implements ActionListener {
	WindowFrame frame;
	JTextField fieldSerial;
	JTextField fieldYear;
	JTextField fieldMonth;
	JTextField fieldDay;
	JTextField fieldPeoplecount;
	JTextField fieldSchday;
	ScheduleFunction schfunction;
	
	public RestingSaveL(WindowFrame frame,
			JTextField fieldSerial,
			JTextField fieldYear,
			JTextField fieldMonth,
			JTextField fieldDay,
			JTextField fieldPeoplecount,
			JTextField fieldSchday, ScheduleFunction schfunction) {
		super();
		this.frame = frame;
		this.fieldSerial = fieldSerial;
		this.fieldYear = fieldYear;
		this.fieldMonth = fieldMonth;
		this.fieldDay = fieldDay;
		this.fieldPeoplecount = fieldPeoplecount;
		this.fieldSchday = fieldSchday;
		this.schfunction = schfunction;
	}

	public RestingSaveL(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		RestingS saver = frame.getRestingsaver();
		frame.setupPanel(saver);

		InputInterface scheduleInput = new Rest(Kind.Resting);
		try {
			scheduleInput.setSerial(Integer.parseInt(fieldSerial.getText()));
			scheduleInput.setYear(Integer.parseInt(fieldYear.getText()));
			scheduleInput.setMonth(Integer.parseInt(fieldMonth.getText()));
			scheduleInput.setDay(Integer.parseInt(fieldDay.getText()));
			scheduleInput.setPeoplecount(Integer.parseInt(fieldPeoplecount.getText()));
			scheduleInput.setSchday(Integer.parseInt(fieldSchday.getText()));
			schfunction.addRestingSchedule(scheduleInput);
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
