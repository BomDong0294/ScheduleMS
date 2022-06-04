package gui;

import java.awt.BorderLayout;

import javax.swing.*;

import ButtonActionListener.*;
import function.ScheduleMethod;

public class MeetingSaver extends JPanel{
	
	WindowFrame frame;
	ScheduleMethod schfunction;

	public MeetingSaver(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelSerial = new JLabel("The Meeting Schedule is added", JLabel.TRAILING);
		panel1.add(labelSerial);
		
		JButton button1 = new JButton("Exit"); // execute버튼 추가
		button1.addActionListener(new MenuListener(frame));
		panel2.add(button1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
