class Theatre1
{
Theatre1 raja=new Theatre1();
int result=raja.bookticket(220);
System.out.println("After booking ticket"+result);
}
int bookticket(int actual_amount)
{
int ticket_price=120;
int balance=actual_amount-ticket_price;
return balance;
}

