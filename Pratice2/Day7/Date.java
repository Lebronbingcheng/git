package Day7;

public class Date {
	int year;
	int month;
	int day;
	
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	/*�ж�һ������ǲ�������*/
	private boolean isLeapYear(){
		if(year % 4 == 0){
			return true;
		}
		return false;
	}
	
	/*�ж�������ж�����*/
	public int dayNum(int a){
		if(a == 1 || a ==3 || a ==5 || a ==7 || a ==8 || a ==10 || a ==12){
			return 31;
		}else if(a == 2){
			if(this.isLeapYear()){
				return 29;
			}
			return 28;
		}else{
			return 30;
		}
	}
	
	/*�ж��ǵڼ���*/
	public int judgeNum(){
		int sum = 0;
		for(int i = 1; i < month; i++){
			int num = this.dayNum(i);
			sum += num;
		}
		sum += day;
		return sum;
	}
}
