package com.class38;

public class Recap {
public static void main(String[] args) throws InterruptedException{
	int num=1;
	
	// runtime- unchecked exception
	int [] nums= {12,13};
	try {
	System.out.println(nums[2]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("try to access element outside of the boundry");
	}
	//compile time -checked
	Thread.sleep(10000);
	System.out.println("End of the code");
}
}
