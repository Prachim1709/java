package come.basic;

import java.lang.classfile.constantpool.FloatEntry;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

/*
 *If the marks obtained by a student in five different subjects 
are input through the keyboard, find out the aggregate marks 
and percentage marks obtained by the student. Assume that 
the maximum marks that can be obtained by a student in each 
subject is 100.
 */

public class calcdemo {
public static void main(String[] args) {
	
	int eng,guj,hin,sci,math;
	 
	
	eng=40;
	guj=50;
	hin=45;
	sci=55;
	math=54;
	
	int total_marks = eng+guj+hin+sci+math;
	
 float percentage_marks =(total_marks*100/500);
 
 
 System.out.println(" english:"+eng);
 System.out.println(" gujrati:"+guj);
 System.out.println(" hindi:"+hin);
 System.out.println(" science:"+sci);
 System.out.println(" maths:"+math);
 
 
 System.out.println(" marks total:"+total_marks); 
 System.out.println(" percentage:"+percentage_marks);

	
}
}
