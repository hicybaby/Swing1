package HandleMouse;

public class MouseModel {
	private int x;
	private int y;
	private int count;
	private String checking;

	public MouseModel() {
		this.x = 0;
		this.y = 0;
		this.count = 0;
		this.checking = "no";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getChecking() {
		return checking;
	}

	public void setChecking(String checking) {
		this.checking = checking;
	}

	public void click() {
		this.count++;
	}

	public void enter() {
		this.checking = "yes";

	}

	public void exit() {
		this.checking = "no";
	}

}
