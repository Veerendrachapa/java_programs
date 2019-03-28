import java.util.*;

public class passingTrueParameter{

	

public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
		boolean value = sc.nextBoolean();

passingTrueParameter ptp = new passingTrueParameter();
ptp.parameter(value);

System.out.println("end of main method");

	}

	public void parameter(boolean a){
		if(a){
			System.out.println("hello");
		}
	}

}


