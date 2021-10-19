import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        MagicMath m1 = new MagicMath();
        m1.n = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println("Факториал числа "+m1.n+" равен: "+m1.fact(m1.n));
        System.out.println("Модуль числа "+m1.n+" равен: "+m1.abs(m1.n));
        System.out.println(e+" степень числа "+m1.n+" равнa: "+m1.pow(m1.n,e));




    }
}
