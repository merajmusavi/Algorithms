package javaSolutions;


import java.util.Stack;

public class StackEasy {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("({})"));
        System.out.println(isValid("({))"));

    }
    static boolean isValid(String s ){

        Stack<Character> characters = new Stack<>();


        for (char c : s.toCharArray()) {
            if (c == '(' || c=='{' || c=='['){
                characters.push(c);
            }else if (characters.isEmpty()){
                return false;
            }else if (c == ')' && characters.pop()!='('){
                return false;
            }else if (c=='}' && characters.pop()!='{'){
                return false;
            }else if (c == ']' && characters.pop()!='['){
                return false;
            }
        }
        return characters.isEmpty();
    }
}
