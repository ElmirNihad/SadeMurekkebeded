import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eded;
        System.out.print("Ədədi daxil edin : ");
        eded = input.nextInt();
        if (eded <= 1) {
            System.out.println("Ədəd sadə və ya mürəkkəb deyil.");
        } else if (eded == 2) {
            System.out.println("Sadə ədəddir");
        } else if (yoxlama(eded)) {
            System.out.println("Sadə ədəddir");
        } else {
            System.out.println("Mürəkkəb ədəddir");
        }
    }
    public static boolean yoxlama(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
