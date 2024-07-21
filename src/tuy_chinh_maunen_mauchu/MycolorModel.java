package tuy_chinh_maunen_mauchu;

import java.awt.Color;

//model
public class MycolorModel {
	private Color foreGround;
	private Color background;
	private boolean opaque;

	public MycolorModel() {
		this.foreGround = Color.BLACK;
		this.background = Color.WHITE;
		this.opaque = true;
	}

	public Color getForeGround() {
		return foreGround;
	}

	public void setForeGround(Color foreGround) {
		this.foreGround = foreGround;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}

}
