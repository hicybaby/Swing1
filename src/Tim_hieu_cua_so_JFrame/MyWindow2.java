package Tim_hieu_cua_so_JFrame;

import javax.swing.JFrame;

public class MyWindow2 extends JFrame{
	public  MyWindow2() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void ShowIt() {
		this.setVisible(true);
	}
	public void ShowIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}
	public void ShowIt(int low,int height,String title) {
		this.setTitle(title);
		this.setSize(low, height);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		MyWindow2 mw= new MyWindow2();
		mw.ShowIt(400,300,"HelloWorld");
	}


}
