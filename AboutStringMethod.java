public class AboutStringMethod {
	String s = "   oracle";  // starting space for trim() using // global variable

	public static void main(String [] args){
		String s1 = "java   "; // ending space for trim() remove the white space
		AboutStringMethod obj = new AboutStringMethod();

		// two ways for concating a string

		// 1. using '+' operater

		System.out.println(obj.s + " " + (s1));

		System.out.println("**************************");
		//2. using concat() method
		String joinString = obj.s.concat(s1);
		System.out.println(joinString);

		System.out.println(obj.s);

		System.out.println("**************************");

		// changing the case of string

		System.out.println(joinString.toUpperCase());
		System.out.println(joinString.toLowerCase());

		System.out.println("**************************");

		// UNICODE value of character in a String
		System.out.println(joinString.codePointAt(0));
		System.out.println(joinString.codePointBefore(1));

		System.out.println("**************************");

		// for comparing two strings
		System.out.println(joinString.equals("oraclejava"));
		System.out.println(joinString.equals(12));
		System.out.println(joinString.equals('1')); // char type value
		System.out.println(joinString.equals(false)); // boolean type value
		System.out.println(joinString.equals(s1));

		System.out.println("**************************");

		// startsWith

		System.out.println("starts with " + joinString.startsWith("oracle"));
		System.out.println(joinString.startsWith("or",2));

		System.out.println("**************************");

		// endsWith
		System.out.println("ends with " + joinString.endsWith("va"));

		System.out.println("**************************");

		//substring
		System.out.println(joinString.substring(5));
		System.out.println(joinString.substring(0,6));

		System.out.println("**************************");


		// remove whitespace at extreme ends a given string
		System.out.println(joinString.trim());

		System.out.println("**************************");

		// split a string
		String temp = "java class is boring";
		String[] a = temp.split("a");
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}