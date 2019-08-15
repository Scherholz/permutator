package test;

import java.util.HashSet;
import java.util.Set;

public class App 
{
    public static Set<String> results = new HashSet<String>();

    public static void permuteHelper(String s,String chosen){
         

        if(s.isEmpty()) if(!results.contains(chosen)){
            results.add(chosen);
            System.out.println(chosen);
        }

        // choose / explore / unchose
        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            str.append(s);
            char c = s.charAt(i);
            chosen += c;
            str.deleteCharAt(i);
            s = str.toString();

            permuteHelper(s, chosen);
            
            str.insert(i, c);
            s = str.toString();
            chosen = chosen.substring(0, chosen.length()-1);
            
        }
        
        
    }

    public static void permuteString(String s){
        
        permuteHelper(s,"");
        
    }

    public static void main( String[] args )
    {
        App.permuteString("easy");
    }
}
