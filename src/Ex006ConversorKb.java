public class Ex006ConversorKb {

    public static void main(String[] args) {

        mostrarMegaBytesEKiloBytes(2500);

    }

    public static void mostrarMegaBytesEKiloBytes(int kiloBytes) {

        int restoKiloBytes = kiloBytes % 1024;
        int calculatedMegaBytes = kiloBytes / 1024;

        if (kiloBytes < 0) {
            System.out.println("Valor inválido");
        } else {
            System.out.println(kiloBytes + " KB = " + calculatedMegaBytes + " MB and " + restoKiloBytes + " KB");
        }
    }
}
