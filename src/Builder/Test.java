package Builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Builder builder = new ConcreteBuilder();
		Director directory = new Director(builder);
		directory.construct();
		
		Product product = builder.getResult();
	}

}
