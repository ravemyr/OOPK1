package labb1;

class ExceptionHandler extends Exception{

	public static void main(String[] args) {

	}
	public ExceptionHandler() {
		super();
	}
	public ExceptionHandler(String message) {
		super(message);
	}
		
}
public class Fysiker extends Human{
	
	public static void main(String[] args) {
		Fysiker newFysiker = new Fysiker();
		System.out.println(newFysiker);
	}
	private int year;
	public Fysiker(int ageIn,String nameIn,int startingYear) {
		super.setName(nameIn);
		try {
			if(startingYear < 1932) 
				throw new ExceptionHandler("Not a feasible year to start!");
			else if(startingYear > 2015){
				throw new ExceptionHandler("Not a feasible year to start!");
				}
			else {
				year = startingYear;

			}
			if((2017-startingYear + ageIn > 15)) 
				super.setAge(ageIn);
			
			else {
				throw new ExceptionHandler("Too young!");
			}
		}
		catch (ExceptionHandler a) {
			System.out.println(a.getMessage());
		}
	}
	public Fysiker() {
		int rand = (int)(Math.random()*85);
		int startYear = (2015-rand);
		year = startYear;
		int ageIn = 17 + rand;
		super.setAge(ageIn);
		
	}
		
	public String toString(){
		return super.toString() + " började fysik " + this.year;
	}
	public int getYear() {
		return year;
	}

}
