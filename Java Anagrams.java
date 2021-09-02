import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        //System.out.println(a + " " + b);
        int[] a1 = new int[26];
        int[] b1 = new int[26];
        String v = "abcdefghijklmnopqrstuvwxyz";
        
        for(char i:a.toCharArray()){
            int t = v.indexOf(i);
            a1[t]+=1;
        }
        for(char i:b.toCharArray()){
            int t = v.indexOf(i);
            b1[t]+=1;
        }
        
        for(int i=0;i<26;i++){
            if(a1[i]!=b1[i])
                return false;
        }
        
        return true;
    }
