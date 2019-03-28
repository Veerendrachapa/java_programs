import java.util.Scanner;

public class fahrenheitToCelsies {
	 float temperature1,temperature;
	    
	void getoutput() {
		 temperature = (float)((temperature1 - 32)*0.5556); 
		 System.out.println(" Fahrenheit to celsius\r\n" + "======================\r\n"  + temperature);
	}
	
	
	  public static void main(String[] args) {
		 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter a 'f' for fahrenheit ===> celsius\r\n" + "");
	    String fl = in.next();
	    
	    
	    System.out.println("Enter the fahrenheit value to convert it into celsius : ");
	    System.out.println("Note:\r\n" + "-----\r\n" + "");
	    System.out.println( "Take fahrenheit as float value\r\n" + "");
	    
	    
	  
	   fahrenheitToCelsies obj = new fahrenheitToCelsies();
	   obj.temperature1 = in.nextFloat();
	    obj.getoutput();
	    String[] s = {""};
	    celsiesToFahrenheit.main(s);
	    
	  }
		}
	    
	    class celsiesToFahrenheit {
	    	float far;
	    	int cel;
	    	void getoutput1() {
	    	    far = (float)((cel * 1.8) + 32);
	    	    System.out.println("celsius to Fahrenheit\r\n" + "======================\r\n"  +far);
	    	}
	    	
	    	
	    	  public static void main(String[]args) {
	    		Scanner in1 = new Scanner(System.in);
	    	    System.out.println("Enter a 'c' for celsius ===> fahrenheit\r\n" + "");
	    	    String f2 = in1.next();
	    		    
	    		    System.out.println("Enter the celsius value to convert it into fahrenheit : ");
	    		    System.out.println("Note:\r\n" + "-----\r\n" + "");
	    		    System.out.println( "Take celsius in int value\r\n" + "");
	    		   
	    		    
	    		    celsiesToFahrenheit obj1 = new celsiesToFahrenheit();

	    		    obj1.cel = in1.nextInt();
	    		    obj1.getoutput1();
	    	}
	    }
	    
	   
	    
	
	    
	   
	    
	

