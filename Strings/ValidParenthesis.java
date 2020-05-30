class ValidParenthesis {
    public boolean isValid(String s) {
        
        if(s.isEmpty()) {
            return true;
        }
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
                
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                
                return false;
            }
            
        }
        
        return stack.isEmpty();
        
        
    }
}



/**
* Alternative solution using HashMap
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put('(', ')');
        mappings.put('{', '}');
        mappings.put('[', ']');
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (mappings.containsKey(ch))
            {
                stack.push(ch);
            }
            else if (stack.isEmpty() || mappings.get(stack.pop()) != ch)
            {
                return false;
            }
        }
        return stack.isEmpty();
        
    }
}

**/