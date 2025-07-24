import java.util.Dictionary;
import java.util.Hashtable;

class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int littleResult = 0;

        Dictionary<Character, Integer> dict= new Hashtable<>();

        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int len = s.length();

        int a = 0;
        char controlSymbol = s.charAt(a);
        while(a < len){
            littleResult += dict.get(s.charAt(a++));
            if (a < len && (dict.get(controlSymbol) < dict.get(s.charAt(a)))){
                littleResult *= -1;
            }else if (a < len && (dict.get(controlSymbol) > dict.get(s.charAt(a)))){
                controlSymbol = s.charAt(a);
                result += littleResult;
                littleResult = 0;
            }if (a == len){
                result += littleResult;
            }
        }

        return result;
    }
}