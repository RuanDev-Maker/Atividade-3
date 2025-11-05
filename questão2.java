import java.util.Scanner;
public class questão2 {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        
        System.out.println("Digite quantas horas você trabalha: ");
        int hr = entry.nextInt();
        System.out.println("Digite o valor da sua hora: ");
        Double vh = entry.nextDouble();

        Double sal = hr * vh, per;

        if (sal<=1518){
            per = 0.0;
        }
        else if (sal<=2700){
            per = 0.05;
        }
        else if (sal<=3400){
            per = 0.1;
        }
        else if(sal<=4000){
            per = 0.15;
        }
        else {
            per = 0.2;
        }

        Double sal2 = sal - (per * sal) - (sal * 0.1);

        System.out.println("Salário líquido: " + sal2);

        entry.close();
    }
}
