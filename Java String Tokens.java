import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //String[] = 
        ArrayList<String> res = new ArrayList<String>();
        //System.out.println(res.length);
        for(String st:s.split(" ")){
            String t = "";
            for(int j=0;j<st.length();j++){
                char c = st.charAt(j);
                if(Character.isLetter(c) && !(c==' ')){
                    t=t+c;
                }
                else{
                    if(!t.equals(""))
                        res.add(t);
                    t="";
                }
            }
            if(!t.equals(""))
                res.add(t);
        }
            
        System.out.println(res.size());
        for(String i:res)
            System.out.println(i);
        
        scan.close();
    }
}
