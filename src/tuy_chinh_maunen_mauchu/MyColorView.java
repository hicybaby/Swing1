package tuy_chinh_maunen_mauchu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//view
public class MyColorView extends JFrame {
	private MycolorModel mcm;
	private JLabel jlb;

	public MyColorView() {
		this.mcm = new MycolorModel();
		this.init();
	}

	private void init() {
		this.setTitle("MyColor");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);// can giua
		ActionListener ac = new MyColorLisener(this);

		jlb = new JLabel("Text-------");
		Font font1= new Font("Arial",Font.BOLD,100);
		jlb.setFont(font1);
		JPanel jpn = new JPanel();
		jpn.setLayout(new GridLayout(2, 3));
		Font font = new Font("Arial", Font.BOLD, 20);
		// set color text
		JButton jbt_text_red = new JButton("Red Text");
		jbt_text_red.setFont(font);
		jbt_text_red.setForeground(Color.RED);
		jbt_text_red.addActionListener(ac);

		JButton jbt_text_green = new JButton("Green Text");
		jbt_text_red.setFont(font);
		jbt_text_red.setForeground(Color.GREEN);
		jbt_text_green.addActionListener(ac);

		JButton jbt_text_yellow = new JButton("Yellow Text");
		jbt_text_red.setFont(font);
		jbt_text_red.setForeground(Color.YELLOW);
		jbt_text_yellow.addActionListener(ac);
		// set color background
		JButton jbt_background_red = new JButton("Background Red");
		jbt_background_red.setFont(font);
		jbt_background_red.setBackground(Color.RED);
		// dat mau vien
		jbt_background_red.setOpaque(true);
		//jbt_backgound_red.setBorderPainted(false);
		jbt_background_red.addActionListener(ac);

		JButton jbt_background_green = new JButton("Background Green");
		jbt_background_green.setFont(font);
		jbt_background_green.setBackground(Color.GREEN);
		jbt_background_green.setOpaque(true);
		//jbt_background_green.setBorderPainted(true);
		jbt_background_green.addActionListener(ac);

		JButton jbt_background_yellow = new JButton("Background Yellow");
		jbt_background_yellow.setFont(font);
		jbt_background_yellow.setBackground(Color.YELLOW);
		jbt_background_yellow.setOpaque(true);
		//jbt_backgound_yellow.setBorderPainted(false);
		jbt_background_yellow.addActionListener(ac);
		
//		JButton jbt_background_yellow = new JButton("Background Yellow");
//		jbt_background_yellow.setFont(font);
//		jbt_background_yellow.setBackground(Color.YELLOW);
//		jbt_background_yellow.setOpaque(true);
//		//jbt_background_green.setBorderPainted(true);
//		jbt_background_yellow.addActionListener(ac);
		// dua cac nut vao jpanal
		jpn.add(jbt_text_red);
		jpn.add(jbt_text_green);
		jpn.add(jbt_text_yellow);
		jpn.add(jbt_background_red);
		jpn.add(jbt_background_green);
		jpn.add(jbt_background_yellow);

		// add vao jlabel
		this.setLayout(new BorderLayout());
		// dat title label tren cung
		this.add(jlb, BorderLayout.NORTH);
		// dua cac button trong jpn ra giua
		this.add(jpn, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.jlb.setForeground(color);
		
	}
	
	public void changeBackgroundColor(Color color) {
		this.jlb.setBackground(color);
		this.jlb.setOpaque(true);
		//this.jlb.setBorderPainted(false);
		
	}

}
