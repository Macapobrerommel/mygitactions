import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sentences: ");
      String str = scanner.next();
      String [] word = str.split(" ");

     for (int i =0; i < word.length; i++){
         int count = 0;

         for (int j = 0; j< word.length; j++ ){
             if (word[i].equals(word[j])){
                 count++;
             }
         }

         System.out.println(word[i] + "=" + count);
     }


    }
}
