import java.util.ArrayList;
import java.util.List;

public class MaxMatrixElement {
    private static class MaxSearchThread extends Thread {
        private int[] row;
        private int max = Integer.MIN_VALUE;

        public MaxSearchThread(int[] row) {
            this.row = row;
        }

        @Override
        public void run() {
            for (int value : row) {
                max = Math.max(max, value);
            }
        }

        public int getMax() {
            return max;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[][] matrix = { /* инициализация матрицы */ };
        List<MaxSearchThread> threads = new ArrayList<>();

        for (int[] row : matrix) {
            MaxSearchThread thread = new MaxSearchThread(row);
            thread.start();
            threads.add(thread);
        }

        int maxElement = Integer.MIN_VALUE;
        for (MaxSearchThread thread : threads) {
            thread.join();
            maxElement = Math.max(maxElement, thread.getMax());
        }

        System.out.println("Maximum Element in Matrix: " + maxElement);
    }
}//каждый поток обрабатывает одну строку матрицы,
// и после завершения всех потоков, мы находим наибольший элемент.