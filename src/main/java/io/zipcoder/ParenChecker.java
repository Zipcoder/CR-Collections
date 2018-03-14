package io.zipcoder;

import java.util.Stack;

public class ParenChecker
{
    public boolean containsPair(String inputString, Character openChar, Character closeChar)
    {
        Stack<Character> characterStack = new Stack<Character>();

        for(int i = 0; i < inputString.length(); i++)
        {
            char currentChar = inputString.charAt(i);

            if(currentChar == openChar)
            {
                characterStack.push(currentChar);
                continue;
            }

            if (currentChar == closeChar)
            {
                if(characterStack.isEmpty())
                {
                    return false;
                }

                else if(characterStack.peek() == openChar)
                {
                    characterStack.push(closeChar);
                }


            }


        }

        return characterStack.empty() || (characterStack.size() % 2 == 0);
    }

    public boolean parenPair(String inputString)
    {
        if (containsPair(inputString, '(', ')'))
        { return true;}

        return false;
    }

    public boolean anyPair(String inputString)
    {
        if      (containsPair(inputString, '(', ')')&&
                (containsPair(inputString, '<', '>')) &&
                (containsPair(inputString, '[', ']'))&&
                (containsPair(inputString, '{', '}'))&&
                (containsPair(inputString, '\'', '\''))&&
                (containsPair(inputString, '\"', '\"')))
        {
            return true;
        }

        return false;
    }



}
