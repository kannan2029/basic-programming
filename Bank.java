class Bank
{
public static void main(String[] arg)//method signature public-access modifier
{
Bank manager=new Bank();
manager.approve(); //method calling statement
float cash=manager.recoverLoans();
System.out.println("Recoverded amt is" + cash);
int reward=manager.getReward(50);//method passing argument/parameter
System.out.println(reward);
}
void approve()//method definition
{
System.out.println("Approve Loans");
}
//void recoverLoans
int recoverLoans()//using void incompatible types: unexpected return value
{
System.out.println("The loan amount recoverd");
return 1000;
}   
int getReward(int amount)//method singnature
{
System.out.println(amount);
return amount;
}
}
//try   int float Bank.java:7: error: incompatible types: possible lossy conversion from float to 
// float   int run  1000.0  //float maximum size
//float float run  1000.0
// int 1000.5//possible lossy conversion 
