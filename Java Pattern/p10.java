
public class p10 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
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
