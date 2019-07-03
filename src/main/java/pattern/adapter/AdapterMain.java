package pattern.adapter;

import pattern.adapter.contract.CalendarAdapter;
import pattern.adapter.helper.CalendarHelper;

public class AdapterMain {

    public static void main(String[] args){
        CalendarAdapter calendarHelper = new CalendarHelper();
        System.out.println(calendarHelper.getToday().getTime().toString());
    }
}
