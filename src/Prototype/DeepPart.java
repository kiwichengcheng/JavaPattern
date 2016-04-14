package Prototype;

public class DeepPart implements Cloneable {

	private String name = "part";
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public DeepPart clone() throws CloneNotSupportedException{
		return (DeepPart) super.clone();
	}
}
