// 1. The web is built with HTML strings like "<i>Yay</i>" 
// which draws Yay as italic text. In this example, the "i" 
// tag makes <i> and </i> which surround the word "Yay".
//  Given tag and word strings, create the HTML string 
//  with tags around the word, e.g. "<i>Yay</i>".

// input = makeTags("i", "Yay") → output = "<i>Yay</i>"

import java.util.Scanner;

class HTMLStrings {
	public String makeTags(String tag, String word) {
                   
                           String starttag="<"+tag+">"; 
                           String endtag="</"+tag+">";
                           String str= starttag+word+endtag;
                           return str;

          }
          public static void main(String [] args){
          	HTMLStrings obj = new HTMLStrings();
          	Scanner sc = new Scanner(System.in);
          	String tag = sc.next();
          	String word = sc.next();
          	System.out.println(obj.makeTags(tag,word));
          }
}


 // String starttag = "<"+tag+">";
 //                    String endtag = "</"+tag+">";
//                       String str = starttag+word+endtag;

//=======================================================

// public String makeTags(String tag, String word) {
//     return "<" + tag + ">" + word + "</" + tag + ">";
// }




 