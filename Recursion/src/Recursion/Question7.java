/**
 * 日本著名数学游戏专家中村义作教授提出这样一个问题：父亲将2520个桔子分给六个儿子。
 * 分完 后父亲说：“老大将分给你的桔子的1/8给老二；老二拿到后连同原先的桔子分1/7给老三；
 * 老三拿到后连同原先的桔子分1/6给老四；老四拿到后连同原先的桔子分1/5给老五；
 * 老五拿到后连同原先的桔子分1/4给老六；老六拿到后连同原先的桔子分1/3给老大”。
 * 结果大家手中的桔子正好一样多。问六兄弟原来手中各有多少桔子？
 */
package Recursion;

public class Question7 {
	public static void main(String[] args){
		for(int i = 1; i < 7; i++){
			System.out.print("the" + i + "-th man has " + count(1, i, 240) + " oranges at the beginning");
			System.out.println();
		}
	}
	
	public static int count(int last, int bro, int last_num){
		if(bro == 1){
			return 240;
		}
		if(bro == last + 1){
			return (420 * (8 - last) * (9 - last) - (7 - last) * last_num) / ((7 - last) * (9 - last));
		}
		return count(last + 1, bro, (420 * (8 - last)) / (7 - last));
	}


}
