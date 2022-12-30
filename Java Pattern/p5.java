
public class p5 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = size / 2; i < size; i += 2) {
            for (int j = 1; j < size - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print((char) (alpha + j - 1));
            }
            for (int j = 1; j < size - i + 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print((char) (alpha + j - 1));
            }
            System.out.println();
        }
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                System.out.print((char) (alpha + j));
            }
            System.out.println();
        }
    }
}
// output:

// A AB
// ABC ABCD
// BCDEFGHIJ
// BCDEFGH
// BCDEF
// BCD
// B
