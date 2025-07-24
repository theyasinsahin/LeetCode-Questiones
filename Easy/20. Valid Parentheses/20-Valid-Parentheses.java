class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty() || (((char)stack.peek() != '(' && s.charAt(i) == ')') || ((char)stack.peek() != '[' && s.charAt(i) == ']') || ((char)stack.peek() != '{' && s.charAt(i) == '}'))){
                    return false;
                }
                if(((char)stack.peek() == '(' && s.charAt(i) == ')') || ((char)stack.peek() == '[' && s.charAt(i) == ']') || ((char)stack.peek() == '{' && s.charAt(i) == '}')){
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}