package emp;

public class Arithmetic {
public static void main(String[] args) {
		
		sample s = new sample();
		subt s1 = new subt();
		mult s2 = new mult();
		divi s3 = new divi();
		s.sum(3, 4);
		s1.sub(6,7);
		s2.multiply(5,5,5);
		s3.mod(3,3);
	
}
}
class sample
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}
	class subt
	{
	void sub (int a, int b)
	{
		System.out.println(a-b);
		
	} 
	}
	class mult
	{
	void multiply (int a, int b, int c)
	{
		System.out.println(a*b*c);
		
	}
	}
	class divi
	{
	void mod (int a,int b)
	
	{
		//Scanner sc = new Scanner (System.in);
          //     a = sc.next();
		   //    b = sc.next();
		       System.out.println(a/b);
	}
	}
	
	

	
	
	
	
	
	
	
	
	

	