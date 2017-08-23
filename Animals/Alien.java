import week6.*;

public class Alien extends Animal implements AnimalBehaviors{
	private boolean isSlimy = false;
	public Alien(){
			super();
			setNumOfEyes(7);
		}
	public Alien(int eyes, boolean s){
		super();
		setNumOfEyes(eyes);
		setSlimy(s);
	}
	@Override
	public String toString(){
		String s = super.toString();
		if(getSlimy()){
			return s + "\nIs very yucky... beware, you might slip.";
		}else{
			return s + "\nIs very clean...thank God.";}
		}
	public boolean getSlimy(){
		return isSlimy;
	}
	public void setSlimy(boolean slm){
		isSlimy = slm;
	}
	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void sleepingHabit() {
		// TODO Auto-generated method stub
		
	}
}