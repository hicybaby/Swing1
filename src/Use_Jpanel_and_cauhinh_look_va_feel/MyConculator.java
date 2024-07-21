package Use_Jpanel_and_cauhinh_look_va_feel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyConculator extends JFrame{
	public MyConculator() {
		this.setTitle("My Conculator");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField jTextFeel = new JTextField();
		JPanel jpnHead = new JPanel(); //jpn thu nhat de tao o trong nhap du lieu thuoc kieu borderlayout
		jpnHead.setLayout(new BorderLayout());
		jpnHead.add(jTextFeel,BorderLayout.CENTER);
		
		JButton jbt_0 = new JButton("0");
		JButton jbt_1 = new JButton("1");
		JButton jbt_2 = new JButton("2");
		JButton jbt_3 = new JButton("3");
		JButton jbt_4 = new JButton("4");
		JButton jbt_5 = new JButton("5");
		JButton jbt_6 = new JButton("6");
		JButton jbt_7 = new JButton("7");
		JButton jbt_8 = new JButton("8");
		JButton jbt_9 = new JButton("9");
		JButton jbt_cong = new JButton("+");
		JButton jbt_tru = new JButton("-");
		JButton jbt_nhan = new JButton("*");
		JButton jbt_chia = new JButton("/");
		JButton jbt_bang = new JButton("=");
		
		JPanel jpn_button = new JPanel();//jpn thu 2 de add jbt vao thanh nhom khac thuoc kieu gridlayout
		jpn_button.setLayout(new GridLayout(5,3));
		this.setLayout(new BorderLayout());
		jpn_button.add(jbt_0);
		jpn_button.add(jbt_1);
		jpn_button.add(jbt_2);
		jpn_button.add(jbt_3);
		jpn_button.add(jbt_4);
		jpn_button.add(jbt_5);
		jpn_button.add(jbt_6);
		jpn_button.add(jbt_7);
		jpn_button.add(jbt_8);
		jpn_button.add(jbt_9);
		jpn_button.add(jbt_cong);
		jpn_button.add(jbt_tru);
		jpn_button.add(jbt_nhan);
		jpn_button.add(jbt_chia);
		jpn_button.add(jbt_bang);
		this.setLayout(new BorderLayout());
		this.add(jpnHead,BorderLayout.NORTH);
		this.add(jpn_button,BorderLayout.CENTER);
		
		this.setVisible(true);
				
	}
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyConculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
