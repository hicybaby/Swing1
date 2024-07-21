package JComboBox_va_Jlist;

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
		// chon mon an chinh
		String monChinh = tdv.jcbbox_monchinh.getSelectedItem().toString();

		String monPhu = "";
		Object[] luaChonMonPhu = tdv.jlist_monAnPhu.getSelectedValues();
		for (Object object : luaChonMonPhu) {
			monPhu = monPhu + object.toString();
		}

		tdv.tdmd.setLuaChon_monchinh(monChinh);
		tdv.tdmd.setLuaChon_monphu(monPhu);
		tdv.tdmd.tinhTongTien();
		tdv.hienThiKetQua();

	}

}
