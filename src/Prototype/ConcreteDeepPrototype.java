package Prototype;

public class ConcreteDeepPrototype extends DeepPrototype {
	public void show(){
		System.out.println("clone instance"+this+" name value:"+this.getName() +" part value:"+this.getPartName()+" id value:"+this.getId());
	}
}
