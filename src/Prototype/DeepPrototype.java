package Prototype;

public class DeepPrototype implements Cloneable{

	private int id;
	private String name;
	private DeepPart part = new DeepPart();
	
	public DeepPrototype clone()
	{
		DeepPrototype prototype = null;
		try{
			prototype = (DeepPrototype) super.clone();
			prototype.part = (DeepPart) this.part.clone();
		}catch(CloneNotSupportedException ex){
			
		}
		return prototype;
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
