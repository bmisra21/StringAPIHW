
public class Mississippi {

	public static void main(String[] args) 
	{
		String river = "Mississippi";
		
		//string length
		System.out.println("There are " + river.length() + " characters in Mississippi");
		
		//upercase version
		String changeCase = "Hello, world";
		System.out.println("Hello, world in upper case is: " + changeCase.toUpperCase());
		
		//legality of river.println()
		// river.println(); <- not legal
		
		//replace
		//args are char p and char s
		river.replace('p' , 's');
		System.out.println(river.replace('p' , 's'));
		
		//print MISSISSIPPI
		System.out.println("Mississippi in upper case is: " + river.toUpperCase());

	}

}
