/*���������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60������*/
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
