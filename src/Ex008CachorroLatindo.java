public class Ex008CachorroLatindo {

    public static void main(String[] args) {

        deveLevantar(true, 2);
    }

    public static void deveLevantar(boolean cachorroLatindo, int horaDaNoite) {

        if (horaDaNoite < 0) {
            System.out.println("Hora inválida");
        } else if (horaDaNoite > 23) {
            System.out.println("Hora inválida");
        }

        if (horaDaNoite < 8 && cachorroLatindo) {
            System.out.println("Levante, o cachorro está latindo.");
        } else if (horaDaNoite > 22 && cachorroLatindo) {
            System.out.println("Levante, o cachorro está latindo");
        } else if (horaDaNoite < 8 || horaDaNoite > 22) {
            System.out.println("O cachorro não está latindo");
        }

    }
}
