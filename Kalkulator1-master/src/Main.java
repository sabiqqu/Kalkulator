import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char operasi;
        int hasil;
        Scanner input =new Scanner(System.in);
        int total;
        System.out.println("masukkan angka1:");
        int angka1= input.nextInt();
        System.out.println("masukkan angka 2");
        int angka2= input.nextInt();
        System.out.println("pilih operator +,-,*,/");
        operasi=input.next().charAt(0);
        switch (operasi){
            case '+':
                hasil=angka1+angka2;
                System.out.println(angka1+"+"+angka2+"="+hasil);
                break;
            case '-':
                hasil=angka1-angka2;
                System.out.println(angka1+"-"+angka2+"="+hasil);
                break;
            case '*':
                hasil=angka1*angka2;
                System.out.println(angka1+"*"+angka2+'='+hasil);
                break;
            case '/':
                hasil=angka1/angka2;
                System.out.println(angka1+"/"+angka2+"="+hasil);
                break;
            default:
                System.out.println("operasi tidak tersedia");
                break;

        }
        input.close();
    }
}
