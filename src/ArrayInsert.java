import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n + 1];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index at which you want to insert:");
        int m = sc.nextInt();

        System.out.println("Enter the value you want to insert:");
        int p = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                b[i] = p;
            } else {
                b[i] = a[i - 1];
            }
        }

        System.out.println("This is the modified list:");
        for (int i = 0; i < n + 1; i++) {
            System.out.println(b[i]);
        }

        sc.close();
    }
}
