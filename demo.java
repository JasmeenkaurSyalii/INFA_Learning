package practice.com;

public class Main {
	
	private static final int Third = 3;

	public static void main(String args[]) {
		
//		System.out.println("preet");
		int first = 1;
		int second = 2;
		int []marks = {first,second,Third,4};
		String rollno[] = {"jasmeen","sahiba"};
		for(String s : rollno) {
			System.out.println(s);
		}
		printMarks(marks, 0);
		 
	}

	
	//alt+shift+r 
	//right -> refractor-> rename
	
	//alt+shift+m
	//rightclick -> refractor-> extract
	
	//alt+shift+i -> inline method >>extract everything to main method...
	
	//alt + shift + t => show all options of refracting.

	//alt shift c =>adding parameter
	
	//alt+shift+L => local variables. - alt shift i for inline 
	
	//rightclick => refractor => extract constant 
	//alt shift t => introduce parameter
}

// 1 . Constructor: multiple constructors in one => chaining constructors.
// 2 . Code as readable as can.
// 3 . Replacing temp value with function call 
// 4 . temp values go outside the methods.

//3 reasons:
//readable:
//naming conventions:
//reusablility:
//core documentation:
//java annonations




//https://www.youtube.com/watch?v=f5Rzr5mVNbY&ab_channel=in28minutes-CloudMadeEasy
//https://www.youtube.com/watch?v=dN9GYsG1v_c&ab_channel=in28minutes-CloudMadeEasy
//	
//	https://www.youtube.com/watch?v=GCTEVZjxznc&list=PLAC2AM9O1C5KioUMeH9qIjbAV_RMmX8rd&ab_channel=TheCodeMate

//https://www.youtube.com/watch?v=vhYK3pDUijk&list=PLGLfVvz_LVvSuz6NuHAzpM52qKM6bPlCV&ab_channel=DerekBanas

//https://www.youtube.com/watch?v=f5Rzr5mVNbY&ab_channel=in28minutes-CloudMadeEasy
