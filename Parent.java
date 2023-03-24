public abstract class Parent{
public Parent()
{
System.out.println("thisparanet constructor");
}
Parent(int no)
{
System.out.println("single argument");
}
public void grow(){
System.out.println("Growing");
}
public abstract void study();
public static void main(String [] args)
{
//Parent pa = new Parent();
//pa.grow();
}
}
