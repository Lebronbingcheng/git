/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
package Day7;

public class YearMonthDay {
	public static void main(String[] args){
		Date date = new Date(2016,3,1);
		System.out.println(date.judgeNum());
	}
}
