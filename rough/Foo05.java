package rough;

import java.util.Scanner;

public class Foo05 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word");

        String word = sc.nextLine();

        String cleanedWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        boolean isPal = isPalindrome(cleanedWord);

                if(isPal){
                    System.out.println("The string is palindrome");
                } else {
                    System.out.println("The string is not palindrome");
                }
    }

    public  static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length() - 1;

        while (left < right){
            if(word.charAt(left) != word.charAt(right)){
                return  false;
            }
            left++;
            right--;
        }

        return  true;
    }





}
