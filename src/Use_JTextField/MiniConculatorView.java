package Use_JTextField;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiniConculatorView extends JFrame {
	private MiniConculatorModel mcmd;
	JTextField jtf_firstvalue;
	JTextField jtf_secondtvalue;
	JTextField jtf_answervalue;

	public MiniConculatorView() {
		this.mcmd = new MiniConculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("MiniConculator");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Font font1 = new Font("Arial", Font.BOLD, 30);
		// tao JLabel cho o First Value
		JLabel jlb_firstvalue = new JLabel("1ST Value");
		jlb_firstvalue.setFont(font1);
		// tao JLabel cho o Second Value
		JLabel jlb_secondvalue = new JLabel("2ND Value");
		jlb_firstvalue.setFont(font1);
		// tao JLabel cho o Answer Value
		JLabel jlb_answervalue = new JLabel("Answer Value");
		jlb_firstvalue.setFont(font1);

		// Tao JTextField (tao truong van ban)
		jtf_firstvalue = new JTextField(50);// 50 la do rong cua truong
		jtf_firstvalue.setFont(font1);
		jtf_secondtvalue = new JTextField(50);
		jtf_secondtvalue.setFont(font1);
		jtf_answervalue = new JTextField(50);
		jtf_answervalue.setFont(font1);

		JPanel jpn_IO = new JPanel();
		jpn_IO.setLayout(new GridLayout(3, 2, 10, 10));
		jpn_IO.add(jlb_firstvalue);
		jpn_IO.add(jtf_firstvalue);
		jpn_IO.add(jlb_secondvalue);
		jpn_IO.add(jtf_secondtvalue);
		jpn_IO.add(jlb_answervalue);
		jpn_IO.add(jtf_answervalue);

		// add button co listener
		ActionListener ac = new MiniConculatorListener(this);

		JButton jbt_plus = new JButton("+");
		jbt_plus.setFont(font1);
		jbt_plus.addActionListener(ac);

		JButton jbt_minus = new JButton("-");
		jbt_minus.setFont(font1);
		jbt_minus.addActionListener(ac);

		JButton jbt_times = new JButton("*");
		jbt_times.setFont(font1);
		jbt_times.addActionListener(ac);

		JButton jbt_dicided = new JButton("/");
		jbt_dicided.setFont(font1);
		jbt_dicided.addActionListener(ac);

		JButton jbt_pow = new JButton("^");
		jbt_pow.setFont(font1);
		jbt_pow.addActionListener(ac);

		JButton jbt_mod = new JButton("%");
		jbt_mod.setFont(font1);
		jbt_mod.addActionListener(ac);

		// add jpn chua button
		JPanel jpnBT = new JPanel();
		jpnBT.add(jbt_plus);
		jpnBT.add(jbt_minus);
		jpnBT.add(jbt_times);
		jpnBT.add(jbt_dicided);
		jpnBT.add(jbt_pow);
		jpnBT.add(jbt_mod);

		this.setLayout(new BorderLayout(10, 10));
		// sau khi dinh dang layout cua view,chen jpn vao chinh giua
		this.add(jpn_IO, BorderLayout.CENTER);
		// add jlbBt xuong ben duoi phan nhap so
		this.add(jpnBT, BorderLayout.SOUTH);
		this.setVisible(true);

	}

	// phep cong
	public void Plus() {
		checkFieldData();
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.plus();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");
	}

	// phep tru
	public void Minus() {
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.minus();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");

	}

	// phep nhan
	public void Times() {
		checkFieldData();
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.times();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");

	}

	// phep chia
	public void Divided() {
		checkFieldData();
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.divided();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");

	}

	// ham mu
	public void Pow() {
		checkFieldData();
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.pow();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");

	}

	// chia lay du
	public void Mod() {
		checkFieldData();
		double firstvalue = Double.valueOf(jtf_firstvalue.getText());
		double secondvalue = Double.valueOf(jtf_secondtvalue.getText());
		this.mcmd.setFirstValue(firstvalue);
		this.mcmd.setSecondValue(secondvalue);
		this.mcmd.mod();
		this.jtf_answervalue.setText(this.mcmd.getAnswer() + " ");

	}
	
	public void checkFieldData() {
		if (checkValue(jtf_firstvalue.getText(), jtf_secondtvalue.getText())) {
			jtf_answervalue.setText("Du Lieu Nhap sai");
			return;
		}
	}

	public boolean checkValue(String value1, String value2) {
		try {
			Double.parseDouble(value1);
			Double.parseDouble(value2);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

}
