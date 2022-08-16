package com.cg.package4;


class car
{
	protected int a=15;
	
	protected void print() {    //protected we cant call it any another package... it is access only in child class
		System.out.println("Here i'm using access specifier");
	}
	
}
class mercedes extends car
{
    void print1() {
    	System.out.println(a);  // take a from car class
    }
	// it is accessing the properties of car class
}
class D
{
	int a;
}


public class ProtectedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		child of car class
		mercedes m=new mercedes();
		m.print();               // we call the child class and it print the method in parent class-->inheritance
		m.print1();
		
//		it is not child of car class
		D d=new D();
		System.out.println(d.a);// it print 0 

	}

}
