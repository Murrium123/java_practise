

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub ... 
		//byte x = 127;   //highest number for a byte is 127
		char x = 'a';
		
System.out.println(x);
	Fruit Oranges; // = new Fruit(); //Citrus fruit
//	Fruit Apples = new Fruit(); //Created an object that can be used
//	Fruit Berries = new Fruit(); 
	Oranges= new Fruit ("butter", 9, 54);
	Oranges.grams = 4;
	Oranges.name = "Oranges"; //Assign value to string object attribute
//	Apples.name = "Apples";
//	Berries.name = "Berries"
		System.out.println(Oranges.name);
		System.out.println(Oranges.cals_per_gram);
	}

}
class Fruit {
	int grams;
	int cals_per_gram;
	
	int total_calories ( ) {
		return grams * cals_per_gram;
	}
	String name;

	Fruit(String name, int grams, int cals_per_gram){
		this.grams= grams; 
		this.cals_per_gram = cals_per_gram;
		this.name = name;
	}
}
