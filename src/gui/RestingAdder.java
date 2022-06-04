package gui;

import javax.swing.*;

import ButtonActionListener.MeetingAddListener;
import ButtonActionListener.MenuListener;
import function.ScheduleMethod;

public class RestingAdder extends JPanel {
	
	WindowFrame frame;
	ScheduleMethod schfunction;;

	public RestingAdder(WindowFrame frame, ScheduleMethod schfunction) {
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
		
		JLabel labelPeoplecount = new JLabel("How many people participate : ", JLabel.TRAILING);
		JTextField fieldPeoplecount = new JTextField(10);
		labelPeoplecount.setLabelFor(fieldPeoplecount);
		panel.add(labelPeoplecount);
		panel.add(fieldPeoplecount);
		
		JLabel labelSchDay = new JLabel("Resting Days : ", JLabel.TRAILING);
		JTextField fieldSchDay = new JTextField(10);
		labelSchDay.setLabelFor(fieldSchDay);
		panel.add(labelSchDay);
		panel.add(fieldSchDay);
		
		JButton button1 = new JButton("Save");
		button1.addActionListener(new MenuListener(frame));
		panel.add(button1); // save버튼 추가
		
		JButton button2 = new JButton("Cancel"); // cancel버튼 추가
		button2.addActionListener(new MenuListener(frame));
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		// 간단한 틀을 하나 추가해줌

		this.add(panel);
		this.setVisible(true);
	}
}
