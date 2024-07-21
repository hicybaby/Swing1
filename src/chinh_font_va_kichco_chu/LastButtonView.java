package chinh_font_va_kichco_chu;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

//view
public class LastButtonView extends JFrame {
	private LastButtonModel lastbt_md;
	private JLabel jlb;

	public LastButtonView() {

		this.lastbt_md = new LastButtonModel();
		this.init();

	}

	private void init() {
		this.setTitle("Lasr Button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);

		JPanel jpn_center = new JPanel();
		jpn_center.setLayout(new GridLayout(2, 2));
		//tao lisener
		ActionListener ac = new LastButtonLisener(this);

		// tao font chu
		// ten font,kieu chu ,size chu
		Font font = new Font("Arial", Font.BOLD, 20);
		JButton jbt1 = new JButton("1");
		// set font chu
		jbt1.setFont(font);
		jbt1.addActionListener(ac);
		JButton jbt2 = new JButton("2");
		jbt2.setFont(font);
		jbt2.addActionListener(ac);
		JButton jbt3 = new JButton("3");
		jbt3.setFont(font);
		jbt3.addActionListener(ac);
		JButton jbt4 = new JButton("4");
		jbt4.setFont(font);
		jbt4.addActionListener(ac);


		jpn_center.add(jbt1);
		jpn_center.add(jbt2);
		jpn_center.add(jbt3);
		jpn_center.add(jbt4);
		JPanel jpn_footer = new JPanel();
		jlb = new JLabel("-----");
		jlb.setFont(font);
		jpn_footer.add(jlb);

		this.setLayout(new BorderLayout());
		this.add(jpn_center, BorderLayout.CENTER);
		this.add(jpn_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void changeTo_1() {
		this.lastbt_md.setValue_1();
		jlb.setText("Last Button: " + this.lastbt_md.getValue() + "");
	}

	public void changeTo_2() {
		this.lastbt_md.setValue_2();
		jlb.setText("Last Button: " + this.lastbt_md.getValue() + "");
	}

	public void changeTo_3() {
		this.lastbt_md.setValue_3();
		jlb.setText("Last Button: " + this.lastbt_md.getValue() + "");
	}

	public void changeTo_4() {
		this.lastbt_md.setValue_4();
		jlb.setText("Last Button: " + this.lastbt_md.getValue() + "");
	}

}
