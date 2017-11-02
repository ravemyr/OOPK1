package labb1;

import java.util.Arrays;

public class Human implements Comparable{

	public static void main(String[] args) {
		Human[] peoplesArray;
		peoplesArray = new Human[10];
		for (int i=0; i<peoplesArray.length; i++) {
			peoplesArray[i] = new Human();
		}
		Arrays.sort(peoplesArray);
		for (int i=0; i<peoplesArray.length; i++) {
			System.out.println(peoplesArray[i]);
		}
		
	}
	private int age;
	private String name;
	public Human(int ageIn, String nameIn) {
		this.name = nameIn;
		this.age = ageIn;
	}
	public String toString() {
		return "name: " + name + "," + " age: " + age;	
		}
	public int getAge() {
		return age;
	}
	public String getName(){
		return name;
	}
	private String[] nameArray; {
	nameArray = new String[5];
	nameArray[0] = "Jerry";
	nameArray[1] = "Beth";
	nameArray[2] = "Morty";
	nameArray[3] = "Rick";
	nameArray[4] = "Summer";
	}
	public Human(){
		super();
		int newAge = (int) Math.round(Math.random()*100);
		String newName = nameArray[(int)Math.round(Math.random()*4)];
		this.name = newName;
		this.age = newAge;
	}
	public void setAge(int ageIn) {
		this.age = ageIn;
	}
	public void setName(String nameIn){
		this.name = nameIn;
	}
	public int compareTo(Object o){
		Human p = (Human)o;
		if(this.getAge() < p.getAge()) {
			return -1;
		}
		else if(this.getAge() == p.getAge()) {
			return 0;
		}
		else {
			return 1;
		}
		}
	
}
