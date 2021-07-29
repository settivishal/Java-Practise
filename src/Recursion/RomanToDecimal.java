package Recursion;

import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args){
        String s  = "MCMXCIV";
        HashMap<Character,Integer> roman = initializeRoman(s);

        System.out.println(romanToInt(s,roman));
    }

    private static HashMap<Character, Integer> initializeRoman(String s) {
        HashMap<Character,Integer> r = new HashMap<>();

        r.put('I', 1);
        r.put('V', 5);
        r.put('X', 10);
        r.put('L', 50);
        r.put('C', 100);
        r.put('D', 500);
        r.put('M', 1000);
        return r;
    }
    public static int romanToInt(String s, HashMap<Character, Integer> roman) {
        int num = 0;
        int l = s.length();
        int last = 1000;

        for (int i = 0; i < l; i++){
            // int v = getValue(s.charAt(i));
            int v = roman.get(s.charAt(i));
            if (v > last) num = num - last * 2;
            num = num + v;
            last = v;
        }
        return num;
    }

    // private static int getValue(char c){
    //     switch(c){
    //         case 'I' : return 1;
    //         case 'V' : return 5;
    //         case 'X' : return 10;
    //         case 'L' : return 50;
    //         case 'C' : return 100;
    //         case 'D' : return 500;
    //         case 'M' : return 1000;
    //         default : return 0;
    //     }
    // }
}
