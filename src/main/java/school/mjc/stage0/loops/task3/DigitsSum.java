package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum =0;
        String temp ="0";
        String number = Integer.toString(t);
        for (int i =0; i < number.length(); i++){
            char n = number.charAt(i);
            temp += n;
            sum = sum + Integer.parseInt(temp);
            temp = "0";
        }
        System.out.println(sum);
    }
}
