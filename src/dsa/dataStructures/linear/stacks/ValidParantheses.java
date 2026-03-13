package dsa.dataStructures.linear.stacks;
import java.util.*;
public class ValidParantheses
{
    static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        String s1="{]{](]";
        System.out.println(s+" -> "+(isValid(s)?"valid":"invalid"));
        System.out.println(s1+" -> "+(isValid(s1)?"valid":"invalid"));
    }
}
