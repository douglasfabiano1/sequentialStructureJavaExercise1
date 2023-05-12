import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nPara o cálculo da área e preço do terreno, informe:");
        System.out.print("1 - Qual a largura do terreno? ");
        double width = sc.nextDouble();
        System.out.print("2 - Qual o comprimento do terreno? ");
        double length = sc.nextDouble();
        System.out.print("3 - Qual o valor do metro quadrado? ");
        double valueM2 = sc.nextDouble();

        double area = width * length;
        double price = area * valueM2;

        System.out.printf("\nAREA = %.2fm2 %n", area);
        System.out.printf("PRECO = R$ %.2f%n%n", price);
        System.out.println("Fim do programa");
        sc.close();
    }
}
