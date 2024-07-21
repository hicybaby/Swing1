package Use_JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//controler
public class MiniConculatorListener implements ActionListener {
	private MiniConculatorView mcv;

	public MiniConculatorListener(MiniConculatorView mcv) {
		this.mcv = mcv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("+")) {
			this.mcv.Plus();
		} else if (src.equals("-")) {
			this.mcv.Minus();
		} else if (src.equals("*")) {
			this.mcv.Times();
		} else if (src.equals("/")) {
			this.mcv.Divided();
		} else if (src.equals("^")) {
			this.mcv.Pow();
		} else if (src.equals("%")) {
			this.mcv.Mod();
		}

	}

}
