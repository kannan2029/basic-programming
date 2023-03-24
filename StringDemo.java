package arraylearning;

public class StringDemo {

	public static void main(String[] args) {
		StringDemo sd = new StringDemo(); 
		//..sd.strip_last(); 
	//sd.method4();
	String name = "sakthivel is a good boy";
	//System.out.println(name.contains("good"));
		//sd.check_contains(); 
	sd.string_methods(); 

	}
	private void string_methods() {
		// TODO Auto-generated method s
		String name = "maneesh";
	
		
	}
	private void check_contains() {
		// TODO Auto-generated method stub
		
		String name1 = "sakthivel is a good boy"; 
		String name2 = "bad";
		char ch = name2.charAt(0); //a
		int j=0, count = 0; 
		boolean contains = false; 
for(int i=0; i<name1.length();i++)
{
	if(ch==name1.charAt(i)) //t
	{
		j++; //j = 3
		if(j<=name2.length()-1)
			{ch = name2.charAt(j); }// 't'
		count++; // 3
		if(count==name2.length())
		{
			contains = true; 
			System.out.println("Contains");
			break;
		}
	}
	
}
if(contains==false)
{
	System.out.println("Not contains");
}
		
	}
	private void method4() {
		  String name="Ziavudeen is a good boy   ";
		  String name2="";
		  boolean first=false;
		  for(int i=name.length()-1;i>=0;i--) {
		   if(name.charAt(i)!=' ') {
		    first=true;
		   }
		   if(first==true) {
			   name2 = name2 + name.charAt(i);
		   // System.out.print(name.charAt(i));
		   }
		  }  
		  System.out.println(name2);
		  
		  }

	private void strip_last() {
		// TODO Auto-generated method stub
		//striptrailing
				String name = "dhinakaran   ";
				name.stripLeading();
				System.out.println(name.length());
				name = name.stripTrailing();
				System.out.println(name.length());
				
				String name2 = "";
				for(int i=0;i<name.length();i++)
				{
					if(name.charAt(i)!=' ')
					{
						name2 = name2 + name.charAt(i);
					}
				}
				System.out.println(name2.length());
		
	}

	

}
