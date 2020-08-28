import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter space separated date like 'Date Month Year'");
        int date=input.nextInt();
        int month= input.nextInt();
        int year=input.nextInt();
        System.out.println("Reaming no of days in your given date is = "+getDaysInMonth(date,month,year));
    }
    public static boolean isLeapYear(int year){
        if ((year<1)||(year>9999)){
            return false;
        }else{
            if ((year%4==0&&year%100!=0)||(year%400==0)){
                return true;
            }else
            return false;
        }
    }
    public static int getDaysInMonth(int date,int month,int year){
        if((date<1)||(date>31)||(month<1)||(month>12)||(year<1)||(year>9999)){
            return -1;
        }else{
            switch (month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return (31-date);
                case 2:
                    if (isLeapYear(year)){
                        return (29-date);
                    }else
                        return (28-date);
                default:
                    return (30-date);
            }
        }
    }
}
