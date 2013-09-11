
import java .util. Scanner;


import java.util.Calendar;

public class Main {


public static void main(String[] args) {

Scanner input = new Scanner (System.in);

System.out.println("Enter your Nic number :");

String bday = input.nextLine();

String year = bday.substring(0, 2);

int year1= Integer.parseInt(year);

year1=year1+1900; 



String days = bday.substring(2,5);

int days1=Integer.parseInt(days);

if(days1>500){

days1= days1-500;



}

Calendar c = Calendar.getInstance();

c.set(c.DAY_OF_YEAR, days1);

int month= c.get(c.MONTH)+1;

int mydate = c.get(c.DATE)-1; 

System.out.println(year1 + "-" +month +"-" + mydate);

}

}