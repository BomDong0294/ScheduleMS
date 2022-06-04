package ButtonActionListener;
import java.awt.event.*;
import javax.swing.*;
import gui.MeetingAdder;
import gui.ShoppingAdder;
import gui.WindowFrame;

public class ShoppingAddListener implements ActionListener {
	
	WindowFrame frame;

	public ShoppingAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		ShoppingAdder shopadder = frame.getShoppingadder();
		frame.setupPanel(shopadder);
	}

}
