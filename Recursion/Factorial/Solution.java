public class Solution {

    public static Integer factorial(Integer number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    public static void main(String[] args) {
        Integer number = 5;
        System.out.println(factorial(number));

    }

    public static Integer summ


}
