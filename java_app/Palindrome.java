public class Palindrome {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "madam";
        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }
}