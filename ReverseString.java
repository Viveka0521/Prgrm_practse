package RecursionMethod;

// Reverse string using recursion method

public class ReverseString {
    public static void Revstr(String str,int indx){
        if(indx==0){
            System.out.println(str.charAt(indx));
        }
        System.out.print(str.toUpperCase().charAt(indx));
        Revstr(str,indx-1);
    }

    public static void main(String[] args) {
        String str="Viveka";
        Revstr(str,str.length()-1);
    }
}
