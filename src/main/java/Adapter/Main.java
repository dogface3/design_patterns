package Adapter;

public class Main {
    public static void main(String[] args){
        CalendarToNewDateAdapter calendar = new CalendarToNewDateAdapter();

        calendar.setDay(3);
        calendar.setMonth(2);
        calendar.setYear(1992);

        System.out.println("date " + calendar);
        calendar.advanceDays(3);
        System.out.println("new date " + calendar);
    }
}
