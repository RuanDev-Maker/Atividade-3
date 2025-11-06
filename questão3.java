import java.util.Scanner;
public class questão3 {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        Double desc, valor2,valor,lv;
        String tp;

        System.out.print("A - Alcool; G - Gasolina. Qual o tipo de combustível?:");
        tp = entry.nextLine();
        System.out.print("Numero de litros vendidos:");
        lv = entry.nextDouble();

        if (tp.equals("A")){
            valor = 1.9;
            if (lv <=25){
                desc = 0.035;
            }
            else {
                desc = 0.053;
            }
            valor = valor * lv;
            valor2 = valor - (valor *desc);
            System.out.println(valor2);
        }
        else if (tp.equals("G")){
            valor = 2.5;
            if (lv <= 35){
                desc = 0.04;
            }
            else {
                desc = 0.06;
            }
            valor = valor * lv;
            valor2 = valor - (valor * desc);
            System.out.println(valor2);
        }

    
       




        entry.close();
        

    }
}
