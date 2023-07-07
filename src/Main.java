import java.util.Scanner;
public class Main {
    public static int countDigits(int num) {
        // Your code goes here
        int count = 0,originalNum,divisor;
        originalNum = num;
        while(num > 0 ){
            divisor = num  % 10;
            if(originalNum  % divisor == 0 && divisor != 0){
                count++;
            }
           num /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int num = input.nextInt();
        System.out.println(countDigits(num));
    }
}