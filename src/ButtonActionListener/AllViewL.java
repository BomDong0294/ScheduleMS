package ButtonActionListener;

import java.awt.event.*;
import java.io.*;
import commander.ScheduleFunction;
import gui.*;

public class AllViewL implements ActionListener {
	
	WindowFrame frame;

	public AllViewL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	
	public void actionPerformed(ActionEvent e) {
		ScheduleFunction schfunction = getObject("ScheduleFunction.ser");
		AllViewer allviewer = frame.getViewer();
		allviewer.setSchfunction(schfunction);
		frame.getContentPane().removeAll();
		frame.getContentPane().add(allviewer);
		frame.revalidate();
		frame.repaint();
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
