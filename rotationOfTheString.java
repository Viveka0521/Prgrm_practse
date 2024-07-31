package String;

public class rotationOfTheString {
    //Write a program to verify whether 2 strings are rotation of each other.
    //a.Same Length
    //b. Contain same character
    //c. rotation around of the character.
    public static void main(String[] args) {
        System.out.println("2 string are rotation of each other?" +isRotataionversion("abcd","dacb"));
        
    }
    public static  boolean isRotataionversion(String str, String rotatedString)
    {
        if(str==null || rotatedString==null) {
            return false;
        } else if (str.length()!= rotatedString.length()) {
            return false;
        }else {
            String conct = str+str;
            return conct.contains(rotatedString);

        }
    }
}
