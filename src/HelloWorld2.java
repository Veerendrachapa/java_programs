public class HelloWorld2 {
	public static void main(String[] args){

	HelloWorld2 hw = new HelloWorld2();
	System.out.println("Hello world");
	String value = hw.getName();
	System.out.println(value);
	boolean score = hw.getOnBoard();
	System.out.println(score);
}
String getName(){
return "200";	
	}
	boolean getOnBoard(){
		return true;
	}

}