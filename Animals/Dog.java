import java.awt.Color;

public class Dog extends Animal implements AnimalBehaviors{
	
	private double furLength;
	private Color furColor = Color.BLUE;
	public Dog(){
		 super();
		 furLength = 0.25;
	}
	public Dog(double furLen){
		super(); //call the current class's constructor or super(); for parent
		furLength = furLen;
	}
	public void setFurLength(double fl){
		furLength = fl;
	}
	public double getFurLength(){
		return furLength;
	}
	@Override
	public String toString(){
		String s = (super.toString() + "\nFur Length: " + getFurLength());
		return s;
	}
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "WOOF!";
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "chomp chomp";
	}
	@Override
	public void sleepingHabit() {
		// TODO Auto-generated method stub
		System.out.println("all day long with paws on eyes");
	}
}