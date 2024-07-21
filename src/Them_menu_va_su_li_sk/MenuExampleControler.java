package Them_menu_va_su_li_sk;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

public class MenuExampleControler implements ActionListener {
	private MenuExampleView mnv;

	public MenuExampleControler(MenuExampleView mnv) {
		this.mnv = mnv;
	}

	public MenuExampleControler() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("Exit")) {
			this.mnv.setTextJLabel("Ban da nhanh vao Jmenu Item Exit");
			// tat hoan toan cua so
			System.exit(0);
		}else if(button.equals("ToolBar")){
			AbstractButton checkBox = (AbstractButton) e.getSource();//lay ra doi tuong va ep kieu cao nhat cua button
			boolean check = checkBox.getModel().isSelected();
			if(check) {
				this.mnv.enableJtoolBar();
			}else {
				this.mnv.disableJtoolBar();
			}
			
		}else {
			this.mnv.setTextJLabel("Ban da nhan vao "+button);
		}

	}

}
