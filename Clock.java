/**
 * Class Clock
 * This is the Super Class
 */

public class Clock {
    private String hours;
    private String min;
    private String time;

    public String getHours() {
        hours = java.time.Instant.now().toString().substring(0,2);
        return hours;
    }

    public String getMin() {
        min = java.time.LocalTime.now().toString().substring(3,5);
        return min;
    }
    public String getTime() {
        time = getHours()+":"+getMin();
        return time;
    }


}


/**
 * Class WorldClock
 * This is the subclass
 */

public class WorldClock extends Clock{


    public WorldClock() {
        super();


    }

    @Override
    public String getHours() {
        String hours = String.valueOf(Integer.parseInt(super.getHours())+3);
        return hours;
    }
}


/**
 * Main Class
 * Checker class
 */


public class ClockCheck {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        System.out.println("My standard time is :"+myClock.getTime());
        WorldClock worldClock = new WorldClock();
        System.out.println("My standard time +3 is : "+worldClock.getTime());
    }
}