public class Ex014ConversorDeSegundos {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationStrings(-65, 45));
        System.out.println(getDurationStrings(65, 145));
        System.out.println(getDurationStrings(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int segundos) {

        if (segundos < 0) {
            return "Valor inválido para segundos (" + segundos + "), número positivo necessário";
        }

        return getDurationStrings(segundos / 60, segundos % 60);
    }

    public static String getDurationStrings(int minutos, int segundos) {

        if (minutos < 0) {
            return "Valor inválido para minutos (" + minutos + "), número positivo necessário";
        }

        if ( segundos < 0 || segundos > 59) {
            return "Valor inválido para segundos (" + segundos + "), número entre 0 e 59 necessário";
        }

        int horas = minutos / 60;
        int restMinutos = minutos % 60;

        return horas + "h " + restMinutos + "m " + segundos + "s";
    }
}
