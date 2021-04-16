package com.ola;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
//import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;
public class Application {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		//Login
		System.out.println("***** Welcome To Ola *******\n Login");
		//System.out.println("Login");
		//getting mobile  number
		System.out.println("Enter the mobile number");
		Long mobile=scan.nextLong();
		String cellno=String.valueOf(mobile);
		//checking the number is valid or not
		if(cellno.length()==10) {
			System.out.println("valid");
		} else {
			System.out.println("Not Valid");
		}
		//getting the password from the user
		System.out.println("Enter the password number");
		String password=scan.next();
		//regex function to check password
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!#$%^&+=])(?=\\S+$).{8,20}";
		//checking password matching or not
		if(password.matches(pattern)) {
				System.out.println("valid");
				System.out.println("Enter the Travel Vechile\n 1.Micro\n2.Mini\n 3.Prime");
				int vechileNumber=scan.nextInt();
				//creating the object
				Application a1=new Application();
				if(age>18) {
					
				}
				//through the input of user usecase will work
				switch(vechileNumber) {
				case 0:
					a1.menu();
					break;
				case 1:
					
					double micromoney=a1.micro();
					
					double totalAmountForMicro=micromoney+(micromoney*7.0/100);
				System.out.println("Your Total amount After calculating GST"+totalAmountForMicro);
				
					break;
				case 2:
					double macromoney=a1.macro();
					double totalAmountForMacro=macromoney+(macromoney*7.0/100);
					System.out.println("Your Total amount After calculating GST"+totalAmountForMacro);
					break;
				case 3:
					double primemoney=a1.prime();
					double totalAmountForPrime=primemoney+(primemoney*7.0/100);
					System.out.println("Your Total amount After calculating GST"+totalAmountForPrime);
					break;
					default:
						System.out.println("Enter correct number");
						a1.menu();	
						
				}
		}
		else {
				System.out.println("Not valid\n Enter Correct password");
			}	
		}
				public static double micro() {
					Scanner scan=new Scanner(System.in);
					System.out.println("You Have Selcted Micro\n Enter the kilometer You need to Travel");
					double kilometer=scan.nextInt();
					return(kilometer*10);
	
		
	}
				public static double macro() {
					Scanner scan=new Scanner(System.in);
					System.out.println("You Have Selcted Micro\n Enter the kilometer You need to Travel");
					double kilometer1=scan.nextInt();
					return(kilometer1*15);
	
		
	}
				public static double prime() {
					Scanner scan=new Scanner(System.in);
					System.out.println("You Have Selcted prime\n Enter the kilometer You need to Travel");
					double kilometer2=scan.nextInt();
					return(kilometer2*20);
		
	}
				public static void menu() {
					System.out.println("Enter The Correct Value");
					System.out.println("Enter the Travel Vechile\n 1.Micro\n2.Mini\n 3.Prime");
				}
				
				
	
		}
		
	


