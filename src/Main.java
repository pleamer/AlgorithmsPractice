import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class Main {

    public static void main(String[] args) {
        int[] a = {2,8,6,9,9,10,22};
        printArray(histogram(a, 10));
//        System.out.println(histogram(a, 10));
    }

    public static String decToBinary(int N){
        String s = "";
        if (N <= 0) return null;
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void print2dArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\r\n");
        }
    }

    public static int[][] transferArray(int[][] array){
        int[][] result = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                result[j][i] = array[i][j];
            }
        }

        return result;
    }

    public static int lg(int N){
        if (N <= 0) return -1;
        int x = 0;
        for (int n = N; n >= 2; n /= 2) {
            x+=1;
        }
        return x;
    }

    public static int[] histogram(int[] a, int M){
        int[] result = new int[M];
        for (int i = 1; i <= M; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) count++;
            }
            result[i-1] = count;
        }
        return result;
    }



}
