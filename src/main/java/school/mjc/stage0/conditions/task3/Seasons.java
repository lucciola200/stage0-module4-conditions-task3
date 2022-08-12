package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
//        spring, summer, fall, and winter
        if (month >= 6) {
            System.out.println("summer");
        } else if (month == 5) {
            System.out.println("spring");
        } else if (month == 4) {
            System.out.println("winter");
        } else if (month == 3) {
            System.out.println("fall");
        } else {
            System.out.println("wrong number!");
        }

    }
}
