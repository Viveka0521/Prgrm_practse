package String;

import java.security.spec.RSAOtherPrimeInfo;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("viveka nand");
        System.out.println(sb.capacity());
        System.out.println(sb.append(" Hi")); // append is used to add text at the end of the string.

        sb.append("Viveka123dem ohvyuf");
        System.out.println(sb.capacity());    // 27*2+2=56
        System.out.println(sb.length());        // length of the string including spaces
    }
}
