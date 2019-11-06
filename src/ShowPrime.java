public class ShowPrime {
    static boolean isPrime(int number) {
        if (number <=1 ) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
