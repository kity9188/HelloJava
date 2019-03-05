public class Hello {
    public static void main(String[] args) {

        simplePyramind(5);
    }

    public static void simplePyramind(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Hello");
            for (int j = 0; j <= i; j++) {
                System.out.print(" Java");   //print instead of println
            }
            System.out.println();
        }
    }
}