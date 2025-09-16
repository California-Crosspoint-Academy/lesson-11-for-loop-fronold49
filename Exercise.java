public class Exercise {
    public static void main(String[] args) {
        // 1
        int j = 0;
        for (int g = 0; g < 5; g++)
            j++;
        System.out.println(j); // 5

        // 2
        int s = 1;
        for (int j2 = 3; j2 >= 0; j2--) {
            s = s + j2;
        }
        System.out.println(s); // 7  (1+3+2+1+0)

        // 3
        int p = 6;
        int m = 20;
        int j3;
        for (j3 = 1; j3 < p; j3++); // semicolon means empty loop
        {
            m = m + j3 * j3; // m = 20 + 6*6 = 56
        }
        System.out.println(m); // 56

        // 4
        double a = 1.0;
        int j4 = 0;
        for (j4 = 0; j4 < 9; j4++) {
            a *= 3;
        }
        System.out.println(j4); // 9 

        // 5
        // this wont compile because b is out of scope

        // 6
        double d = 100.01;
        int b = 0;
        for (int iMus = 0; iMus < 10; iMus++) {
            b = 19 + iMus;
            d++;
        }
        System.out.println(d); // 110.01


        // 7
        for (int x = 3; x <= 24; x *= 2) {
            System.out.println(x);
        }

        // 8
        for (int x = 24; x >= 3; x /= 2) {
            System.out.println(x);
        }

        // 9
        int k = 0;
        for (int j5 = 0; j5 <= 10; j5++) {
            if (j5 == 5) {
                break;
            } else {
                k++;
            }
        }
        System.out.println(k); // 5

        // 10
        // the condition

        // 11
        int i11, j11 = 0;
        for (i11 = 10; i11 <= 100; i11 += 10) {
            j11 = i11 / 2; // 5 10 15 ... 50
        }

        // 12
        int r12 = 0;
        for (int j12 = 1; j12 < 10; j12 = j12 * 2) {
            r12 = 2 * j12;
        }
        System.out.println(r12); // 16

        // 13
        //creating an infinite loop

        // 14
        int iterations = 0;
        for (int p2 = 9; p2 <= 145; p2++) {
            iterations++;
        }
        System.out.println(iterations); // 137
    }
}