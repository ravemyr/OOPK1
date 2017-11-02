package labb1;
import java.util.Arrays;
public class Wrapper{
	
	public static void main(String[] args) {
		Fysiker[] fysikerArray;
		fysikerArray = new Fysiker[15];
		for(int i = 0; i<fysikerArray.length; i++) {
			fysikerArray[i] = new Fysiker();
			//Skriver ut 15 Fysiker
		}
		for(Fysiker a : fysikerArray) {
			//System.out.println(a);
		}
		Human[] peoplesArray;
		peoplesArray = new Human[10];
		for(int i = 0; i<5; i++){
			peoplesArray[i] = new Fysiker();
			peoplesArray[i+5] = new Human();
		}
		for(Human b : peoplesArray){
			//System.out.println(b);
			//Skriver ut 5 Fysiker sedan 5 "vanliga" personer
		}
		Fysiker person = new Fysiker();
		Human personToo = new Human();
		if (person.compareTo(personToo) == 1) {
			System.out.println(person.getName() + " är " + person.getAge() + " och är äldre än " + personToo.getName() + " som är " + personToo.getAge());
		}
		else if(person.compareTo(personToo) == 0) {
			System.out.println(person.getName() + " är " + person.getAge() + " och är lika gammal som " + personToo.getName() + " som också är " + personToo.getAge());
		}
		else {
			System.out.println(person.getName() + " är " + person.getAge() + " och är yngre än " + personToo.getName() + " som är " + personToo.getAge());
			}
		Arrays.sort(peoplesArray);
		for(Human b : peoplesArray){
			System.out.println(b);
			//Skriver ut 5 Fysiker sedan 5 "vanliga" personer
		}
	}
	}

