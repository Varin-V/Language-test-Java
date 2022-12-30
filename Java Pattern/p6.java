
public class p6 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
        for (int i = 1; i <= size - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (size - i) * 2 - 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}
// output:

// A
// ABC
// ABCDE
// ABCDEFG
// ABCDEFGHI
// ABCDEFG
// ABCDE
// ABC
// A
