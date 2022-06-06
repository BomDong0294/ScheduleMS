package guiSaver;

import java.awt.BorderLayout;

import javax.swing.*;

import ButtonActionListener.*;
import data.Kind;
import data.Meeting;
import function.ScheduleFunction;
import gui.WindowFrame;

public class EditS extends JPanel{
	public EditS(WindowFrame frame, ScheduleFunction schfunction) {
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel labelSerial = new JLabel("The Schedule is Edited", JLabel.TRAILING);
		panel1.add(labelSerial);
		
		JButton button1 = new JButton("Exit"); // execute버튼 추가
		button1.addActionListener(new MenuL(frame));
		panel2.add(button1);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		this.setVisible(true);
	}

}
