public class SolutionTest {

    public static void main(String[] args) {
        Solution factorial = new Solution();
        System.out.println(factorial.factorial(5));
        System.out.println(assert factorial.factorial(5) == 120);
    }


}
