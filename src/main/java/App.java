import es.fustware.utils.DateUtils;

import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Date startDate = org.apache.commons.lang3.time.DateUtils.truncate(new Date(), Calendar.DATE);
        Date endDate = DateUtils.convertStrToDate("17-03-2019 23:00", "dd-MM-yyyy HH:mm");
        int diff = DateUtils.daysBetweenDates(startDate, endDate);
        System.out.println("Days between: " + diff);
    }
}
