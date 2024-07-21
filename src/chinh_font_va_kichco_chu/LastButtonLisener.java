package chinh_font_va_kichco_chu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//controler
public class LastButtonLisener implements ActionListener {
	private LastButtonView lbtv;

	public LastButtonLisener(LastButtonView lbtv) {
		this.lbtv = lbtv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src =e.getActionCommand();
		if (src.equals("1")) {
			this.lbtv.changeTo_1();
		}else if (src.equals("2")) {
			this.lbtv.changeTo_2();
		}else if (src.equals("3")) {
			this.lbtv.changeTo_3();
		}else if (src.equals("4")) {
			this.lbtv.changeTo_4();
		}
	}

}
