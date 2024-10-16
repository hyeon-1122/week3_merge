import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Main instance = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        instance.solve(N);
        sc.close();
    }

    public void solve(int N) {
        printPyramid(N);
        printInvertedPyramid(N);
    }

    public void printPyramid(int N) {
        // TODO: Implement this method

        for (int i = 0; i < (2*N-1)/2; i++){
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 2*N-1; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public void printInvertedPyramid(int N) {
        // TODO: Implement this method

        for (int i = (2*N-1)/2-1; i > -1; i--){
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}