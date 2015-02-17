package com.sumvariable;

/*
 * given 2 inputs:
 *   v = number of variables which can hold non negative integers.
 *   s = sum of the n non negative integers,
 *   Find the number of ways to in which you can use n variables so that its sum is s.
 * 
 */

public class SumVariable {
	
	public static int result=0;
	public static int sum=3;
	public static int var=3;

	public static void main(String[] args) {
		solveProblem(0,1);
		System.out.println("result:"+result);
	}
	
	public static void solveProblem(int value, int level){
		System.out.println("---------------level:"+level);
		if(level > var){
			System.out.println("<<<<<return back");
			return;
		}
		for( int i=0 ;i<=sum;i++){
			if(level == var && (value +i) == sum){
				System.out.println("++++value:"+value+" i:"+i);
				result++;
			}else{
				if(level < var && (value +i) <= sum){
					System.out.println("calling value:"+value+" i:"+i);
					solveProblem(i+value, level+1);
				}
			}
		}
	}
	
	
}
