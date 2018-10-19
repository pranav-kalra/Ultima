import java.util.Scanner;

public class Main {

    public static int worldTime = 0;
    public static Scanner scan;
    public static void main(String[] args) {
        scan = new Scanner(System.in);

        worldTime = 168260271;
        timeConverter();
        worldTime = 27364375;
        timeConverter();
        worldTime = 67294091;
        timeConverter();

    }



    public static int calcYear() {
        int year = worldTime / (60 * 24 * 365) + 1;
        return year;
    }

    public static int calcDay() {
        int day = (worldTime % (60 * 24 * 365)) / (60 * 24) + 1;
        return day;
    }

    public static int calcHour() {
        int hour = ((worldTime % (60 * 24 * 365)) % (60 * 24)) / 60;
        return hour;
    }

    public static int calcMinute() {
        int minute = ((worldTime % (60 * 24 * 365)) % 1440) % 60;
        return minute;
    }


    public static int calcTrammel() {
        int moonDay = (worldTime  / (60 * 24));
        int trammel = (moonDay % 9) + 1;
        return trammel;
    }

    public static int calcFelucca() {
        int moonDay = (worldTime  / (60 * 24));
        int felucca = (moonDay % 14) + 1;
        return felucca;
    }

    public static void timeConverter() {
        System.out.println("worldTime = " + worldTime);
        System.out.printf("It is %d:%02d on day %d of the year %d.\n",calcHour(),calcMinute(),calcDay(),calcYear());
        System.out.printf("Trammel is in day %d of its 9 day phase.\n",calcTrammel());
        System.out.printf("Felucca is in day %d of its 14 day phase.\n\n",calcFelucca());
    }
}
