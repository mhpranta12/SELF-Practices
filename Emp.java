package newfile.emp;

public class Emp {
		String name;
		int id;
		static String dept;
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
		public static String getDept() {
			return dept;
		}
		public static void setDept(String dept) {
			Emp.dept = dept;
		}
		
		public void show()
		{
			System.out.println(name+"   :"+id+"    :"+dept);
		}
		
}
