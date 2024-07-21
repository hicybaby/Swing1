package JComboBox_va_Jlist;

import java.util.StringTokenizer;

public class ThucDonModel {
	private String luaChon_monchinh;
	private String luaChon_monphu;
	private double tongTien;

	public ThucDonModel() {
		this.luaChon_monchinh = "";
		this.luaChon_monphu = "";
		this.tongTien = 0;
	}

	
	public String getLuaChon_monchinh() {
		return luaChon_monchinh;
	}


	public void setLuaChon_monchinh(String luaChon_monchinh) {
		this.luaChon_monchinh = luaChon_monchinh;
	}


	public String getLuaChon_monphu() {
		return luaChon_monphu;
	}


	public void setLuaChon_monphu(String luaChon_monphu) {
		this.luaChon_monphu = luaChon_monphu;
	}


	public double getTongTien() {
		return tongTien;
	}


	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}


	public void tinhTongTien() {
		this.tongTien = 0;
		if (luaChon_monchinh.equals("Com")) {
			tongTien += 25000;
		}
		if (luaChon_monchinh.equals("Pho")) {
			tongTien += 30000;
		}
		if (luaChon_monchinh.equals("Banh Mi")) {
			tongTien += 20000;
		}
		StringTokenizer stk = new StringTokenizer(this.luaChon_monphu, ",");
		while (stk.hasMoreElements()) {
			String monphu = stk.nextToken();
			monphu = monphu.trim();
			if (monphu.equals("Tra Sua")) {
				tongTien += 30000;
			}
			if (monphu.equals("Banh Trang")) {
				tongTien += 15000;
			}
			if (monphu.equals("Coca")) {
				tongTien += 10000;
			}
			if (monphu.equals("Banh Ngot")) {
				tongTien += 20000;
			}
		}

	}

}
