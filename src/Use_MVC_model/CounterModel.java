package Use_MVC_model;

public class CounterModel {
	private int value;

	public CounterModel() {
		this.value = 0;
	}

	/**
	 * 
	 * @return
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * 
	 */
	public void setValue() {
		this.value = value;
	}

	/**
	 * 
	 */
	public void increment() {
		this.value++;
	}

	public void decrement() {
		this.value--;
	}

	public void reset() {
		this.value = 0;
	}

}
