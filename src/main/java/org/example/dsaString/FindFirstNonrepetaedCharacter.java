package org.example.dsaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonrepetaedCharacter {

    public static void main(String[] args) {

        String str="hheeljjklo";

        Map<Character,Integer> map=new LinkedHashMap<>();
        //Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Character c: map.keySet()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
        

    }
}
