package ButtonActionListener;

import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import Exceptions.Exceptions;
import commander.ScheduleFunction;
import data.InputInterface;
import gui.WindowFrame;
import guiSaver.EditS;

public class EditSaveL implements ActionListener {
	Scanner input = new Scanner(System.in);
	WindowFrame frame;
	JTextField fieldSerial;
	JTextField fieldYear;
	JTextField fieldMonth;
	JTextField fieldDay;
	JTextField fieldHour;
	JTextField fieldMinute;
	ScheduleFunction schfunction;
	
	public EditSaveL(WindowFrame frame, JTextField fieldSerial,	JTextField fieldYear,
			JTextField fieldMonth, JTextField fieldDay, JTextField fieldHour,
			JTextField fieldMinute, ScheduleFunction schfunction) {
		super();
		this.frame = frame;
		this.fieldSerial = fieldSerial;
		this.fieldSerial = fieldSerial;
		this.fieldYear = fieldYear;
		this.fieldMonth = fieldMonth;
		this.fieldDay = fieldDay;
		this.fieldHour = fieldHour;
		this.fieldMinute = fieldMinute;
		this.schfunction = schfunction;
	}
	public EditSaveL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		EditS edit = frame.getEdits();
		frame.setupPanel(edit);
		InputInterface scheduleInput;
		
		int serial = Integer.parseInt(fieldSerial.getText());

		for (int i = 0; i < schfunction.size(); i++) {
			scheduleInput = schfunction.get(i);
			int index = scheduleInput.getSerial();
			if (index == serial) {
				try {
					scheduleInput.setSerial(Integer.parseInt(fieldSerial.getText()));
					scheduleInput.setYear(Integer.parseInt(fieldYear.getText()));
					scheduleInput.setMonth(Integer.parseInt(fieldMonth.getText()));
					scheduleInput.setDay(Integer.parseInt(fieldDay.getText()));
					scheduleInput.setHour(Integer.parseInt(fieldHour.getText()));
					scheduleInput.setMinute(Integer.parseInt(fieldMinute.getText()));
				} catch (NumberFormatException | Exceptions e1) {
					e1.printStackTrace();
				}
				schfunction.get(i).getScheduleInput(input);
			}
		}
	}
	
	public static ScheduleFunction getObject(String filename) {
		ScheduleFunction schfunction = null;
		
		try { // 파일로 받아들이고 readObject()를 통해서 객체를 받아옴.
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			schfunction = (ScheduleFunction)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return schfunction; // 예외처리 및 파일을 받지 못하면 객체 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		}
		return schfunction;
	}
}
