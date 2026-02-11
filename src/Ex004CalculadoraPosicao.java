public class Ex004CalculadoraPosicao {

    public static void main(String[] args) {

        int posicaoJogador = calcularPosicao(1500);
        mostrarPosicao("Peter", posicaoJogador);

        posicaoJogador = calcularPosicao(1000);
        mostrarPosicao("Jorge", posicaoJogador);

        posicaoJogador = calcularPosicao(500);
        mostrarPosicao("Nyx", posicaoJogador);

    }

    public static void mostrarPosicao(String nomeJogador, int posicaoJogador) {
        System.out.println(nomeJogador + " conseguiu ficar na posição " + posicaoJogador);

    }

    public static int calcularPosicao(int pontuacaoJogador) {

        int posicao = 4;

        if (pontuacaoJogador >= 1000) {
            posicao = 1;
            
        } else if (pontuacaoJogador >= 500) {
            posicao = 2;
            
        } else if (pontuacaoJogador >= 100) {
            posicao = 3;

        } return posicao;

    }
}