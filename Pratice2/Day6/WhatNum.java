/**
 *һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ��٣�
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
