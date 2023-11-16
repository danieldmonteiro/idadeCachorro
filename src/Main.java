import java.util.Scanner;

// Cálculo da "idade humana" dos cachorros conforme fórmula apontada em estudo recente
// de cientistas da Universidade da Califórnia
// (https://www.uol.com.br/tilt/noticias/redacao/2019/11/19/multiplicar-por-sete-esta-errado-como-calcular-idade-humana-do-cachorro.htm)

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Seja bem-vindo(a)!");
        System.out.println();
        System.out.println("Vamos calcular a idade aproximada de seu cachorro equivalente à idade humana!");
        System.out.println();
        System.out.println("Qual o nome do seu cachorro?");
        System.out.println();
        String nome = sc.nextLine();
        int idade = 1;
        boolean continuaLoop = true;

        do{

            try {
                System.out.println();
                System.out.println("Qual a idade de " + nome + "? (número inteiro)");
                System.out.println();
                idade = sc.nextInt();
                continuaLoop = false;


            } catch (Exception e){
                System.out.println();
                System.out.println("Você digitou um número inválido. Tente novamente!");
                System.out.println();
                sc.nextLine();
            };
        } while (continuaLoop);

        continuaLoop = true;

        while (idade <= 0){ do {

            try {
                System.out.println();
                System.out.println("Você digitou um número inválido. Tente novamente!");
                System.out.println();
                System.out.println("Qual a idade de " + nome + "? (número inteiro)");
                System.out.println();
                idade = sc.nextInt();
                continuaLoop = false;


            } catch (Exception e){

                sc.nextLine();
            };
        } while (continuaLoop);

        };

        double calculo = 16 * Math.log(idade) + 31;

        int idadeHumana;

        idadeHumana = (int)calculo;

        System.out.println();
        System.out.println("A idade de " + nome + " é aproximadamente equivalente à idade humana de " + idadeHumana + " anos!");
        System.out.println();
        System.out.println("Até logo!");


    }
}