package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Viewer extends JFrame { // 표시하는 클래스는 JFrame클래스를 상속받음
	
	public Viewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Serial number"); // 배열 내에서 고유 번호 열 추가
		model.addColumn("Year"); // 배열 내에서 연 열 추가
		model.addColumn("Month"); // 배열 내에서 달 열 추가
		model.addColumn("Day"); // 배열 내에서 일 열 추가
		model.addColumn("Hour"); // 배열 내에서 시간 열 추가
		model.addColumn("Minute"); // 배열 내에서 분 열 추가
		
		JTable table = new JTable(model); // JTable에 모델을 추가함
		JScrollPane sp = new JScrollPane(table); // 스크롤하는 부분에 테이블을 추가함
		
		this.add(sp); // 뷰어에 위 스크롤하는 페이지를 추가함
		this.setSize(600,400); // 창 사이즈 지정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 종료했을 때 완전히 종료할 수 있게끔 해줌
		this.setVisible(true); // 화면 표시 
		
	}
}
