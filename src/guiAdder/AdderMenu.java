package guiAdder;

import java.awt.*;
import javax.swing.*;

import ButtonActionListener.MeetingAddL;
import ButtonActionListener.RestingAddL;
import ButtonActionListener.ShoppingAddL;
import ButtonActionListener.StudyingAddL;
import function.ScheduleFunction;
import gui.WindowFrame;

public class AdderMenu extends JPanel { // JFrame 클래스 상속
	
	WindowFrame frame;
	ScheduleFunction schfunction;
	
	public AdderMenu(WindowFrame frame, ScheduleFunction schfunction) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel(); // 패널 하나 추가
		JPanel panel2 = new JPanel(); // 패널 하나 더 추가
		JLabel label = new JLabel("Add Schedule Category Selection"); // 제목을 지정함 (프로그램 이름 아님)
		
		JButton button1 = new JButton("Meeting"); // 스케줄 추가 버튼 추가
		JButton button2 = new JButton("Shopping"); // 스케줄 삭제 버튼 추가
		JButton button3 = new JButton("Studying"); // 스케줄 편집 버튼 추가
		JButton button4 = new JButton("Resting"); // 하나의 스케줄 표시 버튼 추가
		
		button1.addActionListener(new MeetingAddL(frame));
		button2.addActionListener(new ShoppingAddL(frame));
		button3.addActionListener(new StudyingAddL(frame));
		button4.addActionListener(new RestingAddL(frame));
		
		panel1.add(label); // 메뉴 선택 제목이 포함된 패널1을 추가함
		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		this.add(panel1, BorderLayout.NORTH); // 패널1을 레이아웃 내에서 북쪽에 생성
		this.add(panel2, BorderLayout.CENTER); // 패널2를 레이아웃 내에서 중앙에 생성
	}

}
