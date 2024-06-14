package edu.atria.java.secondpackage;

import edu.atria.java.base.Base;

public class ExecutorTwo extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bTwo=new Base();
		//private members are not accesible outdide the class
		//System.out.println(bTwo.variablePrivate);//
		
		// //default  members are not accesible outdide the class
		//System.out.println(bTwo.variableDefault);//
		
		ExecutorTwo ex=new ExecutorTwo();
		System.out.println(ex.variableProtected);
		
		System.out.println(ex.variablePublic);

	}

}
