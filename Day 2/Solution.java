public class Solution {
    public String reverseWords(String s) {
        // Trim leading/trailing spaces and split the string into words
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder to efficiently build the reversed string
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) reversed.append(" ");
        }
        
        return reversed.toString();
    }
}
