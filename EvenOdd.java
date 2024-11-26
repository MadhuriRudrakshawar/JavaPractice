public class EvenOdd {
    public static void main(String[] args) {
        //--------------------------------Fibonacci----------------------------------------------

        int fibo = 11;

        int num1 = 0, num2 = 1;
        int num3 = 0;


        for (int i = 1; i < fibo; i++) {
            System.out.print(num3 + " ");

            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;

        }
        System.out.println();


        //--------------------------------factorial----------------------------------------------
        int fact = 6;
        int ans = 1;

        for (int i = 1; i <= fact; i++) {
            ans = ans * i;
        }
        System.out.println("factorial = " + ans);

        int x = 50;

//        ----------------------------Even---------------------------------------
        for (int i = 0; i < x; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

//                ----------------------------Odd---------------------------------------
        for (int i = 0; i < x; i++) {
            if ((i % 2) != 0) {
                System.out.print(i + " ");
            }
        }
    }
}