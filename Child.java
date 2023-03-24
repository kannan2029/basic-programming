public class Child extends Parent{
public Child()
{//invisible super();
System.out.println("hi child constructor");
}
Child(int no)
{
//super();
super(no);
System.out.println("single argument ");}
public void study()
{
System.out.println("Studying");
}
public static void main(String [] args){
Child ch = new Child(100);
//ch.grow();
//ch.study();
}
}
