
//Declaração de Variáveis
//Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.
//A estrutura padrão para se declarar uma variável sempre é:
//<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //tipos primitivos
        //estudar a classe Sring que representa texto na aplicação

        String meuNome = "Leandro Matos";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14;
    }
}
