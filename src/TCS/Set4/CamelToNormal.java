package TCS.Set4;

import java.util.Scanner;

public class CamelToNormal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        printNormalString(str);
        in.close();
    }

    private static void printNormalString(String str) {
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z'){
                if(i != 0){
                    res += " ";
                }
                char c = str.charAt(i);
                res += Character.toLowerCase(c);
                // System.out.println(Character.toString(c+32));
            }else{
                char c = str.charAt(i);
                res += Character.toLowerCase(c);
            }
        }
        System.out.println(res);
    }
}
