package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int max = 0;
        if (first == 0 || second == 0)
            max = first>second? first:second;
        else if (first >= second) {
            for (int i = 1; i <= second; i++){
                if (first % i == 0 && second % i == 0)
                    max = i;
            }
        }else {
            for (int i = 1; i <= first; i++){
                if (first % i == 0 && second % i == 0)
                    max = i;
            }
        }
        System.out.println(max);
    }
}
