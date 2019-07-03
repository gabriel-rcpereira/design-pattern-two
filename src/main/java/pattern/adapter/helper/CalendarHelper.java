package pattern.adapter.helper;

import pattern.adapter.contract.CalendarAdapter;

import java.util.Calendar;

public class CalendarHelper implements CalendarAdapter {

    @Override
    public Calendar getToday() {
        return Calendar.getInstance();
    }
}
