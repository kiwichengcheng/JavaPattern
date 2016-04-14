package Prototype;

public class ShallowPrototype implements Cloneable{

	private int id;
	private String name;
	private Part part = new Part();
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPartName(String name){
		part.setName(name);
	}

	public String getPartName(){
		return part.getName();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
