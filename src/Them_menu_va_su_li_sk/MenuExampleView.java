package Them_menu_va_su_li_sk;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MenuExampleView extends JFrame{

	private JLabel jlb;
	JPopupMenu jpumn;
	private JToolBar jtb;

	public MenuExampleView() {
		this.setTitle("Menu Example");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		//tao action listener
		MenuExampleControler mnc = new MenuExampleControler(this);
		//tao thanh menu
		JMenuBar jmnb = new JMenuBar();
		//tao mot menu
		JMenu jmn_file = new JMenu("File");
		JMenuItem jmnit_new = new JMenuItem("New",KeyEvent.VK_N);
		
		//nhan voi to hop phim
		jmnit_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmnit_new.addActionListener(mnc);
		JMenuItem jmnit_open= new JMenuItem("Open",KeyEvent.VK_O);
		jmnit_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
		jmnit_open.addActionListener(mnc);
		JMenuItem jmnit_exit= new JMenuItem("Exit",KeyEvent.VK_X);
		jmnit_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
		jmnit_exit.addActionListener(mnc);
		
		//add Jmenuitem
		jmn_file.add(jmnit_new);
		jmn_file.addSeparator();
		jmn_file.add(jmnit_open);
		jmn_file.addSeparator();
		jmn_file.add(jmnit_exit);
		
		//tao Menu View
		JMenu jmn_view = new JMenu("View");
		JCheckBoxMenuItem jcbmnit_toolBar = new JCheckBoxMenuItem("ToolBar");
		jcbmnit_toolBar.addActionListener(mnc);
		jmn_view.add(jcbmnit_toolBar);
		
		JMenu jmn_help = new JMenu("Help");
		jmn_help.setMnemonic(KeyEvent.VK_L);
		JMenuItem jmnit_welcome = new JMenuItem("Welcome");
		
		//nhan voi mot phim
		jmnit_welcome.setMnemonic(KeyEvent.VK_W);
		jmnit_welcome.addActionListener(mnc);
		jmn_help.add(jmnit_welcome);
		
		//add cac doi tuong vao JmenuBar
		jmnb.add(jmn_file);
		jmnb.add(jmn_view);
		jmnb.add(jmn_help);
		
		//them thanh menu vao chuong trinh
		this.setJMenuBar(jmnb);
		
		//tao jtoolbar
		jtb = new JToolBar();
		JButton jbt_Undo = new JButton("Undo");
		jbt_Undo.addActionListener(mnc);
		//ghi chu chuc nang cua button
		jbt_Undo.setToolTipText("Nhan vao day de khoi phuc thao tac vua roi");
		JButton jbt_Redo = new JButton("Redo");
		jbt_Redo.addActionListener(mnc);
		JButton jbt_Coppy = new JButton("Coppy");
		jbt_Coppy.addActionListener(mnc);
		JButton jbt_Paste = new JButton("Paste");
		jbt_Paste.addActionListener(mnc);
		JButton jbt_Cut = new JButton("Cut");
		jbt_Cut.addActionListener(mnc);
		
		//add cac Jbutton vao JToolBar
		jtb.add(jbt_Undo);
		jtb.add(jbt_Redo);
		jtb.add(jbt_Coppy);
		jtb.add(jbt_Paste);
		jtb.add(jbt_Cut);
		
		//them sk phai chuot
		MouseListener mlsn= new MenuExampleMouseControler(this);
		this.addMouseListener(mlsn);
		
		//tao menu chuot phai
	     jpumn= new JPopupMenu();
	     JMenu jmnpu_font = new JMenu("Font");
	     JMenuItem jmnit_Type = new JMenuItem("Type");
	     jmnit_Type.addActionListener(mnc);
	     JMenuItem jmnit_Size = new JMenuItem("Size");
	     jmnit_Size.addActionListener(mnc);
	     jmnpu_font.add(jmnit_Type);
	     jmnpu_font.add(jmnit_Size);
	     
	     JMenuItem jmnit_Cut = new JMenuItem("Cut");
	     jmnit_Cut.addActionListener(mnc);
	     JMenuItem jmnit_Coppy = new JMenuItem("Coppy");
	     jmnit_Coppy.addActionListener(mnc);
	     JMenuItem jmnit_Paste = new JMenuItem("Paste");
	     jmnit_Paste.addActionListener(mnc);
	     
	     jpumn.add(jmnpu_font);
	     jpumn.addSeparator();
	     jpumn.add(jmnit_Cut);
	     jpumn.add(jmnit_Coppy);
	     jpumn.add(jmnit_Paste);
	     
	     this.add(jpumn);
		
		//this.add(jtb,BorderLayout.NORTH);
		
		//tao lable hien thi
		Font font = new Font("Arial",Font.BOLD,50);
		jlb = new JLabel();
		
		this.add(jlb,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public void setTextJLabel(String s) {
		this.jlb.setText(s);
		
	}
	public void enableJtoolBar() {
		this.add(jtb,BorderLayout.NORTH);
		this.refresh();
	}
	public void disableJtoolBar() {
		this.remove(jtb);
		this.refresh();
	}
	//to refresh page
	public void refresh() {
		this.pack();
		this.setSize(500,500);
	}

}
