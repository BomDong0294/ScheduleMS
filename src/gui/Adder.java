package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Adder extends JFrame {

	public Adder() {
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
		
		panel.add(new JButton("save")); // save버튼 추가
		panel.add(new JButton("cancel")); // cancel버튼 추가
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		// 간단한 틀을 하나 추가해줌
		
		this.setSize(600,400); // 창 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 정상적으로 종료되게끔 해줌
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
