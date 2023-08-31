public class Operadores {
    public static void main(String[] args) {
    //classe Operadores.java

        //String nome = "Leandro";
        //int idade = 22;
        //double peso = 68.5;
        //char sexo = 'M';
        //boolean doadorOrgao = true;
        //Date dataNascimento = new Date();

    //Operadores Aritméticos
    // + (adição), - (subtração), * (multiplicação) e / (divisão)

        //double soma = 10.5 + 15.7;
        //int subtracao = 113 - 25;
        //int multiplicacao = 20 * 7;
        //int divisao = 15 / 3;
        //int modulo = 18 % 3;
        //double resultado = (10 * 7) + (20 / 4);

    //ATENÇÃO! O Operador de adiçã(+), quando utilizado em variáveis do tipo texto, realizará a "concatenação de textos".
        //String nomeCompleto = "LINGUAGEM" + "JAVA";
        //System.out.println(nomeCompleto);

    //qual o resutado das impressoes abaixo

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        
        System.out.println(concatenacao);
        
    }
}
