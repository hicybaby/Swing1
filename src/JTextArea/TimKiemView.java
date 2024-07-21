package JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TimKiemView extends JFrame {
	private TimKiemModel tkmd;
	private JTextArea jta_vanban;
	private JTextField jtf_tukhoa;
	private JLabel jlb_ketqua;

	public TimKiemView() {
		this.tkmd = new TimKiemModel();
		this.init();
	}

	private void init() {
		this.setTitle("Tim Kiem");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Font font = new Font("Arial", Font.BOLD, 30);
		// center
		JLabel jlb_vanban = new JLabel("Van Ban");
		jlb_vanban.setFont(font);
		// tao ra mien van ban
		jta_vanban = new JTextArea(100, 100);
		jta_vanban.setFont(font);
		
		//tao JScrollPane
		JScrollPane jscp = new JScrollPane(jta_vanban,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//jscp.setViewportView(jta_vanban);

		

		// footer
		ActionListener ac = new TimKiemLisener(this);

		JLabel jlb_tukhoa = new JLabel("Tu Khoa");
		jtf_tukhoa = new JTextField();
		jtf_tukhoa.setFont(font);

		JButton jbt_thongke = new JButton("Thong Ke");
		jbt_thongke.setFont(font);
		jbt_thongke.addActionListener(ac);
		jbt_thongke.setBackground(Color.GREEN);
		
		jlb_ketqua = new JLabel();
		jlb_ketqua.setFont(font);
		jlb_ketqua.setBackground(Color.YELLOW);
		jlb_ketqua.setOpaque(true);
		
		JPanel jpn_footer = new JPanel();
		jpn_footer.setLayout(new GridLayout(2, 2,10,10));
		jpn_footer.add(jlb_tukhoa);
		jpn_footer.add(jtf_tukhoa);
		jpn_footer.add(jbt_thongke);
		jpn_footer.add(jlb_ketqua);


		this.setLayout(new BorderLayout());
		this.add(jlb_vanban, BorderLayout.NORTH);
		//jscp chua jta
		this.add(jscp,BorderLayout.CENTER);
		this.add(jpn_footer, BorderLayout.SOUTH);

		this.setVisible(true);

	}
	public void TimKiem() {
		this.tkmd.setVanban(jta_vanban.getText());
		this.tkmd.setTukhoa(jtf_tukhoa.getText());
		this.tkmd.timKiem();
		this.jlb_ketqua.setText(this.tkmd.getKetqua());
	}

}
