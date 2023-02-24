import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double boy,kilo,endex;
        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz :");
        boy=input.nextDouble();
        System.out.print("Kilonuzu Giriniz :");
        kilo=input.nextDouble();

        endex=kilo/(boy*boy);
        System.out.println("Vücut Endeksiniz :"+endex);


    }
}