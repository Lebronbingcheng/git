/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
package Day4;

import java.util.Scanner;

public class everyNum {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);  
        String s=scan.nextLine();  
		countResult(s);
		
	}
	public static void countResult(String s){
		int numCount = 0;
		int engCount = 0;
		int spaceCount = 0;
		int otherCount = 0;
		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length; i++){
			if(Character.isDigit(ch[i])){
				numCount++;
			}else if(Character.isLetter(ch[i])){
				engCount++;
			}else if(Character.isSpaceChar(ch[i])){
				spaceCount++;
			}else{
				otherCount++;
			}
		}
		System.out.println("字符中数字的个数为" + numCount + "个");
		System.out.println("字符中字母的个数为" + engCount + "个");
		System.out.println("字符中空格的个数为" + spaceCount + "个");
		System.out.println("字符中其他字符的个数为" + otherCount + "个");
	}

}
