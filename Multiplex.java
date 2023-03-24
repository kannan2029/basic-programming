class Multiplex
{
static String name="Phenixmall";
String movie_name;
int movie_time;
public static void main(String[] arg)
{
Multiplex screen1 = new Multiplex("THUNIVU",2);
Multiplex screen2 = new Multiplex("VARISU",3);
Multiplex screen3 = new Multiplex("kantara",4);
screen1.show();
screen2.show();
screen3.show();
}
void show()
{
System.out.println(movie_name);
System.out.println(movie_time);
}
Multiplex(String s,int i)
{
movie_name=s;
movie_time=i;
}
}
