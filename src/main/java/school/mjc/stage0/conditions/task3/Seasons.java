package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
//        spring, summer, fall, and winter
        if (month >= 6 && month < 9) {
            System.out.println("Summer");
        } else if (month >= 3 && month < 6) {
            System.out.println("Spring");
        } else if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 9 && month < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("wrong number!");
        }
    }
}
