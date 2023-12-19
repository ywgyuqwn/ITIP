public class sumArray {
    private static class SumThread extends Thread {
        private int[] array;
        private int start;
        private int end;
        private long sum = 0;

        public SumThread(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
        }

        public long getSum() {
            return sum;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = { /* инициализация массива */ };
        int mid = array.length / 2;

        SumThread thread1 = new SumThread(array, 0, mid);
        SumThread thread2 = new SumThread(array, mid, array.length);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        long totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Total Sum: " + totalSum);
    }
}// разделяем массив на две части и каждая часть обрабатывается отдельным потоком.
// После завершения работы обоих потоков, складываем результаты.