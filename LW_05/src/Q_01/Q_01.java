package Q_01;

public class Q_01 {
    public static void main(String[] args) {
        int count = 10;
        for (int i=0; i<4; i++) { // 4 rows
            for (int j=0; j<10; j++) { // 10 columns
                System.out.print(count+" ");
                count++;
            }
            System.out.print("\n"); // Move to the next line after printing 10 numbers
        }
    }
}
