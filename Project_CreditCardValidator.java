package JAVA_OOPS;

import java.util.Scanner;

public class Project_CreditCardValidator {
	
	public void get_number()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter last ten digit of your card");
		String no=sc.next();
		char cardNo[]=new char[10];
		
		for(int i=0; i<no.length(); i++)
		{
			cardNo[i]=no.charAt(i);
		}
		
		for(int i=0; i<cardNo.length; i++)
		{
			//cardNo[i]=no.charAt(i);
			System.out.println(cardNo[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Project_CreditCardValidator ccv=new Project_CreditCardValidator();
		ccv.get_number();
		
	}

}
