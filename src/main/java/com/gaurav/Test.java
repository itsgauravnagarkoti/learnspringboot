package com.gaurav;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Component;


public class Test {

//	@Override
//	public void fun() {
//		// TODO Auto-generated method stub
//		System.out.println("Fun Method Called Successfully!");
//		
//	}
	
	public static void main(String[] args) {
		
//		new Test().fun();  // normal way 
		
		
		
		// alias name way to call function.
		
//		TestInterface  t = new TestInterface() {
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				System.out.println("Fun Method Called Successfully!");
//				
//			}
//			
//		};
//		
//		t.fun();
		
		
		
		// lamda expression
		
		TestInterface t = ()-> System.out.println("Fun Method Called Successfully!");
		
		t.fun();
		
		M2 calSum = ()->{
			return 10;
		};
		
		System.out.println("Sum of Values : ->"+calSum.sum());
		
		
      Multi m3 = (a,b)->{
    	  return a*b;
      };
      
      
      System.out.println("Multiple : -->"+m3.multiply(10, 20));
      
      
      
      t4 t2 =()->{
    	  return new int[] {25,56,69};
      };
      
      System.out.println("Print numbers of Array:-->"+Arrays.toString(t2 .getNumbers()));
      
      
      
     T5 t5 = () ->{
    	  Student s1 = new Student(1,"","");
    	 
    	  return s1;
    	  
      };
      
      Student s5 = t5.getStudent();
      System.out.println("Get Id : ------------------>"+t5.getStudent().getId());
      System.out.println("Get Name :------------------>"+t5.getStudent().getName());
      System.out.println("Get Mobile No :------------------>"+t5.getStudent().getMobileno());
      
      
      
     T6 t6 = ()->{
    	  List<Student> ls =  Arrays.asList(new Student(1,"Rakesh","9838545922")) ;
    	  return ls;
      };
      
      List<Student> result = t6.getStudents();
      
      result.forEach(al-> System.out.println(al.getName()));
	}
	
	
}
