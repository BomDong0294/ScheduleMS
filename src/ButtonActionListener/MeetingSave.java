package ButtonActionListener;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import data.*;
import function.ScheduleMethod;
import gui.*;

public class MeetingSave implements ActionListener {
	Scanner input = new Scanner(System.in);
	WindowFrame frame;
	ScheduleMethod schfunction;
	InputInterface scheduleInput;
	ArrayList<InputInterface> schedule_list = new ArrayList<InputInterface>();

	public MeetingSave(WindowFrame frame, ScheduleMethod schfunction) {
		this.frame = frame;
		this.schfunction = schfunction;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingAdder adder = new MeetingAdder(frame, schfunction);
		MeetingSaver saver = frame.getMeetingsaver();
		String ssnum = adder.fieldSerial.getText();
		String syear = adder.fieldYear.getText();
		String smon = adder.fieldMonth.getText();
		String sday = adder.fieldDay.getText();
		String shour = adder.fieldHour.getText();
		String smin = adder.fieldMinute.getText();
		String speoplecount = adder.fieldPeoplecount.getText();
		String sschhour = adder.fieldSchhour.getText();
		
		Kind kind = Kind.Meeting;
		int snum = Integer.parseInt(ssnum);
		int year = Integer.parseInt(syear);
		int mon = Integer.parseInt(smon);
		int day = Integer.parseInt(sday);
		int hour = Integer.parseInt(shour);
		int min = Integer.parseInt(smin);
		int peoplecount = Integer.parseInt(speoplecount);
		int schhour = Integer.parseInt(sschhour);
		
		scheduleInput = new Meeting(kind, snum, year, mon, day, hour, min, peoplecount, schhour); 
		scheduleInput.getScheduleInput(input);
		schedule_list.add(scheduleInput); // 추가된 메서드를 리스트에 추가
		
		frame.setupPanel(saver);
	}

}
