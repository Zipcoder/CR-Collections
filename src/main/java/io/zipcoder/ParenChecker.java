package io.zipcoder;


import java.util.Stack;

//1.Create a class with a method that verifies all parens () are paired. HINT: Use a stack.
public class ParenChecker {

    Stack<Character> stack = new Stack<Character>();

    public ParenChecker(){

    }

    public boolean parenChecker(String value){

        for(int i = 0; i < value.length(); i++){
            char c = value.charAt(i);
            if(c == '('){
                stack.push(c);
            } else if (c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

//TODO need to add " and ' to method maybe in a seperate if statment
    public boolean isMatchChecker(String value){
        for(int i = 0; i<value.length();i++){
            char c = value.charAt(i);
            //question about last two comparisons
            if(c == '(' || c == '[' || c== '<'|| c == '{'){
                stack.push(c);
            }else if(c==')'){
                return false;
            }else if(c==')' || c==']' || c== '>' || c == '}'){

            }


        }
    }


}


