package Tim_hieu_cua_so_JFrame;

import javax.swing.JFrame;

public class MyWindow {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		//Gan ten
		jf.setTitle("Vi Du JFrame");
		//Gan kich thuoc
		jf.setSize(600,400);
		//Gan vi tri hien thi
		jf.setLocation(300, 300);
		//thoat khoi cua so khi dong JFrame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//cho phep hien thi
		jf.setVisible(false);

	}

}
