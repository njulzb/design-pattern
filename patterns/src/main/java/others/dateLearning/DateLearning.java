package others.dateLearning;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateLearning {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("MM/dd/yy");
        Date date = format.parse("1/1/10");
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-1);
        date = calendar.getTime();
        System.out.println(format.format(date));
    }
}
