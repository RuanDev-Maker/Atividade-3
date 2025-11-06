import java.util.Scanner;
public class questão4 {
    public static void main(String[] args) {
        Scanner entry = new Scanner (System.in);
        String conf;
        int num = 0;

        System.out.println("Telefonou para a vítima?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Estava no local do crime?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Mora perto da vítima?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Devia algo para a vítima?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Já trabalhou para a vítima?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Foi vista nas proximidades da cena do crime?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Possui algum objeto da vítima?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }
        System.out.println("Tentou fugir após a ocorrência do crime?: ");
        conf = entry.nextLine().toLowerCase();
        if (conf.equals("Sim")){
            num = num + 1;
        }

        if (num==2){
            System.out.println("Suspeito");
        }
        else if (num <=4){
            System.out.println("Cúmplice");
        }
        else if (num < 5){
            System.out.println("Assassino");
        }
        else {
            System.out.println("Inocente");
        }
    }
} 
