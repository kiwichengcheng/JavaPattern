package Prototype;

public class TestPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ShallowPrototype
		ConcreteShallowPrototype cp = new ConcreteShallowPrototype();
		cp.setName("ChengCheng");
		cp.setPartName("PartChengCheng");
		cp.setId(1);
		System.out.println("shallow prototype value shows:=====");
		cp.show();
		
		try {
			ConcreteShallowPrototype clonecp = (ConcreteShallowPrototype) cp.clone();
			System.out.println("shallow clone finished value shows:=====");
			clonecp.show();
			
			cp.setId(10);
			cp.setName("CCclone");
			cp.setPartName("PartCLone");
			
			System.out.println("prototype change value shows:=====");
			cp.show();
			System.out.println("prototype change clone value shows:=====");
			clonecp.show();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//DeepPrototype
		ConcreteDeepPrototype deepcp = new ConcreteDeepPrototype();
		deepcp.setName("ChengCheng");
		deepcp.setPartName("PartChengCheng");
		deepcp.setId(1);
		System.out.println("deep prototype value shows:=====");
		deepcp.show();
		
		ConcreteDeepPrototype deepclonecp = (ConcreteDeepPrototype) deepcp.clone();
		System.out.println("deep clone finished value shows:=====");
		deepclonecp.show();
		
		deepcp.setId(10);
		deepcp.setName("CCclone");
		deepcp.setPartName("PartCLone");

		System.out.println("prototype change value shows:=====");
		deepcp.show();
		
		System.out.println("prototype change clone value shows:=====");
		deepclonecp.show();
	}

}
