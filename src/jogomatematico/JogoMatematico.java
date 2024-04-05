package jogomatematico;

import java.util.Random;
import java.util.Scanner;

public class JogoMatematico {

    public static void main(String[] args) {
      
        int tentativas = 5;
        int pontos = 0;
        int rodadas = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Bem-vindo ao nosso jogo educativo matematico! \nNesse jogo sera testado suas habilidades matematicas! \nQuando estiver pronto "
                + "digite OK\n");

        String userStart = sc.nextLine();
        int userRes;

        if (userStart.equals("OK") || userStart.equals("ok")) {
            while (rodadas >= 0 && rodadas < 10) {
                if (tentativas > 0) {
                    int num = rand.nextInt(20);
                    int num2 = rand.nextInt(20);
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
            }
            while (rodadas >= 10 && rodadas < 20) {
                if (tentativas > 0) {
                    int num = rand.nextInt(20);
                    int num2 = rand.nextInt(20);
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
            while (rodadas >= 20 && rodadas < 30) {
                if (tentativas > 0) {
                    int num = rand.nextInt(10);
                    int num2 = rand.nextInt(10);
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
            while (rodadas >= 30 && rodadas < 36) {
                if (tentativas > 0) {
                    int num = rand.nextInt(10);
                    int num2 = rand.nextInt(10);
                    int resultado = num / num2;
                    System.out.print(num + "/" + num2 + ": ");
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
            
            System.out.println("Pontos ganhos: " + pontos);

        } else {
            System.out.println("Volte sempre!");
        }
    }
}
