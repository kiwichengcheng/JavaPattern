package Builder;

public class ConcreteBuilder implements Builder {
	private Part partA, partB, partC;
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		System.out.println("Create PartA");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		System.out.println("Create PartB");

	}

	@Override
	public void buildPartC() {
		// TODO Auto-generated method stub
		System.out.println("Create PartC");

	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		System.out.println("getResult");
		return null;
	}

}
