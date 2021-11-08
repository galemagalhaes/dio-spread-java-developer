package dio.spread;

public class ExerciciosDoCurso {
    public static void main(String[]args){
        // Primeiro exercício: exemplos de variáveis

        int i;
        // int i; erro em tentar criar outra variável com mesmo nome
        int I; // case sensitive
        // int 1a; erro ao iniciar nome com número
        int _1a; // é permitido, mas não segue boas práticas o uso de _
        int $aq; // é permitido, mas não segue boas práticas o uso de $

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        // j = 15; erro ao tentar atribuir novo valor à variavel constante

        int asrn24678ad;
        // int asrn246 78ad; erro ao colocar espaço em branco no nome
        int asrn2$4678_ad = 10;
        // int asrn2$46%78_ad = 10; erro ao usar %

        asrn24678ad = 100;
        //asrn2$4678_ad = 10; a variável já foi inicializada com o valor 10

        int quantidadeProduto = 50;
        // int QuantidadeProduto; não segue boas práticas ao iniciar nome com maiúscula

        final int NUMERO_TENTATIVAS = 5;
        // final int numeroTentativas = 5; não segue boas práticas ao usar minúsculas em uma variável "final"
        // int QUANTIDADE_OPCOES = 25; não segue boas práticas ao usar maiúsculas em uma variável comum
        // int qdtProd; não segue boas práticas ao usar um nome pouco expressivo, não claro

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678ad);
        System.out.println(asrn2$4678_ad);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);



        // segundo exercicio: tipos de dados
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // short s2 = 40000; maior do que o tipo aceita

        // int i1 = 10000000000; maior do que o tipo aceita
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        // long l2 = 28040050005000000000L; maior do que o tipo aceita

        // float f1 = 4.5; sem o "f" ou "F" no final
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.040;

        char c1 = 'M';
        // char c2 = 'Tm'; mior do que o tipo aceita
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "Uma frase com palavras e numeros 0213654 8799";

        String dt1 = "08/11/2021"; // a data será impressa como texto, se o tipo for data, não pode ser String

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(l1);
        System.out.println(f2);
        System.out.println(l1);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(dt1);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}
