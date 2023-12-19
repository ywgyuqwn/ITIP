 public class Main {
        public static void main(String[] args) {
            System.out.println("t1");
            System.out.println(convert(5));
            System.out.println(convert(3));
            System.out.println(convert(8));
            System.out.println("t2");
            System.out.println(fitCalc(15, 1));
            System.out.println(fitCalc(24, 2));
            System.out.println(fitCalc(41, 3));
            System.out.println("t3");
            System.out.println(containers(3, 4, 2));
            System.out.println(containers(5, 0, 2));
            System.out.println(containers(4, 1, 4));
            System.out.println("t4");
            System.out.println(triangleType(5, 5, 5));
            System.out.println(triangleType(5, 4, 5));
            System.out.println(triangleType(3, 4, 5));
            System.out.println(triangleType(5, 1, 1));
            System.out.println("t5");
            System.out.println(ternaryEvaluation(8, 4));
            System.out.println(ternaryEvaluation(11, 1));
            System.out.println(ternaryEvaluation(5, 9));
            System.out.println("t6");
            System.out.println(howManyItems(22, 1.4f, 2));
            System.out.println(howManyItems(45, 1.8f, 1.9f));
            System.out.println(howManyItems(100, 2, 2));
            System.out.println("t7");
            System.out.println(factorial(3));
            System.out.println(factorial(5));
            System.out.println(factorial(7));
            System.out.println("t8");
            System.out.println(qcd(48, 18));
            System.out.println(qcd(52, 8));
            System.out.println(qcd(259, 28));
            System.out.println("t9");
            System.out.println(ticketSaler(70, 1500));
            System.out.println(ticketSaler(24, 950));
            System.out.println(ticketSaler(53, 1250));
            System.out.println("t10");
            System.out.println(tables(5, 2));
            System.out.println(tables(31, 20));
            System.out.println(tables(123, 58));
        }

        public static float convert(int x) {
            return x * 3.785f;
        }

        public static int fitCalc(int x, int y) {
            return x * y;
        }

        public static int containers(int x, int y, int z) {
            return x * 20 + y * 50 + z * 100;
        }

        public static String triangleType(int x, int y, int z) {
            if (x + y <= z | y + z <= x | x + z <= y) {
                return "not a triangle";
            }
            if (x == y & y == z) {
                return "isosceles";
            } else if (x == y | y == z | x == z) {
                return "equilateral";
            }
            return "different-sided";
        }

        public static int ternaryEvaluation(int x, int y) {
            int otv = (x > y) ? x : y;
            return otv;
        }

        public static int howManyItems(int x, float y, float z) {
            return (int) Math.floor(x / (y * z * 2));
        }

        public static int factorial(int x) {
            int y = 1;
            for (int i = 1; i <= x; ++i) {
                y = y * i;
            }
            return y;
        }

        public static int qcd(int x, int y) {
            int z = 1;
            for (int i = 1; i <= x && i <= y; i++) {
                if (x % i == 0 && y % i == 0) {
                    z = i;
                }
            }
            return z;
        }

        public static int ticketSaler(int x, int y) {
            return (x * y) - ((x * y) * 28) / 100;
        }

        public static int tables(int x, int y) {
            int z = 0;
            for (int i = 0; x >= y * 2; ) {
                y++;
                ++i;
                z = i;
            }
            return z;
        }
    }
