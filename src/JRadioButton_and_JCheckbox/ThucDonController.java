package JRadioButton_and_JCheckbox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;

public class ThucDonController implements ActionListener {

	private ThucDonView tdv;

	public ThucDonController(ThucDonView tdv) {
		this.tdv = tdv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String monChinh = "";
		Enumeration<AbstractButton> bt_monchinh = tdv.btgr_monchinh.getElements();
		while (bt_monchinh.hasMoreElements()) {
			AbstractButton b = bt_monchinh.nextElement();
			if (b.isSelected()) {
				monChinh = b.getText();
			}
		}

		String monPhu = "";
		for (AbstractButton b1 : tdv.listbt_monphu) {
			if (b1.isSelected()) {
				monPhu = monPhu + ", " + b1.getText();
			}

		}

		tdv.tdmd.setLuaChon_monchinh(monChinh);
		tdv.tdmd.setLuaChon_monphu(monPhu);
		tdv.tdmd.tinhTongTien();
		tdv.hienThiKetQua();

	}

}
