public class Animal {
	
	private int numOfEyes = 0;
	private String gender = "something";
	private double weight = 0;
	private String name;
	
	public Animal(){ //the constructor always matches the class name b/c it constructs object of that class.
		numOfEyes = 2;
		gender = "unknown";
		weight = 0.5;
		name = "baby animal";
	}	
	@Override
	public String toString(){
		String s = "Name: " + this.getName() + "\nGender " + this.getGender() +
				   "\nWeight: " + this.getWeight() + "\nEye Count: " + this.getNumOfEyes();
		return s;
	}
	// methods to retrieve values for the variables.
	public int getNumOfEyes(){
		return numOfEyes;
	}
	public String getGender(){
		return gender;
	}
	public double getWeight(){
		return weight;
	}
	public String getName(){
		return name;
	}
	//methods to set values for the variables.
	public void setNumOfEyes(int eyes){
		numOfEyes = eyes;
	}
	public void setGender(String g){
		gender = g;
	}
	public void setWeight(double w){
		weight = w;
	}
	public void setName(String n){
		name = n;
	}
}
