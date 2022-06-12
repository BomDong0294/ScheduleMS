package ButtonActionListener;

import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.*;

import commander.ScheduleFunction;
import data.InputInterface;
import gui.WindowFrame;
import guiSaver.DeleteS;

public class DeleteL implements ActionListener {
	WindowFrame frame;
	JTextField fieldSerial;
	ScheduleFunction schfunction;
	
	public DeleteL(WindowFrame frame, JTextField fieldSerial, ScheduleFunction schfunction) {
		super();
		this.frame = frame;
		this.fieldSerial = fieldSerial;
		this.schfunction = schfunction;
	}

	public DeleteL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		DeleteS delete = frame.getDeletes();
		frame.setupPanel(delete);
		
		schfunction = getObject("ScheduleMethod.ser");
		int serial = Integer.parseInt(fieldSerial.getText()); 
		for (int i = 0; i < schfunction.size(); i++) {
			InputInterface scheduleInput = schfunction.get(i);
			int index = scheduleInput.getSerial();
			if (index == serial) {
				schfunction.removefromSchedules(index, serial);
				break;
			}
		}
		return;
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
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // 예외 처리
		}
		return schfunction;
	}
}
