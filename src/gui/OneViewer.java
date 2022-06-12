package gui;

import java.awt.BorderLayout;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import ButtonActionListener.MenuL;
import commander.ScheduleFunction;
import data.InputInterface;

public class OneViewer extends JPanel { // 표시하는 클래스는 JFrame클래스를 상속받음
	
	WindowFrame frame;
	ScheduleFunction schfunction;
	
	public OneViewer(WindowFrame frame, ScheduleFunction schfunction) {
		this.frame = frame;
		this.schfunction = schfunction;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		
		if (schfunction == null) return;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Category");
		model.addColumn("Serial number"); // 배열 내에서 고유 번호 열 추가
		model.addColumn("Year"); // 배열 내에서 연 열 추가
		model.addColumn("Month"); // 배열 내에서 달 열 추가
		model.addColumn("Day"); // 배열 내에서 일 열 추가
		model.addColumn("Hour"); // 배열 내에서 시간 열 추가
		model.addColumn("Minute"); // 배열 내에서 분 열 추가
		model.addColumn("Number of Attendees");
		model.addColumn("Additional Informations");
		
		int i=0; // serial
		for (int j=0; j<schfunction.size(); j++) {
			InputInterface in = schfunction.get(i);
			if (i == schfunction.get(j).getSerial()) {
				i = j;
			}
		}
/*
		Vector row = new Vector();
		InputInterface in = schfunction.get(i);
		row.add(in.getKind());
		row.add(in.getSerial());
		row.add(in.getYear());
		row.add(in.getMonth());
		row.add(in.getDay());
		row.add(in.getHour());
		row.add(in.getMinute());
		row.add(in.getPeoplecount());
		switch (in.getKind()) {
		case Meeting :
			row.add("Meeting Hour : " + in.getSchhour());
			break;
		case Shopping :
			row.add("Shopping Moeny(KRW) : " + in.getMoney());
			break;
		case Studying :
			row.add("Studying Hour : " + in.getSchhour());
			break;
		case Resting :
			row.add("Vacation Day Off : " + in.getSchday());
			break;
		}
		model.addRow(row);
*/		
		JButton button1 = new JButton("Exit"); // execute버튼 추가
		button1.addActionListener(new MenuL(frame));
		panel1.add(button1);
		
		JTable table = new JTable(model); // JTable에 모델을 추가함
		JScrollPane sp = new JScrollPane(table); // 스크롤하는 부분에 테이블을 추가함
		this.add(panel1, BorderLayout.SOUTH);
		
		this.add(sp); // 뷰어에 위 스크롤하는 페이지를 추가함
	}
}
