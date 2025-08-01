##EXP2


#Variable

package git;
import java.util.Scanner;
public class Variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int[] multiples = new int[10];
        int multipleCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] % 9 == 0) {
                multiples[multipleCount] = numbers[i];
                multipleCount++;
            }
        }
        System.out.print("The numbers that are multiples of both 9 and 3: ");
        for (int i = 0; i < multipleCount; i++) {
            System.out.print(multiples[i]);
            if (i < multipleCount - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("URK24CS6006 PUJITHA");
    }
}


#PasswordGenerator

package git;
import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password length: ");
        int length = scanner.nextInt();
        char[] small = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };
        char[] capital = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z' };
        char[] numbers = { '0','1','2','3','4','5','6','7','8','9' };
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        password.append(small[random.nextInt(small.length)]);
        password.append(capital[random.nextInt(capital.length)]);
        password.append(numbers[random.nextInt(numbers.length)]);
        for (int i = 3; i < length; i++) {
            int type = random.nextInt(3); // 0 = small, 1 = capital, 2 = number
            if (type == 0) {
                password.append(small[random.nextInt(small.length)]);
            } else if (type == 1) {
                password.append(capital[random.nextInt(capital.length)]);
            } else {
                password.append(numbers[random.nextInt(numbers.length)]);
            }
        }
        String generatedPassword = shuffleString(password.toString());
        System.out.println("The Generated Password is: " + generatedPassword);
    }
    private static String shuffleString(String text) {
        char[] characters = text.toCharArray();
        Random random = new Random();
        for (int i = characters.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = characters[i];
            characters[i] = characters[j];
            characters[j] = temp;
        }
        return new String(characters);
    }
}

