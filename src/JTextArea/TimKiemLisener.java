package JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemLisener implements ActionListener{
	private TimKiemView tkv;

	public TimKiemLisener(TimKiemView tkv) {
		this.tkv = tkv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.tkv.TimKiem();
		
	}
	

}
