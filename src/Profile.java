
public class Profile {
	
	String name;
	String surname;
	String age;
	String travelAtt;
	
	public Profile(String name, String surname, String age, String travelAtt){
		
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.travelAtt = travelAtt;
	}
	
	public Profile(String name, String surname, String age){
			
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.travelAtt = null;
			
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getTravelAtt() {
		return travelAtt;
	}
	
	public void setTravelAtt(String travelAtt) {
		this.travelAtt = travelAtt;
	}
}
	

	
	
	
