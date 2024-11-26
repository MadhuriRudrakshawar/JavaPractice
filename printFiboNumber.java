public class printFiboNumber {
    public static void main(String[] args) {

        int fibo = 11 ;
        int findN = 7;
        int result = fibonacciCalc(fibo, findN);
        System.out.println(result);

    }

    public static int fibonacciCalc(int fibo, int findN){

        int num1 = 0, num2= 1;
        int num3 = 0;

        for (int i = 1; i < findN; i++) {

            System.out.print(num1 + " ");

//            System.out.print( num3 +" ");

            num3  = num2 + num1;
            num1 = num2;
            num2 = num3;


        }
        return num3;
    }
}
