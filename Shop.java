class Shop{
String product_name;
int Product_price,discount;
public static void main(String[] arg){
Shop product1 = new Shop("Biscuit",25);
Shop product2 = new Shop("dates",50);
Shop product3 = new Shop("Bread",40,10);
Shop product4 = new Shop();
product1.sell();
product2.pack();
product3.pack();
product4.pack();
}
void sell()
{
System.out.println(product_name);
}
void pack()
{
System.out.println(Product_price);
System.out.println(discount);
}
Shop(String product_name,int Product_discount)
{
this.product_name=product_name;
this.Product_price=Product_price;
}
Shop(String product_name,int Product_price,int discount)
{
this.product_name=product_name;
this.Product_price=Product_price;
this.discount=discount;
}
Shop(){
System.out.println("Hi kannan");
}
}
