package Bo_cuc_va_thanh_phan_JFrame;

import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DinhDangButtonGrid extends JFrame{
	public DinhDangButtonGrid() {
		this.setTitle("Vi_Du_GridLayput"); // các button theo dòng trái sang phải
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// căn giữa cửa sổ chương trình
		this.setLocationRelativeTo(null);
	
		// Set Layout
		GridLayout gridlayout = new GridLayout();
		GridLayout gridlayout2 = new GridLayout(4,4);//4 dòng 4 cột 
     	GridLayout gridlayout3 = new GridLayout(4,4,25,25); //4 d 4 c cách nhau 25px
//		//this.setLayout(fowlayout);
		this.setLayout(gridlayout2);
//		this.setLayout(gridlayout3);
//		JButton jbt1 = new JButton("1");
//		JButton jbt2 = new JButton("2");
//		JButton jbt3 = new JButton("3");
//
//		// add thanh phan component
//		this.add(jbt1);
//		this.add(jbt2);
//		this.add(jbt3);
		for (int i = 0; i < 16; i++) {
			JButton jbt =new JButton(i+"");//số nguyên nên cộng thêm khoảng trắng để ra chuỗi
			this.add(jbt);
			this.setVisible(true);//luôn để ở cuối
			
		}
	}
		
	public static void main(String[] args) {
		new DinhDangButtonGrid();
		}

	}


