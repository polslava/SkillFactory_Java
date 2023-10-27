

import java.util.Calendar;

public class Time {
    int millis = 1000;
    public void getTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        System.out.println(calendar.getTime());
    }

}

   // Измените в классе Time код так, чтобы на экран вывелось:
  //   Thu Jan 01 00:00:01 UTC 1970
//в IDE выводится локальная временная зона, но в тестере зона UTC