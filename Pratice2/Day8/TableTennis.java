/**
 * ����ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ��ѳ�ǩ��������������������
��Ա����������������a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ������� 
 */
package Day8;

public class TableTennis {
	public static void main(String[] args){
		char i,j,k;
		for(i = 'x'; i <= 'z'; i++){
			for(j = 'x'; j <= 'z'; j++){
				if(i != j)
					for(k = 'x'; k <= 'z'; k++){
						if(i != k && j != k){
							if (i != 'x' && k != 'x' && k != 'z')
								 System.out.println("A PK "+i+",B PK "+ j+",C PK"+ k);
						}
					}
			}
		}
	}
}
