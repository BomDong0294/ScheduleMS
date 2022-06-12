package gui;

import javax.swing.*;

import ButtonActionListener.EditSaveL;
import ButtonActionListener.MenuL;
import commander.ScheduleFunction;

public class Editor extends JPanel {
	
	WindowFrame frame;
	ScheduleFunction schfunction;

	public Editor(WindowFrame frame, ScheduleFunction schfunction) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// (19~53줄) 각 카테고리를 라벨 객체로 하나씩 만들고 텍스트 입력칸을 만들어준 다음
		// 라벨 객체가 텍스트 입력칸을 받음 그리고 패널에 각 카테고리가 있는 라벨과 텍스트패널을 추가함
		
		JLabel labelSerial = new JLabel("Serial number : ", JLabel.TRAILING);
		JTextField fieldSerial = new JTextField(10);
		labelSerial.setLabelFor(fieldSerial);
		panel.add(labelSerial);
		panel.add(fieldSerial);
		
		JLabel labelYear = new JLabel("Year : ", JLabel.TRAILING);
		JTextField fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);
		
		JLabel labelMonth = new JLabel("Month : ", JLabel.TRAILING);
		JTextField fieldMonth = new JTextField(10);
		labelMonth.setLabelFor(fieldMonth);
		panel.add(labelMonth);
		panel.add(fieldMonth);
		
		JLabel labelDay = new JLabel("Day : ", JLabel.TRAILING);
		JTextField fieldDay = new JTextField(10);
		labelDay.setLabelFor(fieldDay);
		panel.add(labelDay);
		panel.add(fieldDay);
		
		JLabel labelHour = new JLabel("Hour : ", JLabel.TRAILING);
		JTextField fieldHour = new JTextField(10);
		labelHour.setLabelFor(fieldHour);
		panel.add(labelHour);
		panel.add(fieldHour);
		
		JLabel labelMinute = new JLabel("Minute : ", JLabel.TRAILING);
		JTextField fieldMinute = new JTextField(10);
		labelMinute.setLabelFor(fieldMinute);
		panel.add(labelMinute);
		panel.add(fieldMinute);
		
		JButton button1 = new JButton("Save");
		button1.addActionListener(new EditSaveL(frame, fieldSerial, fieldYear,
				fieldMonth, fieldDay, fieldHour, fieldDay, schfunction));
		panel.add(button1); // save버튼 추가
		
		JButton button2 = new JButton("Cancel"); // cancel버튼 추가
		button2.addActionListener(new MenuL(frame));
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		// 간단한 틀을 하나 추가해줌

		this.add(panel);
		this.setVisible(true);
	}
}
