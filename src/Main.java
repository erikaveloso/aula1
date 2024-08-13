// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//
//        Sala de aula
//        int num1 = 20;
//        int num2 = 40;
//        int total;
//        total = num1+num2;
//        System.out.println(total);
//
//        if(num1>num2) {
//            System.out.println("é maior");
//        } else if (num1==num2){
//            System.out.println("é igual");
//        } else {
//            System.out.println("é menor");
//        }
//
//        int x = 10;
//        int y = 5;
//        boolean resp = (x > y) && (y == 0);
//        System.out.println(resp);


//      Exercicio  1
        int horaTrabalhada = 15;
        int qntHoras = 40;
        double salario = (horaTrabalhada * qntHoras) * 4;
        System.out.println(salario);

//      Exercicio  2
        int x = 200;
        int y = 150;

        if(x>y) {
            System.out.println("é maior");
        } else if(x==y) {
            System.out.println("é igual");
        } else {
            System.out.println("é menor");
        }

//      Exercicio  3
        double nota1 = 7.0;
        double nota2 = 7.0;
        double nota3 = 8.0;
        double media;
        media = (nota1 + nota2 +nota3)/3;

        if(media >= 7.0) {
            System.out.println("aprovado");
        } else if(media < 4.0) {
            System.out.println("reprovado");
        } else {
            System.out.println("final");
        }

//        Exercicio 4
        double salario = 2500.00;

        if (salario <= 900) {
            System.out.println("isento");
        } else if(salario >= 901 || salario <1500) {
            System.out.println("desconto de 5%");
        } else if(salario = 1501 || salario <2500) {
            System.out.println("desconto de 10%");
        } else {
            System.out.println("desconto de 20%");
        }


    }
}