package Inheritence;

public class Employee {
			String name;
			int id;
			Address add;
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
			public Address getAdd() {
				return add;
			}
			public void setAdd(Address add) {
				this.add = add;
			}
			public Employee(String name, int id, Address add) {
				super();
				this.name = name;
				this.id = id;
				this.add = add;
			}
			public Employee() {
				super();
			}
			public void show()
			{
				System.out.println(name+" : "+id+"   :  "+add);
			}
			@Override
			public String toString() {
				return "Employee [name=" + name + ", id=" + id + ", add=" + add + "]";
			}
			
}
