import java.util.Scanner;
public class Main {
    static boolean isPalindrom (int number) {
        int temp = number, newnumber = 0 , lastnumber;
        while ( temp != 0 ){
            lastnumber = temp % 10 ;
            newnumber = (newnumber * 10) + lastnumber ;
            temp /= 10 ;
        }
        if(number == newnumber) {
            System.out.print("Değer bir Palindrom sayısıdır \n");
            return true;
        }
        else {
            System.out.print("Değer Palindrom sayısı değildir !! \n");
            return false;
        }
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Değer giriniz = ");
        int number=inp.nextInt();
        System.out.println(isPalindrom(number));
    }
}
