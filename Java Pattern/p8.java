
public class p8 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            for (int k = 0; k < 2 * (size - i) - 1; k++) {
                if (i == 0 || i == size - 1) {
                    System.out.print((char) (alpha + k));
                } else {
                    if (k == 0 || k == 2 * (size - i - 1)) {
                        System.out.print((char) (alpha + k));
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
// output:

// ABCDEFGHI
// A G
// A E
// A C
// A