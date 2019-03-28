// 1. Write a program to take username and password and print 
// username and password are correct or incorrect?  

 // Input:  username: admin
 // password: 123  
 // Output:​ Login successfully 

// Input:  username: admin 
// password: 1234  
// Output:​ Password is incorrect please check once  

// Input:  username: admina 
// password: 123  
// Output:  User Name is incorrect please check once  

import java.util.Scanner;

class UsernamePassword {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        loginCreds();
    }

    private static void loginCreds() {

        System.out.println("Enter Username");
        String username = scanner.next();

        if (checkUserName(username)) {

            System.out.println("Enter Password");
            String password = scanner.next();

            if (checkPassword(password)) {
                System.out.println("Login Successfully....");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Incorrect username");
        }
    }

    private static boolean checkUserName(String username) {

        if (username.equals("admin")) {
            return true;
        }
        return false;
    }

    private static boolean checkPassword(String password) {
        if (password.equals("admin123")) {
            return true;
        }
        return false;
    }
}