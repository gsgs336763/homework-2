package homework_2;

import java.lang.reflect.Array;

public class p_41 {
	
	public static void main(String[] atgs)
	{
		
		int[]test;
		test=new int[5];
		
		test[0]=80;
		test[1]=60;
		test[2]=22;
		test[3]=50;
		test[4]=75;
		
		test[10]=75;
		
		for(int i=0;i<5;i++)
		{
			System.out.println("第"+(i+1)+"的人的分數"+test[i]+"分");
		}
		
	}
	
}
