package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.Editor;
import gui.WindowFrame;

public class EditorL implements ActionListener {
	
	WindowFrame frame;

	public EditorL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		Editor editor = frame.getEditor();
		frame.setupPanel(editor);
	}

}
