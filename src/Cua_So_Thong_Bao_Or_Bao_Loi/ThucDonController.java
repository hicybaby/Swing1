package Cua_So_Thong_Bao_Or_Bao_Loi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
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
		
		//hien thi thong bao 
		String soTien_chuoi =(String)JOptionPane.showInputDialog(
				tdv,
				tdv.jlb_thongtin.getText()
				+"\nNhap so tien: ",
				"Thong Bao",
				JOptionPane.PLAIN_MESSAGE);
		try {
			double soTien = Double.valueOf(soTien_chuoi);
			JOptionPane.showMessageDialog(tdv,
					"Thoi tien lai cho khach: "+(soTien -tdv.tdmd.getTongTien()),
					"Infor",
					JOptionPane.INFORMATION_MESSAGE);
			
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(tdv,
					"Nhap Du Lieu Sai",
					"Erorr",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
