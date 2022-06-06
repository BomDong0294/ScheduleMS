package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.WindowFrame;
import guiSaver.DeleteS;

public class DeleteL implements ActionListener {
	
	WindowFrame frame;

	public DeleteL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		DeleteS delete = frame.getDeletes();
		frame.setupPanel(delete);
	}

}
