package avatar;
/*
This illustration of object oriented programming 
is based off the popular animated show Avatar: The Last Airbender.
*/

abstract class AvatarWorld {
	
	//every class that inherits this one will name a specific avatar 
	public abstract void avatar();
	
	/* this method is for the villain 
	during the chosen avatar's lifetime
	*/
	public abstract void villain();
	
	
}
/*
since this class implements AvatarWorld (example of inheritance)
we have to implement the two abstract methods 
*/
class Aang extends AvatarWorld {
	
	public void avatar() {
		System.out.println("The following is an example of Abstraction:");
		System.out.print("In this era, the avatar is Aang ");
	}
	
	public void villain() {
		System.out.println("and the villain is Fire Lord Ozai.");
	}
}

/*
these two classes, sokka and katara, showcase polymorphism
by changing the talk method, 
we can determine what kind of function to run while the program is running
*/

class Katara extends Characters {
	public void Talk() {
		System.out.println("The following is an example of Polymorphism:");
		System.out.println("Katara: I can make my own water by sweating!");
	}
}

class Sokka extends Characters {
	public void Talk() {
		System.out.println("Sokka: Well, I'm just a guy with a boomerang.");
	}
}


public class Main {

	public static void main(String [] args) {
	System.out.println("Welcome to the Avatar World!\n");
	Aang a = new Aang();
		a.avatar();
		a.villain();
	
	System.out.println();
	
	Characters c = new Characters();		//creating object
		c.setCharacter("Zuko");
		c.setage(16);
		c.setNation("The Fire Nation");
		c.setBend("Fire");
	
	System.out.println("The following is an example of Encapsulation:");
	System.out.println("Name one of the main characters: " + c.getCharacter());
	System.out.println("What's their age?: " + c.getAge());
	System.out.println("What nation are they from?: " + c.getNation());
	System.out.println("What element do they bend?: " + c.getBend()+ "\n");
	
	
	Katara Katara = new Katara();
	Sokka Sokka = new Sokka();
	
	//this shows how the talk method can take on many forms
	Katara.Talk();
	Sokka.Talk();
	c.Talk();
	
	}
}
