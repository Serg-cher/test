import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
        String input = scanner.nextLine();
        System.out.println("Output:");
        try {
            System.out.println(calc(input));
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.trim().split("\\s+");

        if (parts.length != 3) throw new Exception();

        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);

        if (a < 1 || a > 10 || b < 1 || b > 10)
            throw new Exception();

        int result;
        char op = parts[1].charAt(0);

        result = switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new Exception();
        };

        return Integer.toString(result);
    }
}