public class Person extends Animal implements AnimalBehaviors {
	public Person(){
		super();
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "Hello!";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "fork and knife to mouth";
	}

	@Override
	public void sleepingHabit() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzz zzzzzz zzzzz ugghhhhhh zzz");
	}
	
}
