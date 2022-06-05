package gui;

import javax.swing.*;
import ButtonActionListener.*;
import function.ScheduleMethod;

public class MeetingAdder extends JPanel {
	
	WindowFrame frame;
	ScheduleMethod schfunction;
	public JTextField fieldSerial;
	public JTextField fieldYear;
	public JTextField fieldMonth;
	public JTextField fieldDay;
	public JTextField fieldHour;
	public JTextField fieldMinute;
	public JTextField fieldPeoplecount;
	public JTextField fieldSchhour;

//	public String ssnum;
//	public String syear;
//	public String smon;
//	public String sday;
//	public String shour;
//	public String smin;
//	public String speoplecount;
//	public String sschhour;
//	
//	public void InfoSetter(String ssnum, String syear, String smon, String sday, String shour, String smin, String speoplecount, String sschhour) {
//		this.ssnum = fieldSerial.getText();
//		this.syear = fieldYear.getText();
//		this.smon = fieldMonth.getText();
//		this.sday = fieldDay.getText();
//		this.shour = fieldHour.getText();
//		this.smin = fieldMinute.getText();
//		this.speoplecount = fieldPeoplecount.getText();
//		this.sschhour = fieldSchhour.getText();
//	}

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
		
//		InfoSetter(ssnum,syear,smon,sday,shour,smin,speoplecount,sschhour);
		
		JButton button1 = new JButton("Save");
		button1.addActionListener(new MeetingSave(frame, schfunction));
		panel.add(button1); // save버튼 추가
		
		JButton button2 = new JButton("Cancel"); // cancel버튼 추가
		button2.addActionListener(new MenuListener(frame));
		panel.add(button2);
		
		SpringUtilities.makeCompactGrid(panel, 9, 2, 6, 6, 6, 6);
		// 간단한 틀을 하나 추가해줌

		this.add(panel);
		this.setVisible(true);
	}
	
//	public String getSsnum() {
//		return ssnum;
//	}
//
//	public void setSsnum(String ssnum) {
//		this.ssnum = ssnum;
//	}
//
//	public String getSyear() {
//		return syear;
//	}
//
//	public void setSyear(String syear) {
//		this.syear = syear;
//	}
//
//	public String getSmon() {
//		return smon;
//	}
//
//	public void setSmon(String smon) {
//		this.smon = smon;
//	}
//
//	public String getSday() {
//		return sday;
//	}
//
//	public void setSday(String sday) {
//		this.sday = sday;
//	}
//
//	public String getShour() {
//		return shour;
//	}
//
//	public void setShour(String shour) {
//		this.shour = shour;
//	}
//
//	public String getSmin() {
//		return smin;
//	}
//
//	public void setSmin(String smin) {
//		this.smin = smin;
//	}
//
//	public String getSpeoplecount() {
//		return speoplecount;
//	}
//
//	public void setSpeoplecount(String speoplecount) {
//		this.speoplecount = speoplecount;
//	}
//
//	public String getSschhour() {
//		return sschhour;
//	}
//
//	public void setSschhour(String sschhour) {
//		this.sschhour = sschhour;
//	}

}
