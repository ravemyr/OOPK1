package labb1;


public class E32 {

	public static void main(String[] args) {
		Human[] humanArray;
		humanArray = new Human[15];
		for(int i = 0; i<humanArray.length; i++){
			humanArray[i] = new Human();
		}
		for (int a=0; a<humanArray.length; a++)
		System.out.println(humanArray[a]);
	}
}
		

