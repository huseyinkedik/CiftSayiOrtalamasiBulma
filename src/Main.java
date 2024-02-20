import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, adet = 0, toplam = 0;

        //Kullanıcıdan sayı girilmesi bekleniyor.

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        k = input.nextInt();

        //Girilen sayının 1' den başlayıp, girilen değere kadar artması sağlanıyor.

        for (int i = 1; i <= k; i++) {

            //Hem 3'e hem de 4'e bölünme şartını sağlayanları toplam ile topluyor.
            //Bu işlem kaç kez gerçekleşmisse bunu da adet ile gösteriyor.

            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                adet++;
            }
        }
        System.out.println(toplam / adet);
    }
}