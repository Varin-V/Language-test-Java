
public class p9 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (size - i) - 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}
// output:

// ABCDEFGHI
// ABCDEFG
// ABCDE
// ABC
// A
