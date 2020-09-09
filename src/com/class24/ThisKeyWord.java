package com.class24;

public class ThisKeyWord {
int a, b;
public ThisKeyWord(int a, int b) {
	this.a=a;
	this.b=b;
}
public ThisKeyWord() {
	System.out.println("I am non argument constructro");
}
public void sum(int a, int b) {
	System.out.println("The sum of local parameters are "+(a+b));
	System.out.println("The sum of the Instace Variables are "+(this.a+this.b));
}
public void sayA() {
	System.out.println(a);
}
public void sayB() {
	System.out.println(b);
}
public void sayAandB() {
	this.sayA();// not referred way of execution.
	sayB();// compiler adds this automatically--> this.sayB();
}
public static void main(String[] args) {
	ThisKeyWord obj=new ThisKeyWord(5, 10);
	obj.sum(10, 20);
	ThisKeyWord obj1=new ThisKeyWord();
	obj1.sum(100, 200);
	obj.sayA();
	obj.sayB();
	obj.sayAandB();// will print 5 and 10.
}
}
