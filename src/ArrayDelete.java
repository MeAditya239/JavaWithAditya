import java.util.Scanner;

public class ArrayDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the index at which you want to delete:");
        int m = sc.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else {
                b[i-1] = a[i];
            }
        }

        System.out.println("This is the modified list:");
        for (int i = 0; i < n - 1; i++) {
            System.out.println(b[i]);
        }

        sc.close();
    }
}
