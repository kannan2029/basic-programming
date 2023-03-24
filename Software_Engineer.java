class Software_Engineer extends Parent implements EmploymentRules ,Libaryrules//implements is a keyword
{
public static void main(String[] args)
{
Software_Engineer kannan = new Software_Engineer();
EmploymentRules manager=new Software_Engineer();
kannan.watch_movies();
kannan.apply_leave();
manager.watch_movies();
manager.apply_leave();
manager.work();
kannan.work();
kannan.lend();
//kannan.books();
kannan.study();
System.out.println(Software_Engineer.no_of_leaves);
System.out.println(kannan.hike);
//kannan.no_of_leaves = 365;
}
public void watch_movies()
{
System.out.println("Watching movies");
}
public void apply_leave()
{
System.out.println("Apply leave");
}
public void work()
{
System.out.println("work is started");
}
public void study()
{

}








public void lend(){
System.out.println("take lend");
}

public void returnBooks(){
System.out.println("bring the books");

}

}

//attempting to assign weaker access privileges; was public
  
     



































