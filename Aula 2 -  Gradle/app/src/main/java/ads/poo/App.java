/*
 * This source file was generated by the Gradle 'init' task
 */
package ads.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int moeda1 = 0;
        int moeda5 = 0;
        int moeda10 = 0;
        int moeda25 = 0;
        int moeda50 = 0;
        int moeda100 = 0;

        Scanner scan = new Scanner(System.in);
        boolean ativo = true;
        while (ativo){
            System.out.println("Digite o valor da sua moeda ou digite 0, se tiver acabado.");
            int moeda = scan.nextInt();
            switch (moeda){
                case(1):
                    moeda1++;
                    break;
                case(5):
                    moeda5++;
                    break;
                case(10):
                    moeda10++;
                    break;
                case(25):
                    moeda25++;
                    break;
                case(50):
                    moeda50++;
                    break;
                case(100):
                    moeda100++;
                    break;
                case(0):
                    ativo = false;
                    break;
                default:
                    System.out.println("Valor de moeda inválido");
                    break;
            }
        }
        System.out.println("Moedas de 1 centavo:" + moeda1);
        System.out.println("Moedas de 5 centavos:" + moeda5);
        System.out.println("Moedas de 10 centavos:" + moeda10);
        System.out.println("Moedas de 25 centavos:" + moeda25);
        System.out.println("Moedas de 50 centavos:" + moeda50);
        System.out.println("Moedas de 100 centavos:" + moeda100);
        int total = moeda1 + moeda5*5 + moeda10*10 + moeda25*25 + moeda50*50 + moeda100*100;
        double reais = total;
        reais = reais/100;
        System.out.println("Você tem " + total + " centavos, ou " + reais + " reais.");
    }
}
