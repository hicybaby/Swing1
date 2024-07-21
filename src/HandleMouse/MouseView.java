package HandleMouse;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseView extends JFrame {
	private MouseModel mmd;
	private JPanel jpn_mouse;
	private JLabel jlb_position;
	private JLabel jlb_X;
	private JLabel jlb_Y;
	private JLabel jlb_count;
	private JLabel jlb_count_value;
	private JLabel jlb_empty1;
	private JLabel jlb_check_in;
	private JLabel jlb_checkin_value;
	private JLabel jlb_empty2;

	public MouseView() {
		this.mmd = new MouseModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mouse");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// create font
		Font font = new Font("Arial", Font.BOLD, 30);
		// create controler
		MouseOfLisener ml = new MouseOfLisener(this);
		// create JPanel mouse
		jpn_mouse = new JPanel();
		jpn_mouse.setBackground(Color.CYAN);
		jpn_mouse.addMouseListener(ml);
		jpn_mouse.addMouseMotionListener(ml);
		// phan ben ngoai
		// this.addMouseMotionListener(ml);
		// create JPanel info
		JPanel jpn_info = new JPanel();
		jpn_info.setLayout(new GridLayout(3, 3, 10, 10));
		// create JLaybel

		jlb_position = new JLabel("Position: ");
		jlb_position.setFont(font);
		jlb_X = new JLabel("X=");
		jlb_X.setFont(font);
		jlb_Y = new JLabel("Y=");
		jlb_Y.setFont(font);
		jlb_count = new JLabel("Number Of Click: ");
		jlb_count.setFont(font);
		jlb_count_value = new JLabel("n");
		jlb_count_value.setFont(font);
		jlb_empty1 = new JLabel();
		jlb_empty1.setFont(font);
		jlb_check_in = new JLabel("Mouse Is In Component");
		jlb_check_in.setFont(font);
		jlb_checkin_value = new JLabel("no");
		jlb_checkin_value.setFont(font);
		jlb_empty2 = new JLabel();
		jlb_empty2.setFont(font);
		// add jlb vao jpn info
		jpn_info.add(jlb_position);
		jpn_info.add(jlb_X);
		jpn_info.add(jlb_Y);
		jpn_info.add(jlb_count);
		jpn_info.add(jlb_count_value);
		jpn_info.add(jlb_empty1);
		jpn_info.add(jlb_check_in);
		jpn_info.add(jlb_checkin_value);
		jpn_info.add(jlb_empty2);

		// set vao MouseView
		this.setLayout(new BorderLayout());
		this.add(jpn_mouse, BorderLayout.CENTER);
		this.add(jpn_info, BorderLayout.SOUTH);
		this.setVisible(true);

	}

	public void Click() {
		this.mmd.click();
		this.jlb_count_value.setText(this.mmd.getCount() + " ");
	}

	public void Enter() {
		this.mmd.enter();
		this.jlb_checkin_value.setText(this.mmd.getChecking());

	}

	public void Exit() {
		this.mmd.exit();
		this.jlb_checkin_value.setText(this.mmd.getChecking());

	}

	public void update(int x, int y) {
		this.mmd.setX(x);
		this.mmd.setY(y);
		this.jlb_X.setText(this.mmd.getX() + " ");
		this.jlb_Y.setText(this.mmd.getY() + " ");
	}
}
