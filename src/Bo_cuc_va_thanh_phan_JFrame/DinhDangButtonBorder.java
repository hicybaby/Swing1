package Bo_cuc_va_thanh_phan_JFrame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DinhDangButtonBorder extends JFrame {
	public DinhDangButtonBorder() {
		this.setTitle("Vi_Du_BorderLayout"); // các button theo dòng trái sang phải
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

		// Set Layout
		// chi co 2 cach
		BorderLayout borderlayout = new BorderLayout();
		BorderLayout borderlayout2 = new BorderLayout();
		// this.setLayout(fowlayout);
		this.setLayout(borderlayout2);
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");
		JButton jbt4 = new JButton("4");
		JButton jbt5 = new JButton("5");

		// add thanh phan component
		this.add(jbt1, BorderLayout.NORTH);
		this.add(jbt2, BorderLayout.SOUTH);
		this.add(jbt3, BorderLayout.EAST);
		this.add(jbt4, BorderLayout.WEST);
		this.add(jbt5, BorderLayout.CENTER);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new DinhDangButtonBorder();
	}

}
