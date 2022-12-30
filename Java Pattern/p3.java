
public class p3 {
    public static void main(String[] args) {
        int size = 5;
        int alpha = 65;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print((char) (alpha + j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// output:

// A E
// B D
// C
// B D
// A E
