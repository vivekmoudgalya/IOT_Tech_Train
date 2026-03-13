package dsa.dataStructures.linear.stacks;

import java.util.Stack;

public class PostfixEvaluation
{
    static int evaluate(String exp)
    {
        Stack<Integer> stack=new Stack<>();
        for(char c:exp.toCharArray())
        {
            if(Character.isDigit(c-'0'))//check if it's the digit
            {
                stack.push(c-'0');//store the integer version
            }
            else {
                int b=stack.pop();
                int a=stack.pop();
                switch(c)
                {
                    case '+' -> stack.push(a+b);
                    case '-' -> stack.push(a-b);
                    case '*' -> stack.push(a*b);
                    case '/' -> stack.push(a/b);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args)
    {
        String exp="23*54*+9-";
        System.out.println(evaluate(exp));
    }
}
