package gui;

import java.awt.*;
import javax.swing.*;

import ButtonActionListener.*;
import function.ScheduleMethod;

public class MenuSelection extends JPanel { // JFrame 클래스 상속
	
	WindowFrame frame;
	ScheduleMethod schfunction;
	
	public MenuSelection(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel(); // 패널 하나 추가
		JPanel panel2 = new JPanel(); // 패널 하나 더 추가
		JLabel label = new JLabel("Menu Selection"); // 제목을 지정함 (프로그램 이름 아님)
		
		JButton button1 = new JButton("Add Schedule"); // 스케줄 추가 버튼 추가
		JButton button2 = new JButton("Delete Schedule"); // 스케줄 삭제 버튼 추가
		JButton button3 = new JButton("Edit Schedule"); // 스케줄 편집 버튼 추가
		JButton button4 = new JButton("View one Schedule"); // 하나의 스케줄 표시 버튼 추가
		JButton button5 = new JButton("View all Schedule"); // 모든 스케줄 표시 버튼 추가
		JButton button6 = new JButton("Exit program"); // 프로그램 종료 버튼 추가
		
		button1.addActionListener(new AddmenuListener(frame));
		button2.addActionListener(new DelSerialListener(frame));
		button3.addActionListener(new EditSerialListener(frame));
		button4.addActionListener(new ViewSerialListener(frame));
		button5.addActionListener(new AllViewListener(frame));
		button6.addActionListener(new ExitListener(frame));
		
		panel1.add(label); // 메뉴 선택 제목이 포함된 패널1을 추가함
		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6); // 위에 있는 버튼들을 전부 패널2 내에 추가함
		
		this.add(panel1, BorderLayout.NORTH); // 패널1을 레이아웃 내에서 북쪽에 생성
		this.add(panel2, BorderLayout.CENTER); // 패널2를 레이아웃 내에서 중앙에 생성
	}

}
