public class StringBuilderFunc {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < repeat; i++) {
            result.append(string); // Append the string to the StringBuilder
        }
        
        return result.toString(); // Convert the StringBuilder to a string and return it
    }

     public static void main(String[] args) {
      String myArr = repeatStr(6, "Faizan");
      System.out.println(myArr);
  }

  
}
