/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomatematico;

import java.util.Random;
import java.util.Scanner;

public class Game {

    int tentativas = 3;
    int pontos = 0;
    int rodadas = 0;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int userRes;

    public void NewClass() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Bem-vindo ao nosso jogo educativo matematico! \nNesse jogo sera testado suas habilidades matematicas! \nQuando estiver pronto "
                + "digite OK\n");

        String userStart = sc.nextLine();
        
        int userRes;

        if (userStart.equals("OK") || userStart.equals("ok")) {

            while (tentativas > 0) {
                if (tentativas == 0) {
                    System.out.println("Voce perdeu otario! \nPONTO GANHOS: " + pontos);
                    break;
                } else {
                    jogoAdicao();
                    jogoSubtracao();
                    jogoMultiplicacao();
                    jogoDivisao();
                }
            }
        } else {
            System.out.println("Volte sempre!");
        }
    }

    private void jogoAdicao() {
        int num = rand.nextInt(51); // Números ate 50
        int num2 = rand.nextInt(51); // Números ate 50
        int resultado = num + num2;
        System.out.print(num + "+" + num2 + ": ");
        userRes = sc.nextInt();
        if (userRes == resultado) {
            pontos += 5;
            System.out.println("Parabéns resposta correta \nPontos: " + pontos);
        } else {
            tentativas--;
            System.out.println("Resposta incorreta! Resposta correta: " + resultado + "\nTentativas: " + tentativas);
        }
        rodadas++;
        System.out.println(rodadas);
    }

    private void jogoSubtracao() {
        if (tentativas > 0) {
            int num = rand.nextInt(101); // Números até 100
            int num2 = rand.nextInt(101); // Números até 100
            int resultado = num - num2;
            System.out.print(num + "-" + num2 + ": ");
            userRes = sc.nextInt();
            if (userRes == resultado) {
                pontos += 5;
                System.out.println("Parabéns resposta correta \nPontos: " + pontos);
            } else {
                tentativas--;
                System.out.println("Resposta incorreta! Resposta correta: " + resultado + "\nTentativas: " + tentativas);
            }
            rodadas++;
            System.out.println(rodadas);
        }
    }

    private void jogoMultiplicacao() {
        if (tentativas > 0) {
            int num = rand.nextInt(11); // Números até 10
            int num2 = rand.nextInt(11); // Números até 10
            int resultado = num * num2;
            System.out.print(num + "*" + num2 + ": ");
            userRes = sc.nextInt();
            if (userRes == resultado) {
                pontos += 5;
                System.out.println("Parabéns resposta correta \nPontos: " + pontos);
            } else {
                tentativas--;
                System.out.println("Resposta incorreta! Resposta correta: " + resultado + "\nTentativas: " + tentativas);
            }
            rodadas++;
            System.out.println(rodadas);
        }
    }

    private void jogoDivisao() {
        if (tentativas > 0) {
            int num;
            int num2;
            do {
                num = rand.nextInt(81) + 10; // Números entre 20 e 100
                num2 = rand.nextInt(8) + 2;  // Números entre 2 e 9
            } while (num % num2 != 0); // Evita divisão por zero

            int resultado = num / num2;
            System.out.print(num + "/" + num2 + ": ");
            userRes = sc.nextInt();
            if (userRes == resultado) {
                pontos += 5;
                System.out.println("Parabéns, resposta correta \nPontos: " + pontos);
            } else {
                tentativas--;
                System.out.println("Resposta incorreta! Resposta correta: " + resultado + "\nTentativas: " + tentativas);
            }
            rodadas++;
            System.out.println(rodadas);
        }
    }
}
