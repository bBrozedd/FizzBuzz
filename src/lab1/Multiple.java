package lab1;

public class Multiple {
    public static void main(String[] args) {
        int count = multiple();
        System.out.println(count);
    }

    public static int multiple() {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3||divisibleBy5) {
                count++;
            }
            i++;
        }
        return count;
    }
}
