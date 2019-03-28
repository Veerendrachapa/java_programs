import java.util.*;
class StringLength1 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String s1 = sc.next();

    int output = s.length()+s1.length();
    System.out.println(output);

	int  s2 = (s.compareTo(s1));
	String checkCondition = (s2 == 0) ? "Yes" : "No";
	System.out.println(checkCondition);

	String s3 = s.toUpperCase().charAt(0)+s.substring(1).toLowerCase()+" "+s1.toUpperCase().charAt(0)+s1.substring(1).toLowerCase();
	System.out.println(s3);

	//String s4= s+""+" "+s1;
    //System.out.println(s4);

}
}
