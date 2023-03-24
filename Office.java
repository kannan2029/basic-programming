class Office{
String name,address;
int age,mobile;
public static void main(String arg[])
{
Office person1 = new Office();
person1.applyAadhar("kannan","chennai",22);
Office person2 = new Office();
person2.applyAadhar("mafas","chennai",22);
}
void applyAadhar(String name,String address,int age){
System.out.println(name);
System.out.println(address);
System.out.println(age);
}
}
