
public class Student {
	private String name;
	private int id ;
	private double cgpa;
	private static String dept="CS";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public void show ()
	{
		
		System.out.println(name+"    :"+id+"    :    "+cgpa+ "    :   "+dept);
	}
	public Student() {
		super();
	}
	public Student(String name, int id, double cgpa) {
		super();
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
	}

}
