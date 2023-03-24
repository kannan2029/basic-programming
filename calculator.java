class calculator
{
public static void main(String[] args)
{
 calculator calc = new calculator();
 calc.add(10,20);
 calc.add(20,30.4f);
 calc.add(10,20,30);
}
 
 void add(int no1,int no2)
 {
	System.out.println(no1+no2);
 }
 void add(int no1,float no2)
 {
	System.out.println(no1+no2);
 }
 void add(int no1,int no2,int no3)
 {
	System.out.println(no1+no2+no3);
 }
 
 
}
