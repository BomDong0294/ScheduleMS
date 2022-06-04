package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;

import gui.AllViewer;
import gui.WindowFrame;

public class AllViewListener implements ActionListener {
	
	WindowFrame frame;

	public AllViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		AllViewer viewer = frame.getViewer();
		frame.setupPanel(viewer);
	}

}
