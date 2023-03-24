package tamilnadu.chennai;
public class Office1{
static String name="kannan";
public static void main(String[] args)
{
Office1 office = new Office1();
office.work();
office.makeprofit();
}
public void work(){
System.out.println("working");
}
private void makeprofit(){
System.out.println("profit");
}
protected void plan()
{
System.out.println("project plans");
}
}

