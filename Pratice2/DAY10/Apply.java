/**
 * 有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问
第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个
人多大？ 
 */
package DAY10;

public class Apply {
	public static void main(String[] args){
		int[] age = new int[5];
		age[0] = 10;
		int finalAge = 0; 
		for(int i = 1; i <= 4; i++){
			age[i] = age[i-1] + 2;
			finalAge = age[i];
		}
		System.out.println("the age of the fifth child is " + finalAge);
	}

}
