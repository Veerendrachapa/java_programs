public class FormatExample1 {  
    public static void main(String[] args) {  
        String str1 = String.format("%d", 101);          // Integer value  
        String str2 = String.format("%s", "Amar Singh"); // String value  
        String str3 = String.format("%f", 101.00);       // Float value  
        String str4 = String.format("%x", 101);          // Hexadecimal value  
        String str5 = String.format("%c", 'c');          // Char value  
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    }  
  
} 

// output :

// 101
// Amar Singh
// 101.000000
// 65
// c


public String withoutX(String str) { 
  if (str.length() == 0)
    return str;
  if (str.length() == 1){
    if (str.charAt(0) == 'x')
      return "";
    else
      return str;
  }
  if (str.charAt(0) == 'x')
    str = str.substring(1,str.length());
  if (str.charAt(str.length()-1) == 'x')
    str = str.substring(0,str.length()-1);
  return str;
}


=======================================

public String withoutX(String str) {
String sum="";
if(!str.contains("x")){
return str;
}
if(str.charAt(0)=='x'&&str.charAt(str.length()-1)!='x'){
sum=sum+str.substring(1);
}
else if(str.charAt(0)!='x'&&str.charAt(str.length()-1)=='x'){
sum=sum+str.substring(0,str.length()-1);
}
else if(str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x'){
for(int i=1;i<str.length()-1;i++){
sum=sum+str.substring(i,i+1);
}
}
else if(str.charAt(0)!='x'&&str.charAt(str.length()-1)!='x'){
return str;
}
return sum;
}

======================================================

public String withoutX(String str) {
StringBuilder result = new StringBuilder(str);
if (!str.isEmpty() && str.length() > 1 && str.charAt(str.length()-1) == 'x') {
result = result.deleteCharAt(str.length()-1);
}
if (!str.isEmpty() && str.charAt(0) == 'x') {
result = result.deleteCharAt(0);
}
return result.toString();
}

=========================================================

public String withoutX(String str) {
if(str.length()==0 || str.length()==1)
return "";
else if(str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')
return str.substring(1,str.length()-1);
else if(str.charAt(0) == 'x')
return str.substring(1,str.length());
else if(str.charAt(str.length()-1) == 'x')
return str.substring(0,str.length()-1);
else return str;
}

===================================================

public String withoutX(String str) {
int len = str.length();
String word = "";
for (int i = 0; i < len; i++){
if (i == 0 && str.charAt(0) != 'x') {
word += str.charAt(0);
} else if (i > 0 && i < len-1) {
word += str.charAt(i);
} else if (i == len-1 && str.charAt(len-1) != 'x') {
word += str.charAt(len-1);
}
}
return word;
}

=================================================

if (str.length() <= 1) 
return "";
if (str.charAt(0) == 'x') 
str = str.substring(1, str.length());
if (str.charAt(str.length()-1) == 'x')
str = str.substring(0, str.length()-1);
return str;

================================================

