package Bo_cuc_va_thanh_phan_JFrame;

import java.awt.FlowLayout;
import java.security.DomainCombiner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DinhDangButtonFlow extends JFrame {
	public DinhDangButtonFlow() {
		this.setTitle("Vi_Du_FlowLayout"); // các button theo dòng trái sang phải
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);

		// Set Layout
		FlowLayout fowlayout = new FlowLayout();
		FlowLayout fowlayout2 = new FlowLayout(FlowLayout.LEFT);
		FlowLayout fowlayout3 = new FlowLayout(FlowLayout.CENTER,50,50);
		//this.setLayout(fowlayout);
		//this.setLayout(fowlayout2);
		this.setLayout(fowlayout3);
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");

		// add thanh phan component
		this.add(jbt1);
		this.add(jbt2);
		this.add(jbt3);
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new DinhDangButtonFlow();
		}

}
