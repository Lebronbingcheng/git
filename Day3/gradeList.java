/*利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下*/
package Day3;
public class gradeList {
	public static void main(String[] args){
		for(int grade = 40; grade <= 100; grade++){
			judgeLevel(grade);
		}	
		int grade = -20;
		judgeLevel(grade);
		
		int grade2 = 102;
		judgeLevel(grade);
	}
	
	public static void judgeLevel(int grade){
		if(grade >= 90){
			System.out.println("the level of this student is A");
		}else if(grade >= 60 && grade <90){
			System.out.println("the level of this student is B");
		}else if(grade < 60 && grade >= 0){
			System.out.println("the level of this student is C");
		}else{
			System.out.println("the grade is not valued");
		}
	}

}
