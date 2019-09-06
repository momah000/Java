import java.util.*;
public class PracticeChIbike2{
	public main(String[]args){
		PracticeChIbike2 burn = new PracticeChIbike2();
		double val =converter(90);
		System.out.println(val);
		joker();
		bmi();
		bmi2(3.0,8.0);
	}
	
	public double converter(double a){
		return(a-32)*(5/9+273.15);
	}
	
	public void joker(){
		Scanner joke = new Scanner(System.in);
		System.out.println("what is your name ?");
		String name= joke.nextLine();
		System.out.println("You know what type of bagels fly?"+name+"A plain bagel !"/n);
		System.out.println("I know, I'm divorced lol");
	}
	
	public double bmi(){
		Scanner userbmiH = new Scanner(System.in);
		System.out.println("What is your height");
		double height = userbmiH.nextDouble();
		Scanner userbmiW = new Scanner(System.in);
		Scanner out.println("What is your weight");
		double weight = userbmiW.nextDouble();
		
		return (weight/(height^2))*703;

	}
	
	public double bmi2(double h, double w){
		return (w/(h^2))*703;
	}
	
	public String feetAndInches( int cm){
		int feet= cm/12;
		int inches=cm%12;
		return("Your height is "+ feet +"feet and "+inches+"inches.");
	}
	//method that returns the minimum number of coins given an amount in dollars

}