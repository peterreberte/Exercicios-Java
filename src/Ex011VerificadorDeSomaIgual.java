public class Ex011VerificadorDeSomaIgual {

    public static void main(String[] args) {

        temSomaIgual(3, 3, 6);

    }

    public static boolean temSomaIgual(int numero1, int numero2, int numero3) {

        if (numero1 + numero2 == numero3) {
            return true;
        }
        return false;
    }
}
