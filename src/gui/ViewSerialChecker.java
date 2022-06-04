package gui;

import java.awt.BorderLayout;

import javax.swing.*;

import ButtonActionListener.*;
import function.ScheduleMethod;

public class ViewSerialChecker extends JPanel{
	
	WindowFrame frame;
	ScheduleMethod schfunction;

	public ViewSerialChecker(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelSerial = new JLabel("Type serial number : ", JLabel.TRAILING);
		JTextField fieldSerial = new JTextField(10);
		panel1.add(labelSerial);
		panel1.add(fieldSerial);
		
		JButton button1 = new JButton("Execute"); // execute버튼 추가
		button1.addActionListener(new ViewerListener(frame));
		panel2.add(button1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
