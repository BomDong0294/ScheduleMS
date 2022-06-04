package ButtonActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.AdderMenu;
import gui.WindowFrame;

public class AddmenuListener implements ActionListener {
	
	WindowFrame frame;
	
	public AddmenuListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		AdderMenu addermenu = frame.getAdderMenu();
		frame.setupPanel(addermenu);
	}

}
