// STUDENT NAME:
// DATE: 

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
        int JDN = 20033;
        int day = 2;
        int month = 2;
        int year = 2020;
        int y;
        int m;
        int a;
        int JDN1 = 70001;
        int day1 = 1;
        int month1 = 1;
        int year1 = 1970;
          int y1;
          int m1;
          int a1;
		/***** INITIALIZATION SECTION *****/
		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/
        a = (14 - month) / 12;
        y = year + 4800 - a;
        m = month + 12*a - 3;
        JDN = day + (153*m + 2) / 5 + (365*y) + (y/4) - (y/100) + (y/400)-32045;
        System.out.println(JDN);
        a1 = (14 - month1) / 12;
        y1 = year1 + 4800 - a1;
        m1 = month1 + 12*a1 - 3;
        JDN1 = day1 + (153*m1 + 2) / 5 + (365*y1) + (y1/4) - (y1/100) + (y1/400)-32045;
        System.out.println(JDN1);
		
		/***** OUTPUT SECTION *****/
  }
}