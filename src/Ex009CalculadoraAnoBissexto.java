public class Ex009CalculadoraAnoBissexto {

    public static void main(String[] args) {

        calcularAnoBissexto(1600);

    }

    public static void calcularAnoBissexto(int ano) {

        if (ano < 1 || ano > 9999) {
            System.out.println("Valor inválido");
        } else {
            if (ano % 4 == 0) {

                if (ano % 100 == 0) {

                    if (ano % 400 == 0) {
                        System.out.println(ano + " é ano bissexto");

                    } else {
                        System.out.println(ano + " não é ano bissexto");
                    }

                } else {
                    System.out.println(ano + " não é ano bissexto");
                }

            } else {
                System.out.println(ano + " não é ano bissexto");
            }
        }
    }
}
