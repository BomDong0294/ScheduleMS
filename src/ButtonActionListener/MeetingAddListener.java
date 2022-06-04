package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;
import gui.MeetingAdder;
import gui.WindowFrame;

public class MeetingAddListener implements ActionListener {
	
	WindowFrame frame;

	public MeetingAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		MeetingAdder adder = frame.getAdder();
		frame.setupPanel(adder);
	}

}
