/**
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
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
		System.out.println("�ַ������ֵĸ���Ϊ" + numCount + "��");
		System.out.println("�ַ�����ĸ�ĸ���Ϊ" + engCount + "��");
		System.out.println("�ַ��пո�ĸ���Ϊ" + spaceCount + "��");
		System.out.println("�ַ��������ַ��ĸ���Ϊ" + otherCount + "��");
	}

}
