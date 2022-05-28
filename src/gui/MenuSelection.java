package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame { // JFrame 클래스 상속
	
	public MenuSelection() {
		this.setSize(600, 400); // 창의 크기를 지정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램 종료
		
		JPanel panel1 = new JPanel(); // 패널 하나 추가
		JPanel panel2 = new JPanel(); // 패널 하나 더 추가
		JLabel label = new JLabel("Menu Selection"); // 제목을 지정함 (프로그램 이름 아님)
		
		JButton button1 = new JButton("Add Schedule"); // 스케줄 추가 버튼 추가
		JButton button2 = new JButton("Delete Schedule"); // 스케줄 삭제 버튼 추가
		JButton button3 = new JButton("Edit Schedule"); // 스케줄 편집 버튼 추가
		JButton button4 = new JButton("View one Schedule"); // 하나의 스케줄 표시 버튼 추가
		JButton button5 = new JButton("View all Schedule"); // 모든 스케줄 표시 버튼 추가
		JButton button6 = new JButton("Exit program"); // 프로그램 종료 버튼 추가
		
		
		panel1.add(label); // 메뉴 선택 제목이 포함된 패널1을 추가함
		panel2.add(button1); 
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6); // 위에 있는 버튼들을 전부 패널2 내에 추가함
		
		this.add(panel1, BorderLayout.NORTH); // 패널1을 레이아웃 내에서 북쪽에 생성
		this.add(panel2, BorderLayout.CENTER); // 패널2를 레이아웃 내에서 중앙에 생성
		
		this.setVisible(true); // 화면에 표시되도록 설정
	}

}
