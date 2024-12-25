
import javax.swing.*;
public class Lab402 {

    public static void main(String[] args) {

        int year = Integer.parseInt(JOptionPane.showInputDialog(null,"Input year: "));
        while (!checkYear(year)) {
             year = Integer.parseInt(JOptionPane.showInputDialog(null,"Input year: "));
        }
        
        JOptionPane.showMessageDialog(null,(isLeapYear(year))?year+" is Leap year.":year+
        		" is NOT Leap year");

        //if(isLeapYear(year)==true) {

            //JOptionPane.showMessageDialog(null,year+ "is Leap year.");
        //}
        //else {
            //JOptionPane.showMessageDialog(null,year+ "is NOT Leap year.");
        //}


    }//end of main
    public  static boolean isLeapYear (int _year) {
    	
    	return (_year % 4 == 0 && _year % 100 != 0 || _year % 400 == 0);

        //if(_year%4==0&&_year%100!=0||_year%400==0) {

            //return true;
        //}
        //else {
          //  return false;
       // }


    }
    public static boolean checkYear(int _year) {
    	
    	return (_year >= 1000 && _year <= 3000);

        //if (_year>=1000&&_year<=3000) {
            //return true;
        //}
        //else {
           // return false;
       // }
    }

}