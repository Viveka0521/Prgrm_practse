package RecursionMethod;


/// Find the first and Last occurence of an element in a string

import com.sun.source.tree.LabeledStatementTree;
import org.jetbrains.annotations.NotNull;

public class OccurenceOfaString {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance( String str1, int indx, char element){
        if (indx==str1.length())
        {
            System.out.println("first occurence = " +first);
            System.out.println("last occurence = " +last);
            return;
        }
        char currchar= str1.charAt(indx);
        if (currchar==element) {
            if (first == -1) {
                first = indx;
            } else {
                last = indx;
            }
        }
        findOccurance(str1,indx+1,element);
        }
    public static void main(String[] args) {
        String str1="bcaadeaaferahg";
        findOccurance(str1,0,'a');
    }
}
