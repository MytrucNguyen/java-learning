public class Multiplication {
    public static void main(String[] args) {
        printTimesTable(5);
        printTimesTable(7);
    }

    public static void printTimesTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}