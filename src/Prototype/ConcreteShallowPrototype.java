package Prototype;

public class ConcreteShallowPrototype extends ShallowPrototype {

	public void show(){
		System.out.println("clone instance"+this+" name value:"+this.getName() +" part value:"+this.getPartName()+" id value:"+this.getId());
	}
}
