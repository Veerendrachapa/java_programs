public class HelloWorld3 {
	public static void main(String [] args){
		HelloWorld3 hw = new HelloWorld3(); // object
		String value = hw.getOnBoard();
		boolean score = hw.getOnScore();
		int value1 = hw.getOnBoard1();
		System.out.println("Hello world");
		System.out.println(value);
		System.out.println(score);
		System.out.println(value1);
	}
     String getOnBoard(){
     	System.out.println("get on board");
     	return "200";
     }
     boolean getOnScore(){
     	System.out.println("get on score");
     	return false;
     }
     int getOnBoard1(){
     	return 100;
     }

}



// output

// get on board
// get on score
// Hello world
// 200
// false
// 100