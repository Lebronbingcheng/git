/**
 *一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 */
package Day6;

public class WhatNum {
	public static void main(String[] args){
		int a = 0;
		for(int i = 1; i <= 100; i += 2){
			if(i == 39){
				System.out.println("this int is " + (a - 100));
				break;
			}
			a += i;
		}
	}
}
