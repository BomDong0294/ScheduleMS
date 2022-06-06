package serialChecker;

import java.awt.BorderLayout;

import javax.swing.*;

import ButtonActionListener.*;
import function.ScheduleFunction;
import gui.WindowFrame;

public class ViewSerialC extends JPanel{
	
	WindowFrame frame;
	ScheduleFunction schfunction;

	public ViewSerialC(WindowFrame frame, ScheduleFunction schfunction) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelSerial = new JLabel("Type serial number : ", JLabel.TRAILING);
		JTextField fieldSerial = new JTextField(10);
		panel1.add(labelSerial);
		panel1.add(fieldSerial);
		
		JButton button1 = new JButton("Execute"); // execute버튼 추가
		button1.addActionListener(new ViewerL(frame));
		panel2.add(button1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
