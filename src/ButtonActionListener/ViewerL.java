package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.Editor;
import gui.OneViewer;
import gui.WindowFrame;

public class ViewerL implements ActionListener {
	
	WindowFrame frame;

	public ViewerL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		OneViewer oneviewer = frame.getOneviewer();
		frame.setupPanel(oneviewer);
	}

}
