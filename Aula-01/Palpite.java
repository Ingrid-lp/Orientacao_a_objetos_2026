import java.util.Scanner;
import java.util.Random;

public class Palpite
{
    public static void main(String[] args)
    {
        int cont = 0, secreto, chute = 0;
        Random ale = new Random();
        Scanner teclado = new Scanner(System.in);
        secreto = ale.nextInt(50) + 1; //somente até 50 para não demorar muito

        System.out.println("Tente adivinhar o número");
        System.out.println("Digite um chute: ");
        chute = teclado.nextInt();

        while(chute != secreto)
        {
            if(chute > secreto)
            {
                System.out.println("Chute muito alto");
                System.out.println("Tente novamente: ");
                chute = teclado.nextInt();
                cont++;
            }

            else if(chute < secreto)
            {
                System.out.println("Chute muito baixo");
                System.out.println("Tente novamente: ");
                chute = teclado.nextInt();
                cont++;
            }
        }

        System.out.println("Parabéns você acertou!!");
        cont++;
        System.out.println("Número de tentativas até acertar: " + cont);
    }
}