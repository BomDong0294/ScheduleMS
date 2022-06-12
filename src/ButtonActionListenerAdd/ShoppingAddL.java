package ButtonActionListenerAdd;
import java.awt.event.*;
import javax.swing.*;

import gui.WindowFrame;
import guiAdder.MeetingAdder;
import guiAdder.ShoppingAdder;

public class ShoppingAddL implements ActionListener {
	
	WindowFrame frame;

	public ShoppingAddL(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ShoppingAdder shopadder = frame.getShoppingadder();
		frame.setupPanel(shopadder);
	}

}
