package Inheritence;

public class Vehicle {
			
			String lcplate;

			public String getLcplate() {
				return lcplate;
			}

			public void setLcplate(String lcplate) {
				this.lcplate = lcplate;
			}

			public Vehicle(String lcplate) {
				super();
				this.lcplate = lcplate;
			}

			public Vehicle() {
				super();
			}
			public void show()
			{
				System.out.println(lcplate);
			}

			public Vehicle(String lcplate) {
				super();
				this.lcplate = lcplate;
			}

}
