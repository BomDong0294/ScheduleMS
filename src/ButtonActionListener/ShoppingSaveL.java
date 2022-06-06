package ButtonActionListener;

import java.awt.event.*;
import javax.swing.*;
import gui.*;
import guiSaver.ShoppingS;

public class ShoppingSaveL implements ActionListener {
	
	WindowFrame frame;

	public ShoppingSaveL(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ShoppingS saver = frame.getShoppingsaver();
		frame.setupPanel(saver);
	}

}
