public class Main {
    public static void main(String[] args) {
        //sol1();
        //sol2();
        //sol3();
        sol4();
    }

    private static void sol4() {
        int max = 0;

        for ( int i = 1; i <= 9999; i++ ) {
            for ( int j = 1; j <= 9999; j++ ) {
                int no = i * j;

                if ( isPalindrome(no) ) {
                    if ( no > max ) {
                        max = no;
                    }
                }
            }
        }

        System.out.println(max);
    }

    private static boolean isPalindrome(int no) {
        String noStr = no + "";

        int halfLen = noStr.length() / 2;

        for ( int i = 0; i < halfLen; i++ ) {
            int backIndex = noStr.length() - 1 - i;

            if ( noStr.charAt(i) != noStr.charAt(backIndex) ) {
                return false;
            }
        }

        return true;
    }

    private static void sol3() {
        long target = 1600851475143L;

        for ( int i = 2; true; i++ ) {
            boolean canDiv = target % i == 0;

            while ( target % i == 0 ) {
                target /= i;
            }

            if ( canDiv ) {
                System.out.println(i);
            }

            if ( i > target ) {
                break;
            }
        }
    }

    private static void sol1() {
        long sum = 0;

        for ( long i = 1; i < 100000; i++ ) {
            sum += i % 3 == 0 || i % 5 == 0 ? i : 0;
        }

        System.out.println(sum);
    }

    private static void sol2() {
        int sum = 0;

        int i1 = 0;
        int i2 = 1;
        int i3 = 0;

        while ( i3 <= 50000000 ) {
            sum += i3 % 2 == 0 ? i3 : 0;

            i3 = i1 + i2;

            i1 = i2;
            i2 = i3;
        }

        System.out.println(sum);
    }
}
