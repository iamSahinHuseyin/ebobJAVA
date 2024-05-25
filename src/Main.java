import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //ilk öncelikle Ebob metodumuzu yazalım.

    public static int ebob(int sayi1, int sayi2) {
        int ebob = 1;
        //for döngümüz sayi 1 veya sayi 2 ye kadar gidecek.
        for (int i = 1; (i<=sayi1 && i<=sayi2); i++) {
            //hem sayi1 e hemde sayı2 ye tam bölünüyorsa;
            if ((sayi1%i==0) && (sayi2%i==0))
            {
                //her seferinde ebob değerimizi güncelleştireceğiz.
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {

        //kullanıcıdan sayılarımızı alalım.
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı1 giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.print("Sayı2 giriniz: ");
        int sayi2 = sc.nextInt();

        System.out.println("Girilen iki sayının EBOB: " + ebob(sayi1, sayi2));
    }
}