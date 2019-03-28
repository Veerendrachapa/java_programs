public class Main2 {
	int a = 10;
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		System.out.println(m.a); // output = 10
		m.a = 100;
		System.out.println(m.a); // over ride the a value 10 to 100 output = 100
		
	}
}