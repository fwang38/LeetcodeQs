


public class Solution {
    public String reverseString(String s) {
        StringBuilder str = new StringBuilder(s);    //If you need to iterate every element in a string, then we should use string builder because it's faster and consumes less memory.
        return str.reverse().toString();			//the output type is String..
    }
}