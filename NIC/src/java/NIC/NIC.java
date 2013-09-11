package NIC;
import java .util. Scanner;


import java.util.Calendar;

public class NIC {

public String[] calculate(String input){


            String bday = input;

            String year = bday.substring(0, 2);

            int year1 = Integer.parseInt(year);

            year1 = year1 + 1900;

            String gender;
            String voter;

            String days = bday.substring(2, 5);

            int days1 = Integer.parseInt(days);

            if (days1 > 500) {

                days1 = days1 - 500;
                gender="FEMALE";

            }
            else
                gender= "MALE";
            

            Calendar c = Calendar.getInstance();

            c.set(c.DAY_OF_YEAR, days1);

            int month = c.get(c.MONTH) + 1;

            int mydate = c.get(c.DATE) - 1;
            if (year1> 1995)
                voter="false";
            else
                voter="true";
            
            String y=Integer.toString(year1);
            String m=Integer.toString(month);
            String d=Integer.toString(mydate);
            String[] a={y,m,d,gender,voter};
            return a;

        }
}