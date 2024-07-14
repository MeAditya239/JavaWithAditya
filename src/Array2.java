import java.util.Scanner;

class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int[][] marks = new int[3][];
        System.out.println("Enter the marks of 3 students");

        for (i = 0; i < 3; i++) {
            System.out.println("Enter the subject count of student " + (i+1) + ":");
            int subs = sc.nextInt();
            marks[i] = new int[subs];
            System.out.println("Enter the marks obtained in " + subs + " subjects:");
            for (j = 0; j < subs; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n Marks List \n");
        for (i = 0; i < marks.length; i++) {
            System.out.println("\n Student " + (i+1) + ":");
            for (j = 0; j < marks[i].length; j++) {
                System.out.print(" " + marks[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
