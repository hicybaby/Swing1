package Use_MVC_model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//la lop kiem soat ,xu li chuc nang cua button
public class CounterListener implements ActionListener {
	private CounterView ctv;

	// this is constructor
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("ban da nhan nut");
		String str = e.getActionCommand();
		System.out.println("ban da nhan nut: " + str);
		if (str == "UP") {
			this.ctv.Increment();
		} else {
			this.ctv.Decrement();
		}
	}

}
