package day3;

import java.util.Hashtable;

public class IsoMorphicString {
    public static void main(String[] args) {
      var result = isIsoMorphic("paper","title");
      System.out.println(result);
    }
    public static boolean isIsoMorphic(String string1, String string2){

        if (string1.length() != string2.length())
            return false;

        Hashtable<Character,Character> letterMap1 =  new Hashtable<>();
        Hashtable<Character,Character> letterMap2 =  new Hashtable<>();

        for (var i = 0; i < string1.length(); i++) {
            if(!letterMap1.containsKey(string1.charAt(i))) {
                letterMap1.put(string1.charAt(i),string2.charAt(i));
            }
            else {
                if (string2.charAt(i) != letterMap1.get(string1.charAt(i))){
                    return false;
                }
            }
            if(!letterMap2.containsKey(string2.charAt(i))) {
                letterMap2.put(string2.charAt(i),string1.charAt(i));
            }
            else {
                if (string1.charAt(i) != letterMap2.get(string2.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}


