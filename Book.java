class Book{
String book_name;
int no_of_pages;
public static void main(String [] arg)
{
Book book1 = new Book("ATOMIC HABITS",200);
Book book2 = new Book("WEDNESDAY");
Book book3 = new Book();
}
Book(String book_name,int no_of_pages)
{
this(book_name);
this.book_name=book_name;
this.no_of_pages=no_of_pages;
System.out.println(book_name);
System.out.println(no_of_pages);
}
Book()
{
//this();//recursive constructor invocation
System.out.println("WELCOME TO MY BOOK SHOW");
}
Book(String book_name)
{
this();
this.book_name=book_name;
System.out.println(book_name);
}

}
