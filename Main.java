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
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void printInvertedPyramid(int N) {
        // TODO: Implement this method
        for(int i=1;i<N-2;i+=2){
            for (int j=1;j<i;j+=2){
            System.out.printf(" ");
        }
            for (int j=N;j>1;j--){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}