public class Ex005ChecadorNumerico { // Positivo, Negativo e zero

    public static void main(String[] args) {

        checarNumero(0);

    }

    public static void checarNumero(int numero) {

        if (numero > 0) {
            System.out.println("Positivo");

        } else if (numero < 0) {
            System.out.println("Negativo");

        } else {
            System.out.println("Zero");
        }
    }
}
