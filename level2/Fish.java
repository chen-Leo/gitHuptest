package level2;
import  level2.Animal;
public class Fish extends Animal {
	Fish(){
	}
	Fish(String foodKind,String gender,String livePlace,int age,int hungerValue) {
		      setFoodKind(foodKind);
		      setGender(gender);
		      setAge(age);
		      setLivePlace(livePlace);
		      setHungerValue(hungerValue) ;
	}
	public void move(){
		super.move(); 
		System.out.println("fish can swim");
   }
}
