package Hien_thi_hinh_anh_va_gan_icon;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class MainView extends JFrame {
	private JMenu menu, submenu;
	JMenuItem m1 , m2, m3, m4;
	private JMenuBar jmnb= new JMenuBar();
	private JButton jbt;
	private JLabel jlb;
	public MainView() {
		this.setTitle("NodePad");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		//set icon for JFrame
		URL url_iconNotePad = MainView.class.getResource("iconNotePad.png");
		Image img_JFrame = Toolkit.getDefaultToolkit().createImage(url_iconNotePad);
		this.setIconImage(img_JFrame);
		//Jmenu Bar
		menu = new JMenu("Menu");
		submenu = new JMenu("Submenu");
		m1 = new JMenuItem("New");
		m1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));
		m2 = new JMenuItem("Save");
		m2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
		m3 = new JMenuItem("Copy");
		m3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_copy.png"))));
		m4 = new JMenuItem("Exit");
		m4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));

		//add jmnbt vao jmn
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(submenu);
		submenu.add(m4);
		jmnb.add(menu);
		
		//JLable 
		jlb = new JLabel();
		jlb.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("main.png"))));

		
		//jbt
		jbt = new JButton("TestButton");
		jbt.setFont(new Font("Arial", Font.BOLD,50));
		jbt.setSize(50,50);
		
		this.setJMenuBar(jmnb);
		this.add(jlb,BorderLayout.CENTER);
		this.add(jbt,BorderLayout.SOUTH);
		
		this.setVisible(true);
		}
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	}
