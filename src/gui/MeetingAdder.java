package gui;

import javax.swing.*;
import ButtonActionListener.*;
import function.ScheduleMethod;

public class MeetingAdder extends JPanel {
	
	public WindowFrame frame;
	ScheduleMethod schfunction;
	public JTextField fieldSerial;
	public JTextField fieldYear;
	public JTextField fieldMonth;
	public JTextField fieldDay;
	public JTextField fieldHour;
	public JTextField fieldMinute;
	public JTextField fieldPeoplecount;
	public JTextField fieldSchhour;

	public MeetingAdder(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		// (19~53줄) 각 카테고리를 라벨 객체로 하나씩 만들고 텍스트 입력칸을 만들어준 다음
		// 라벨 객체가 텍스트 입력칸을 받음 그리고 패널에 각 카테고리가 있는 라벨과 텍스트패널을 추가함
		
		JLabel labelSerial = new JLabel("Serial number : ", JLabel.TRAILING);
		fieldSerial = new JTextField(10);
		labelSerial.setLabelFor(fieldSerial);
		panel.add(labelSerial);
		panel.add(fieldSerial);
		
		JLabel labelYear = new JLabel("Year : ", JLabel.TRAILING);
		fieldYear = new JTextField(10);
		labelYear.setLabelFor(fieldYear);
		panel.add(labelYear);
		panel.add(fieldYear);
		
		JLabel labelMonth = new JLabel("Month : ", JLabel.TRAILING);
		fieldMonth = new JTextField(10);
		labelMonth.setLabelFor(fieldMonth);
		panel.add(labelMonth);
		panel.add(fieldMonth);
		
		JLabel labelDay = new JLabel("Day : ", JLabel.TRAILING);
		fieldDay = new JTextField(10);
		labelDay.setLabelFor(fieldDay);
		panel.add(labelDay);
		panel.add(fieldDay);
		
		JLabel labelHour = new JLabel("Hour : ", JLabel.TRAILING);
		fieldHour = new JTextField(10);
		labelHour.setLabelFor(fieldHour);
		panel.add(labelHour);
		panel.add(fieldHour);
		
		JLabel labelMinute = new JLabel("Minute : ", JLabel.TRAILING);
		fieldMinute = new JTextField(10);
		labelMinute.setLabelFor(fieldMinute);
		panel.add(labelMinute);
		panel.add(fieldMinute);
		
		JLabel labelPeoplecount = new JLabel("How many people participate : ", JLabel.TRAILING);
		fieldPeoplecount = new JTextField(10);
		labelPeoplecount.setLabelFor(fieldPeoplecount);
		panel.add(labelPeoplecount);
		panel.add(fieldPeoplecount);

		JLabel labelSchhour = new JLabel("Meeting Hour : ", JLabel.TRAILING);
		fieldSchhour = new JTextField(10);
		labelSchhour.setLabelFor(fieldSchhour);
		panel.add(labelSchhour);
		panel.add(fieldSchhour);
		
		JButton button1 = new JButton("Save");
		button1.addActionListener(new MeetingSave(this));
		panel.add(button1); // save버튼 추가
		
		JButton button2 = new JButton("Cancel"); // cancel버튼 추가
		button2.addActionListener(new MenuListener(frame));
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 9, 2, 6, 6, 6, 6);
		// 간단한 틀을 하나 추가해줌

		this.add(panel);
		this.setVisible(true);
	}

}
