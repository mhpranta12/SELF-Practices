package Inheritence;

public class Car extends Vehicle{
			
				int stno;

				public int getStno() {
					return stno;
				}

				public void setStno(int stno) {
					this.stno = stno;
				}

				public Car(String lcplate, int stno) {
					super(lcplate);
					this.stno = stno;
				}

				public Car(int stno) {
					super();
					this.stno = stno;
				}

				public Car() {
					super();
				}
				
				public void show ()
				{
					System.out.println(lcplate+ " :" +stno);
				}

}
