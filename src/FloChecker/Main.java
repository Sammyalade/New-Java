package FloChecker;

public class Main {
    public static void main(String[] args) {
        System.out.println(isDivisibleByFive(10));
    }

    public static boolean isDivisibleByFive(int number){
        return number % 5 == 0;
    }
}