import java.util.Scanner;
public class questão1 {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);

        System.out.println("Digite o seu salário: ");
        Double sal = entry.nextDouble();

        Double per, sal2, aum;

        if(sal<=280){
            per = 0.2;
        }
        else if (sal<=700){
            per = 0.15;
        }
        else if (sal<=1500){
            per = 0.1;
        }
        else {
            per = 0.05;
        }

        aum = sal * per;
        sal2 = sal + per;

        System.out.println("Primeiro salário: R$" + sal);
        System.out.println("Percentual de aumento: " + (per * 1001) + "%");
        System.out.println("Valor do aumento: R$" + aum);
        System.out.println("Salário com aumento: R$" + sal2);

        entry.close();


    }
}
