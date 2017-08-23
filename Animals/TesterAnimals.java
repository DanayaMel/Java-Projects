public class TesterAnimals {
	
	public static void main(String[]args){
		Animal a = new Animal();
		Dog d = new Dog();
		Person p = new Person();
		Person p1 = new Person();
		p1.setGender("male");
		
		Animal [] animales = new Animal[3];
		animales[0] = p1; //assigning object to location in the array.
		animales[1] = p; //put the Person in the array of animals.
		animales[2] = d; // put the Dog in the array in the array of animals.
		
		a.setGender("female");
		
		for(int i=0; i<animales.length; i++){
			System.out.println("The animal has the following: \n" + animales[i].toString());
		}
		
		/*New dog from animal class.
		Dog d = new Dog();
		System.out.println("\nThe Dog Info>>>> \n" + d.toString());
		System.out.println("The DOG... says " + d.speak());
		System.out.println("Then he eats like this.. " + d.eat());
		System.out.print("Sleeps... "); //prints already so no need to call print.
		d.sleepingHabit();*/
		
		/*New person from animal class.
		Person p = new Person();
		System.out.println("\nThe Person>>> " + p.toString());
		System.out.println("The person says... " + p.speak());
		System.out.println("The person eats like... " + p.eat());
		System.out.println("The person sleeps like... ");
		p.sleepingHabit();*/
		
		/* TEDIOUS METHOD instead of toString
		System.out.println("GENDER: " + a.getGender());
		System.out.println("NAME: " + a.getName());
		System.out.println("EYE COUNT: " + a.getNumOfEyes());
		System.out.println("WEIGHT: " + a.getWeight());
		*/
	}
}
