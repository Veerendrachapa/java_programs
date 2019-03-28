
import java.util.Scanner;
public class ReturnWithoutX1 {
	public static void main(String[] args){

		 var char = 'x', text = [], count = 0, c = 0, exp = '';
        var str = document.getElementById('one').value;
        for (i = 0; i < str.length; i++) {
            if (char != str[i]) {
                break;
            }
            count++;
        }
        for(i = count; i < str.length; i++){
        text.push(str[i])
        }
        for(j = text.length-1; j >0; j--){
        if(char != text[j]){
        break;
        }
        text.pop();
        }
        document.write(text);
    }

	 // String str = "xxxworxldxxx";
	 // System.out.println(str.replace("xxx", "").trim()); // output = worxld

	 // String a = "xxx worxld";
     // System.out.println(a.substring(a.indexOf(' '),a.length())); // output = worxld



// String s = "Any thing "; // your original string
// int a = s.indexOf(" "); // check where first space occurs 
// String s1 = s.substring (a+1);// start from the first word after space 
// System.out.println(s1); //print the string 

	 //output = thing

	}
	}









