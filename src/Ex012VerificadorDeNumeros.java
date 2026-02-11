public class Ex012VerificadorDeNumeros {

    public static void main(String[] args) {

        temAdolescente(2, 45, 13);
        eAdolescente(4);

    }
    public static boolean temAdolescente(int numero1, int numero2, int numero3) {
        return eAdolescente(numero1) || eAdolescente(numero2) || eAdolescente(numero3);
    }

    public static boolean eAdolescente(int numero1) {
        return numero1 >= 13 && numero1 <= 19;
    }
}
