
package calendarpractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar  cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 1000);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
    
}
