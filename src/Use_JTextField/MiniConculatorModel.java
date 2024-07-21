package Use_JTextField;

//model
public class MiniConculatorModel {
	private double firstValue;
	private double secondValue;
	private double answer;

	public double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	// phep cong
	public void plus() {
		this.answer = this.firstValue + this.secondValue;
	}

	// phep tru
	public void minus() {
		this.answer = this.firstValue - this.secondValue;
	}

	// phep nhan
	public void times() {
		this.answer = this.firstValue * this.secondValue;
	}

	// phep chia
	public void divided() {
		this.answer = this.firstValue / this.secondValue;
	}

	// ham mu
	public void pow() {
		this.answer = Math.pow(this.firstValue, this.secondValue);
	}

	// chia lay du
	public void mod() {
		this.answer = this.firstValue % this.secondValue;
	}

}
