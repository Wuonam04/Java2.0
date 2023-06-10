package Time;

public class Time1 {
    public static void main(String[] args){
        long p = System.currentTimeMillis();
        long totalSeconds = p /1000;
        long currentSeconds = p % 60;
        long totalMinutes = p / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes /60;
        long currentHour = totalHours % 24;
        System.out.println("Current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds + " GMT");
    }
}
