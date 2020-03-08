package Inheritence;

public class Address {
		String city;
		String country;
		String dist;
		
		public Address(String city, String country, String dist) {
			super();
			this.city = city;
			this.country = country;
			this.dist = dist;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public Address() {
			super();
		}
		public String getDist() {
			return dist;
		}
		public void setDist(String dist) {
			this.dist = dist;
		}
			
}
