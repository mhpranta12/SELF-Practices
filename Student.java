package Inheritence;

public class Student {
				int id;
				String name;
				double cg;
				public int getId() {
					return id;
				}
				public void setId(int id) {
					this.id = id;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public double getCg() {
					return cg;
				}
				public void setCg(double cg) {
					this.cg = cg;
				}
				public Student(int id, String name, double cg) {
					super();
					this.id = id;
					this.name = name;
					this.cg = cg;
				}
				public void show()
				{
					System.out.println(id+" " +name+ " "+cg);
				}
				@Override
				public String toString() {
					return "Student [id=" + id + ", name=" + name + ", cg=" + cg + "]";
				}
				

}
