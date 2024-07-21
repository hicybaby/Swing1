package JComboBox_va_Jlist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class ThucDonView extends JFrame {
	// cac nut hay cac su kien hay tuong tac deu chuyen thanh bien toan cuc
	public ThucDonModel tdmd;
	public JLabel jlb_thongtin;
	public ButtonGroup btgr_monchinh;
	public ArrayList<JCheckBox> listbt_monphu;
	public JComboBox<String> jcbbox_monchinh;
	public JList<String> jlist_monAnPhu;

	public ThucDonView(){
		this.tdmd = new ThucDonModel();
		init();
	}

	private void init() {
		this.setTitle("Thực Đơn");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());

		// tao font chu
		Font font = new Font("Arial", Font.BOLD, 40);
		Font font1 = new Font("Arial", Font.ITALIC, 30);
		Font font2 = new Font("Arial",Font.BOLD,10);

		// tao acction listener
		ActionListener ac = new ThucDonController(this);

		// tao body
		JLabel header = new JLabel("Thuc Don Nha Hang");
		header.setFont(font);

		JPanel jpn_tieude = new JPanel();
		jpn_tieude.add(header);
		this.add(jpn_tieude, BorderLayout.NORTH);

		JPanel jpn_monchinh = new JPanel();
		// bi de len nen ko thay mau nen
		// jpn_monchinh.setBackground(Color.GREEN);
		jpn_monchinh.setLayout(new FlowLayout());
		String[] cacMonAnChinh = new String[] {"Com","Pho","Banh Mi"};
		jcbbox_monchinh= new JComboBox<String>(cacMonAnChinh);
		jcbbox_monchinh.setFont(font1);
		jpn_monchinh.add(jcbbox_monchinh);

		
		JPanel jpn_monphu = new JPanel();
		// jpn_monphu.setBackground(Color.YELLOW);
		jpn_monphu.setLayout(new GridLayout(2, 2));
		String[] cacMonAnPhu = new String[] {"Tra Sua","Banh Trang","Coca","Banh Ngot"};
		jlist_monAnPhu = new JList<String>(cacMonAnPhu);
		jlist_monAnPhu.setFont(font1);
		jpn_monphu.add(jlist_monAnPhu);
	
		JPanel jpn_luachon = new JPanel();
		jpn_luachon.setLayout(new GridLayout(2, 1));
		jpn_luachon.add(jpn_monchinh);
		jpn_luachon.add(jpn_monphu);

		this.add(jpn_luachon, BorderLayout.CENTER);

		JPanel jpn_thanhtoan = new JPanel();
		jpn_thanhtoan.setLayout(new GridLayout(1, 2));
		jlb_thongtin = new JLabel();
		// jpn_thongtin.setForeground(Color.RED);
		jlb_thongtin.setFont(font2);
		JButton jbt_thanhtoan = new JButton("Thanh Toan");
		jbt_thanhtoan.setFont(font1);
		jbt_thanhtoan.addActionListener(ac);
		jpn_thanhtoan.add(jlb_thongtin);
		jpn_thanhtoan.add(jbt_thanhtoan);
		this.add(jpn_thanhtoan, BorderLayout.SOUTH);

		this.setVisible(true);

	}

	public static void main(String[] args) {
		try {
			// UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new ThucDonView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void hienThiKetQua() {
		String ketQua = "Mon chinh: "+ this.tdmd.getLuaChon_monchinh()+
				";Mon phu: "+this.tdmd.getLuaChon_monphu()+
			    ";Tong tien: "+this.tdmd.getTongTien();
		this.jlb_thongtin.setText(ketQua);
	}
}
