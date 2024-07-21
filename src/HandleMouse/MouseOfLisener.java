package HandleMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseOfLisener implements MouseListener, MouseMotionListener {
	private MouseView mv;

	public MouseOfLisener(MouseView mv) {
		this.mv = mv;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.mv.Click();

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

//chuot dua vao ct
	@Override
	public void mouseEntered(MouseEvent e) {
		this.mv.Enter();
		int x = e.getX();
		int y = e.getY();
		this.mv.update(x, y);

	}

//dua chuot ra khoi ct
	@Override
	public void mouseExited(MouseEvent e) {
		this.mv.Exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.mv.update(x, y);
	}

}
