package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String temp = "9";
        for (int i =1; i <= lengthOfLastNumber; i++){
            sum+= Integer.parseInt(temp);
            temp += 9;
        }
        System.out.println(sum);
    }
}
