package Ve_va_hien_thi_cac_hinh_anh;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DrawExampleView extends JFrame{

	public DrawExampleView() {
		this.setTitle("DrawExample");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		JPanelDraw jpndr = new JPanelDraw();
		this.setLayout(new BorderLayout());
		this.add(jpndr,BorderLayout.CENTER);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new DrawExampleView();
	}

}
