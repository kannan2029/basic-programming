class Tourists{
String spot;
Tourists(String spot){
this.spot=spot;
}
public static void main(String [] arg){
Tourists t1 = new Tourists("Kerala");
Tourists t2 = new Tourists("Bengalore");
Tourists t3 = new Tourists("Kodai");
t1.enquire();
}
void enquire()
{
String spot="velachery";
System.out.println(spot);
System.out.println(this.spot);
}
}

