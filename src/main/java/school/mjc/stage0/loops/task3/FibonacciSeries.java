package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstnumber = 0;
        int secondnumber = 1;
        int sum = 0;
        while (firstnumber <= lastFibonacci){
            System.out.println(firstnumber);

            sum = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = sum;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(54);
    }
}
