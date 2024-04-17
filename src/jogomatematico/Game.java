/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogomatematico;

import java.util.Random;
import java.util.Scanner;

public class Game {

    int pontos = 0;
    int rodadas = 0;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int userRes;
    int partesDoBoneco = 0;

    public void NewClass() {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("+---------------------------------------------------------+");
        System.out.println("| Bem-vindo ao nosso jogo educativo matemático!           |");
        System.out.println("| Nesse jogo serão testadas suas habilidades matemáticas! |");
        System.out.print("| Quando estiver pronto, digite OK: ");
        String userStart = sc.nextLine();
        System.out.println("+---------------------------------------------------------+");

        if (userStart.equalsIgnoreCase("OK")) {

            while (partesDoBoneco < 5) { // Enquanto houver partes do boneco a serem perdidas
                if (partesDoBoneco >= 5) { // Se todas as partes do boneco foram perdidas                  
                    break;
                } else {
                    desenharBoneco(); // Desenha o boneco antes de cada jogada
                    jogoAdicao();
                    desenharBoneco(); // Desenha o boneco novamente após a jogada
                    jogoSubtracao();
                    desenharBoneco(); // Desenha o boneco novamente após a jogada
                    jogoMultiplicacao();
                    desenharBoneco(); // Desenha o boneco novamente após a jogada
                    jogoDivisao();
                }
            }
            System.out.println("Você perdeu! O boneco MORREU!.");
            System.out.println("Fim do jogo!");
        } else {
            System.out.println("Volte sempre!");
        }
    }

    private void desenharBoneco() {
        switch (partesDoBoneco) {
            case 0:
                System.out.println("   O");
                System.out.println("  /|\\");
                System.out.println("  / \\");
                break;
            case 1:
                System.out.println("   O");
                System.out.println("  /|\\");
                System.out.println("    \\");
                break;
            case 2:
                System.out.println("   O");
                System.out.println("  /|");
                System.out.println("    \\");
                break;
            case 3:
                System.out.println("   O");
                System.out.println("   |");
                System.out.println("    \\");
                break;
            case 4:
                System.out.println("   O");
                System.out.println("   |");
                break;
            case 5:
                System.out.println("   O");
                break;
            default:
                break;
        }
    }

    private void jogoAdicao() {
        int num = rand.nextInt(51); // Números até 50
        int num2 = rand.nextInt(51); // Números até 50
        int resultado = num + num2;
        System.out.print(num + " + " + num2 + " = ");
        int userRes = sc.nextInt();
        if (userRes == resultado) {
            pontos += 5;
            System.out.println("Parabéns! Resposta correta. Pontos: " + pontos);
        } else {
            partesDoBoneco++; // Incrementa o número de partes do boneco perdidas
            System.out.println("Resposta incorreta! Resposta correta: " + resultado);
        }
        rodadas++;
    }

    private void jogoSubtracao() {
        int num = rand.nextInt(101); // Números até 100
        int num2 = rand.nextInt(101); // Números até 100
        int resultado = num - num2;
        System.out.print(num + " - " + num2 + " = ");
        int userRes = sc.nextInt();
        if (userRes == resultado) {
            pontos += 5;
            System.out.println("Parabéns! Resposta correta. Pontos: " + pontos);
        } else {
            partesDoBoneco++; // Incrementa o número de partes do boneco perdidas
            System.out.println("Resposta incorreta! Resposta correta: " + resultado);
        }
        rodadas++;
    }

    private void jogoMultiplicacao() {
        int num = rand.nextInt(11); // Números até 10
        int num2 = rand.nextInt(11); // Números até 10
        int resultado = num * num2;
        System.out.print(num + " * " + num2 + " = ");
        int userRes = sc.nextInt();
        if (userRes == resultado) {
            pontos += 5;
            System.out.println("Parabéns! Resposta correta. Pontos: " + pontos);
        } else {
            partesDoBoneco++; // Incrementa o número de partes do boneco perdidas
            System.out.println("Resposta incorreta! Resposta correta: " + resultado);
        }
        rodadas++;
    }

    private void jogoDivisao() {
        int num;
        int num2;
        do {
            num = rand.nextInt(81) + 10; // Números entre 20 e 100
            num2 = rand.nextInt(8) + 2;  // Números entre 2 e 9
        } while (num % num2 != 0); // Evita divisão por zero

        int resultado = num / num2;
        System.out.print(num + " / " + num2 + " = ");
        int userRes = sc.nextInt();
        if (userRes == resultado) {
            pontos += 5;
            System.out.println("Parabéns! Resposta correta. Pontos: " + pontos);
        } else {
            partesDoBoneco++; // Incrementa o número de partes do boneco perdidas
            System.out.println("Resposta incorreta! Resposta correta: " + resultado);
        }
        rodadas++;
    }
}
