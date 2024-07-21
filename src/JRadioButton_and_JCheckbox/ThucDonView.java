package JRadioButton_and_JCheckbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class ThucDonView extends JFrame {
	// cac nut hay cac su kien hay tuong tac deu chuyen thanh bien toan cuc
	public ThucDonModel tdmd;
	public JRadioButton jrdobt_com;
	public JRadioButton jrdiobt_pho;
	public JRadioButton jrdiobt_banhmi;
	public JCheckBox jcb_trasua;
	public JCheckBox jcb_banhtrang;
	public JCheckBox jcb_coca;
	public JCheckBox jcb_banhngot;
	public JLabel jlb_thongtin;
	public ButtonGroup btgr_monchinh;
	public ArrayList<JCheckBox> listbt_monphu;

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
		jpn_monchinh.setLayout(new GridLayout(1, 3));
		jrdobt_com = new JRadioButton("Com");
		jrdobt_com.setFont(font1);
		jrdiobt_pho = new JRadioButton("Pho");
		jrdiobt_pho.setFont(font1);
		jrdiobt_banhmi = new JRadioButton("Banh Mi");
		jrdiobt_banhmi.setFont(font1);

		btgr_monchinh = new ButtonGroup();
		btgr_monchinh.add(jrdobt_com);
		btgr_monchinh.add(jrdiobt_pho);
		btgr_monchinh.add(jrdiobt_banhmi);
		jpn_monchinh.add(jrdobt_com);
		jpn_monchinh.add(jrdiobt_pho);
		jpn_monchinh.add(jrdiobt_banhmi);

		JPanel jpn_monphu = new JPanel();
		// jpn_monphu.setBackground(Color.YELLOW);
		jpn_monphu.setLayout(new GridLayout(2, 2));
		jcb_trasua = new JCheckBox("Tra Sua");
		jcb_trasua.setFont(font1);
		jcb_banhtrang = new JCheckBox("Banh Trang");
		jcb_banhtrang.setFont(font1);
		jcb_coca = new JCheckBox("Coca");
		jcb_coca.setFont(font1);
		jcb_banhngot = new JCheckBox("Banh Ngot");
		jcb_banhngot.setFont(font1);
	    listbt_monphu = new ArrayList<JCheckBox>();
		listbt_monphu.add(jcb_trasua);
		listbt_monphu.add(jcb_banhtrang);
		listbt_monphu.add(jcb_coca);
		listbt_monphu.add(jcb_banhngot);

		jpn_monphu.add(jcb_trasua);
		jpn_monphu.add(jcb_banhtrang);
		jpn_monphu.add(jcb_coca);
		jpn_monphu.add(jcb_banhngot);

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
