import java.util.Scanner;

public class ClockAngle {
    private static int angle(int hours, int mins) {
        int hoursDegrees, minsDegrees;
        if(hours == 12)
            hours = 0;
        if (mins == 60)
            mins = 0;
        if (hours > 12 || mins > 60) {
            System.out.println("Enter valid hours and minutes");
            System.exit(0);
        }

        // 360 in 60 mins.. so 1 min = 6 degress
         minsDegrees = 6 * mins;
        // 12 hours 360 degress.. so 360/60*12 = 0.5 degrees in a min
         hoursDegrees = (int)((hours * 60 + mins ) * 0.5);

        int angle = Math.abs(hoursDegrees - minsDegrees);
        angle = Math.min(360 - angle, angle);

        return angle;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int hours = sc.nextInt();
        System.out.println("Enter minutes: ");
        int mins = sc.nextInt();
        System.out.println(angle(hours, mins));
    }
}
