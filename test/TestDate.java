
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;

/*
 * Copyright(C) VTN from 2018 to Present
 *  All rights Reserved
 * 
 */
/**
 *
 * @author votun
 */
public class TestDate {

    private static final DateTimeFormatter formatter
            = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");

    public static int checkDayCard(String dateBack) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
        String dateNow = sdf.format(new Date());
        Date d1;
        Date d2;
        Date d3;

        int diffDays = 0;
        long diff, diff1;
        try {
            d1 = sdf1.parse(dateBack);
            d2 = sdf.parse(dateBack);
            d3 = sdf.parse(dateNow);

            Calendar cal = Calendar.getInstance();
            System.out.println("D2" + d2);
            cal.setTime(d2);
            cal.set(Calendar.YEAR, 1);
            System.out.println("D2" + cal.getTime());
            diff1 = (d1.getTime() + 1) + d2.getTime();

            System.out.println("d1gettime: " + d1.getTime());
            System.out.println("diff1 : " + diff1);
            System.out.println("d3 gettime: " + d3.getTime());
            diff = d3.getTime() - diff1;
            System.out.println("diff: " + diff);
            diffDays = (int) diff / (24 * 60 * 60 * 1000);

        } catch (ParseException e) {
        }

        return diffDays;

    }

    public static void main(String[] args) {
        String currentDateString = "2017-05-06";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        LocalDate datee = LocalDate.parse(currentDateString, dtf);
        datee = datee.plusYears(1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNow = sdf.format(new Date());
        String afterDay = datee.format(dtf);
        Date d2;
        Date d3;
        long diff, diffDays = 0;
        try {

            d2 = sdf.parse(afterDay);
            d3 = sdf.parse(dateNow);
            diff = d3.getTime() - d2.getTime();
            diffDays = diff / (24 * 60 * 60 * 1000);

        } catch (ParseException e) {
        }
        System.out.println("diff: " + diffDays);
    }

}
