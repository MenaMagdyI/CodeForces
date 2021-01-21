package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name, host, letters;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        host = sc.nextLine();
        letters = sc.nextLine();

        Map<Character, Integer> combinedChar = new HashMap<Character, Integer>();
        Map<Character, Integer> lettersDic = new HashMap<Character, Integer>();
        boolean identical = true;

        if ((name.length() + host.length()) != letters.length()){
            identical = false;
        }else {

            for(int i=0;i<letters.length();i++){
                Character ch = letters.charAt(i);
                if(!lettersDic.containsKey(ch)){
                    lettersDic.put(ch,1);
                }else if(lettersDic.containsKey(ch)){
                    lettersDic.put(ch,lettersDic.get(ch)+1);
                }
            }

            for(int i=0;i<name.length();i++){
                Character ch = name.charAt(i);
                if(!combinedChar.containsKey(ch)){
                    combinedChar.put(ch,1);
                }else if(combinedChar.containsKey(ch)){
                    combinedChar.put(ch,combinedChar.get(ch)+1);
                }
            }

            for(int i=0;i<host.length();i++){
                Character ch = host.charAt(i);
                if(!combinedChar.containsKey(ch)){
                    combinedChar.put(ch,1);
                }else if(combinedChar.containsKey(ch)){
                    combinedChar.put(ch,combinedChar.get(ch)+1);
                }
            }

            for(Map.Entry<Character,Integer> entry : combinedChar.entrySet()){
                Character ch = entry.getKey();
                int val1 = entry.getValue();

                if(lettersDic.containsKey(ch)){
                    int val2 = lettersDic.get(ch);

                    if(val2<val1){
                        identical = false;
                        break;
                    }
                }
                else {
                    identical = false;
                    break;
                }

            }

        }

        if(identical){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
