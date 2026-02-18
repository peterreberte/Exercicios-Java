public class Ex014ConversorDeSegundos {

    public static void main(String[] args) {

        getDurationString(3600);

    }

    public static void getDurationString(int seconds) {

        int minutes = seconds / 60;

        getDurationStrings(minutes, seconds);
    }

    public static void getDurationStrings(int minutes, int seconds) {

        int hour = seconds / 3600;
        int restMinutes = minutes % 60;
        int restSeconds = seconds % 60;

        System.out.println(seconds + "s = " + hour + "h " + restMinutes + "m " + restSeconds + "s");
    }
}
