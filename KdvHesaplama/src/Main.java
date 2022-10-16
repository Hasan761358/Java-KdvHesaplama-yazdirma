import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdv1=0.18 , kdv2=0.08, para, kdvli, kdvTutarı, kdvTutarı1,kdvli1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Para değerini giriniz : ");
        para = scanner.nextDouble();
        kdvTutarı=para*kdv1;
        kdvli=para+kdvTutarı;
        kdvTutarı1=para*kdv2;
        kdvli1=para+kdvTutarı1;


        if(para>0&&para<1000){
            System.out.println("Kdv'siz fiyat = " + para);
            System.out.println("Kdv'li fiyat = " + kdvli);
            System.out.println("Kdv tutarı = " + kdvTutarı);
        }else{
            System.out.println("Kdv'siz fiyat = " + para);
            System.out.println("Kdv'li fiyat = " + kdvli1);
            System.out.println("Kdv tutarı = " + kdvTutarı1);
        }

    }
}