public class HelloWorld{

  public static void main(String[] args) {
    String input = "abcdefg";
    String output = "";
    // #1
    for (int i = input.length() -1; i>=0; i--) {
    output = output+input.charAt(i);
    }
    // #2
    // String output = new StringBuilder(input).reverse().toString();

    System.out.println(output);
  }
}
