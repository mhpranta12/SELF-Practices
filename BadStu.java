package Inheritence;

public class BadStu extends Student{
	String occur;

	public String getOccur() {
		return occur;
	}

	public void setOccur(String occur) {
		this.occur = occur;
	}

	public BadStu(int id, String name, double cg, String occur) {
		super(id, name, cg);
		this.occur = occur;
	}
	public void show()
	{
		System.out.println("id is : "+id+ " "+name+ " "+cg+ " "+occur);
	}

	

}
