package Use_MVC_model;

public class Test {
	public static void main(String[] args) {
		CounterModel ct = new CounterModel();
		ct.increment();
		ct.increment();
		System.out.println(ct.getValue());

		CounterView ctv = new CounterView();

	}

}
