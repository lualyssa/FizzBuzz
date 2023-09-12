public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;
        int n = 100;

        while (n > 0){
            if (n % 2 == 0){
                n = n / 2;
            }
            else{
                n -= 1;
            }
            numSteps += 1;
            n--;
        }

        System.out.println("It takes " + numSteps + " steps to reduce 100 to 0.");

    }
}
