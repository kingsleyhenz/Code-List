package basic;

import java.util.Locale;

public class Srtingcont {
    public static void main(String[] args) {
        String str = "It is PoSSible";
//        wordArrangement(str);
//        Substring
//        System.out.println(str.substring(6,7));
        System.out.println(nameAndInitial("Adebayor Michael"));
    }
    public static String wordArrangement(String str){
//        initialize a string to hold uppercase
        String upper = "";
        String lower = "";
        String result = "";
        for (int i = 0; i < str.length(); i++){
            String word = String.valueOf(str.charAt(i));
            if(word.equals(word.toUpperCase())){
                upper += word;
            }else {
                lower += word;
            };
        }
        System.out.println(lower);
        result = upper.concat(lower);
        return result;
    }
    public static String nameAndInitial(String str){
        String[] word = str.split(" ");
        String surname = word[0];
        String last = word[1];
        String initial = " "+surname.substring(0,1).toUpperCase()+ "," + last.substring(0,1).toUpperCase();
        return surname.concat(initial);
    }
}
