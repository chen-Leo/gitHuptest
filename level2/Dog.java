package test2;
import test2.Animal;

public class Dog extends Animal {
	Dog(){
	}
	Dog
		(String foodKind,String gender,String livePlace,int age,int hungerValue){
		      setFoodKind(foodKind);
		      setGender(gender);
		      setAge(age);
		      setLivePlace(livePlace);
		      setHungerValue(hungerValue) ;
	}
	public void move(){
		      super.move();
		      System.out.println("dog can run");
	}
	
	

}
