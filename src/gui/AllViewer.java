package gui;

import java.awt.BorderLayout;
import java.io.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import ButtonActionListener.MenuL;
import commander.ScheduleFunction;
import data.InputInterface;

public class AllViewer extends JPanel { // 표시하는 클래스는 JFrame클래스를 상속받음
	
	WindowFrame frame;
	ScheduleFunction schfunction = getObject("ScheduleFunction.ser");
	
	public ScheduleFunction getSchfunction() {
		return schfunction;
	}

	public void setSchfunction(ScheduleFunction schfunction) {
		this.schfunction = schfunction;
		this.removeAll();
		
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
		
		for (int i=0; i < schfunction.size(); i++) {
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
			
		}
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public AllViewer(WindowFrame frame, ScheduleFunction schfunction) {
		this.frame = frame;
		this.schfunction = schfunction;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		
		if (schfunction != null) {
			System.out.println("*** Stored count of Information : " + schfunction.size() + " ***");
		}
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
		
		for (int i=0; i < schfunction.size(); i++) {
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
		}
		JButton button1 = new JButton("Exit"); // execute버튼 추가
		button1.addActionListener(new MenuL(frame));
		panel1.add(button1);
		
		JTable table = new JTable(model); // JTable에 모델을 추가함
		JScrollPane sp = new JScrollPane(table); // 스크롤하는 부분에 테이블을 추가함
		this.add(panel1, BorderLayout.SOUTH);
		
		this.add(sp); // 뷰어에 위 스크롤하는 페이지를 추가함
	}
	
	public static ScheduleFunction getObject(String filename) {
		ScheduleFunction schfunction = null;
		
		try { // 파일로 받아들이고 readObject()를 통해서 객체를 받아옴.
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			schfunction = (ScheduleFunction)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return schfunction; // 예외처리 및 파일을 받지 못하면 객체 반환
		} catch (IOException e) {
			e.printStackTrace(); // 예외 처리
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 예외 처리
		}
		return schfunction;
	}
}
