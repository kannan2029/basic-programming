package programmingbasics;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping ll = new Looping(); 
		//ll.print_reverse(1234);
		//ll.count_of_digits(1234);
		int result = ll.sum_of_digits(1234567);
		while(result>9)
		{
			result = ll.sum_of_digits(result);
		}
		System.out.println("Sum of digits is "+ result);

	}
	private int sum_of_digits(int plate) {
		// TODO Auto-generated method stub
		int sum = 0; 
		while(plate>0)
		{
		//System.out.println(plate%10);
		sum = sum + (plate%10); 
		plate = plate / 10; 
		}
		return sum; 
		
	}

	private void count_of_digits(int plate) {
		// TODO Auto-generated method stub
		int count = 0; 
		while(plate>0)
		{
		//System.out.println(plate%10);
		count = count + 1; 
		plate = plate / 10; 
		}
		System.out.println("Count of digits is "+ count);
		
	}

	private void print_reverse(int plate) {
		// TODO Auto-generated method stub
		while(plate>0)
		{
		System.out.println(plate%10);
		plate = plate / 10; 
		}
	}

}
