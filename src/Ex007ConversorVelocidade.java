public class Ex007ConversorVelocidade {

    public static void main(String[] args) {

        mostrarConversao(75.144);
    }

    public static void mostrarConversao(double kilometrosPorHora) {

        double milhasPorHora = 1.609;

        if (kilometrosPorHora < 0) {
            System.out.println("Valor inválido");

        } else {
            long velocidadeConvertida = Math.round(kilometrosPorHora / milhasPorHora);
            System.out.println(kilometrosPorHora + " km/h = " + velocidadeConvertida + " mi/h");
        }
    }
}