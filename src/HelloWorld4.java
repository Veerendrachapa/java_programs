public class HelloWorld4{
	public static void main(String [] args){
		HelloWorld4 hw = new HelloWorld4();
		System.out.println("Hello world");
		System.out.println(hw.getOnBoard());
		System.out.println(hw.getonscore());

	}
	int getOnBoard(){
		System.out.println("get on board");
		return 100;
	}

	boolean getonscore(){
		System.out.println("get on score");
		return false;
	}
}

// output 

// Hello world
// get on board
// 100
// get on score
// false