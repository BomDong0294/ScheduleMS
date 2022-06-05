package gui;

import java.awt.BorderLayout;

import javax.swing.*;

import ButtonActionListener.*;
import data.Kind;
import data.Meeting;
import function.ScheduleMethod;

public class MeetingSaver extends JPanel{
	
	private static final long serialVersionUID = -2161502310474585890L;
	private MeetingAdder _meeting_adder;
	
	public MeetingSaver(MeetingAdder meeting_adder) {
		this._meeting_adder = meeting_adder;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelSerial = new JLabel("The Meeting Schedule is added", JLabel.TRAILING);
		panel1.add(labelSerial);
		
		JButton button1 = new JButton("Exit"); // execute버튼 추가
		button1.addActionListener(new MenuListener(this._meeting_adder.frame));
		panel2.add(button1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
