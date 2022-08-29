package com.cg.annotation;
import java.lang.reflect.Method;

@interface owncustom
{
	int accept();
	
}
class c
{
	@owncustom(accept=23)
	 public void display()
	 {
		System.out.println("I Am Using Custom Annotation :");
	 }
	
}


public class cutAnnotations {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		c c=new c();
		Method m=c.getClass().getMethod("Display");
		owncustom obj=m.getAnnotation(owncustom.class);
		
		c.display();
	}

}