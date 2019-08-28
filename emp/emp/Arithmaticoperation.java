package com.Rogersoft.javaprograms.methods;
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
	void mod ()
	{
		int a=3,b=2;
		System.out.println(a/b);
	}
}
public class Arithmaticoperation {

	public static void main(String[] args) {
		sample s = new sample();
		subt s1 = new subt();
		mult s2 = new mult();
		divi s3 = new divi();
		s.sum(3, 4);
		s1.sub(6,7);
		s2.multiply(5,5,5);
		s3.mod();
		
		
		
		
		
		
		
		

	}

}
