package Them_menu_va_su_li_sk;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuExampleMouseControler implements MouseListener {
	private MenuExampleView mnv;
	

	public MenuExampleMouseControler(MenuExampleView mnv) {
		super();
		this.mnv = mnv;
	}


	public MenuExampleMouseControler() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

//chuot phai
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isPopupTrigger()) {
			this.mnv.jpumn.show(e.getComponent(),e.getX(),e.getY());
		}
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			this.mnv.jpumn.show(e.getComponent(),e.getX(),e.getY());
		}
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
