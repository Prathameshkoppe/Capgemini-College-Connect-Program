package lab9;

public class StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("madam");
        StringBuilder p= new StringBuilder(sb);

        int n = sb.length() / 2;
        for (int i = 0; i < n; i++) {
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(sb.length() - 1 - i);

            sb.setCharAt(i, backChar);
            sb.setCharAt(sb.length() - 1 - i, frontChar);
        }

        System.out.println(sb);
        
        if(sb.equals(p)) {System.out.println("it is a palindrome");
    }else {
    	System.out.println( " It is not palindrome");
    }
}
}