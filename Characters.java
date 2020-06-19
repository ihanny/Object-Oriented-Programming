package avatar;

public class Characters {
	private String Nation; 
	private String bend;
	private String character;
	private int age;
	
	public void Talk() {
		System.out.println("Unknown: I am one of the main characters!");
	}
	
	public void setNation(String newNation) {
		Nation = newNation; 
	}
	
	public String getNation() { 
		return Nation;
	}
	
	public void setBend(String newBend) {
		bend = newBend;
	}
	
	public String getBend() {
		return bend;
	}
	
	public void setCharacter(String newCharacter) {
		character = newCharacter;
	}
	
	public String getCharacter() {
		return character;
	}
	
	public void setage(int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}
}
