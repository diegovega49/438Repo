package github;

public class Main {
	
	public static void main(String[] args) {
		String[] shopList = new String[] {
				"Apples",
				"Bananas",
				"Corn",
				"More Dog Food",
				"Cereal", 
				"Bread", 
				"Eggs",
				"Milk"
		};
		
		for (String item: shopList) {
			System.out.println(item);
		}	
				System.out.println("My Shopping List");
             System.out.println();
             for (String item: shopList) {
			System.out.println(item);
		}	
       }
