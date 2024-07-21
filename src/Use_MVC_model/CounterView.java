package Use_MVC_model;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterView extends JFrame {
	private CounterModel ctmd;
	private JButton jbt_up;
	private JButton jbt_down;
	private JLabel jlb_value;

	public CounterView() {
		this.ctmd = new CounterModel();
		this.init();
		this.setVisible(true);
	}

	/**
	 * ham khoi tao
	 */
	public void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		this.setLocationRelativeTo(null);// can giua

		jbt_up = new JButton("UP");
		jbt_up.addActionListener(ac);

		jbt_down = new JButton("DOWN");
		jbt_down.addActionListener(ac);

		jlb_value = new JLabel(this.ctmd.getValue() + "", JLabel.CENTER);
		JPanel jpn = new JPanel();
		jpn.setLayout(new BorderLayout());
		jpn.add(jbt_up, BorderLayout.WEST);
		jpn.add(jlb_value, BorderLayout.CENTER);
		jpn.add(jbt_down, BorderLayout.EAST);

		this.setLayout(new BorderLayout());
		this.add(jpn, BorderLayout.CENTER);
	}

	public void Decrement() {
		this.ctmd.decrement();
		this.jlb_value.setText(this.ctmd.getValue() + "");
	}

	public void Increment() {
		this.ctmd.increment();
		this.jlb_value.setText(this.ctmd.getValue() + "");
	}

}
