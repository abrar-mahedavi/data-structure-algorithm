public class Summation {

    public static Integer summationNaturalNumbers(Integer number) {
        if (number == 0) {
            return 0;
        } else {
            return number + summationNaturalNumbers(number - 1);
        }
    }

    public static Integer summationNaturalNumbersFormula(Integer number) {
        return (number * (number + 1)) / 2;
    }

    public static void main(String[] args) {
        System.out.println(summationNaturalNumbers(25));
        System.out.println(summationNaturalNumbersFormula(25));
    }
}
