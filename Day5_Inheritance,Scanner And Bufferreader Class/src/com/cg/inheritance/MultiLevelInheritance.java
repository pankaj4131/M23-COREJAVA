package com.cg.inheritance;

//Program on multilevel inheritance
//Parent class

class Bike
{
	protected int speed;
	void display()
	{
		System.out.println("I Like To Drive A Bike");
	}
}

//Parent class for Pulser125 and child class for bike
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is : "+speed);
	}
}
class Pulser125 extends Pulser
{
	void accept()
	{
		System.out.println("Color is : "+color);
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pulser125 p=new Pulser125();
		p.color="Black";
		p.speed=60;
		p.accept();
		p.display();
		p.print();


	}

}
