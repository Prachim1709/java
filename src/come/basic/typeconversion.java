package come.basic;

import java.io.CharConversionException;

/* 
 * type conversion: convert one primitive datatype
 * to another
 * 
 * types:
 * implicit conversion:
 * smaller data type to bigger datatype
 * eg:
 * 4 int i1=10;
 * 8 long l1=i1
 * 
 * explicit conversion
 * bigger datatype to smaller datatype
 * 
 */
public class typeconversion {
  public static void main(String[] args) {
	  int i1=214783647;
	  long l1=2147483649l;
	  System.out.println("implicit CharConversionException is:"+l1);
	  /*
	   * -2147483648
	   * -2147483647
	   * -2147483646
	   * 
	   */
	  int i2=(int)l1;
	  System.out.println("explicit conversion is:"+i2);
	  
	  int i3=989898;
	  byte b1=(byte)i3;  // -128 -127 to 127
	  
	  System.out.println("explicit conversion is:"+b1);
	  
	  char ch='A'; // 2byte
	  int i5=ch; //4
	  
	  System.out.println("char is:"+i5);
	  
	
}
}
