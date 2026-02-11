public class Ex013ConversorDeCentimetros {

    public static void main(String[] args) {

        System.out.println("A altura é igual a: " + conversorDeCentimetros(68) + "cm");
        System.out.println("A altura é igual a: " + conversorDeCentimetros(6, 8) + "cm");
    }

    public static double conversorDeCentimetros(int polegadas) {

        return polegadas * 2.54;
    }

    public static double conversorDeCentimetros(int pes, int polegadas) {

        int totalPolegadas = pes * 12 + polegadas;

        return conversorDeCentimetros(totalPolegadas);
    }
}
