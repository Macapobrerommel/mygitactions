import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter palindrome word: ");
        String str = scanner.nextLine().toLowerCase().trim();


        String reversed = "";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++){
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);

        scanner.close();





    }
}
