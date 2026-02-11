public class Ex010ComparadorDecimal {

    public static void main(String[] args) {

        temTresCasasDecimaisIguais(3.234, 3.234);

    }

    public static void temTresCasasDecimaisIguais(double numero1, double numero2) {

        int calculo1 = (int) (numero1 * 1000); // 3.234 -> 3234
        int calculo2 = (int) (numero2 * 1000); // 3.234 -> 3234

        if (calculo1 == calculo2) {
            System.out.println("Iguais");

        } else {
            System.out.println("Diferentes");
        }


    }
}
