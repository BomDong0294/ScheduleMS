package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;
import gui.RestingAdder;
import gui.WindowFrame;

public class RestingAddListener implements ActionListener {
	
	WindowFrame frame;

	public RestingAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		RestingAdder restadder = frame.getRestingadder();
		frame.setupPanel(restadder);
	}

}
