public class FactorialTest {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
        System.out.println(assert factorial.factorial(5) == 120);

    }


}
