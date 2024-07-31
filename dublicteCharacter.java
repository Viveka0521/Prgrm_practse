package String;
//Write a code to filter dublicate elements from an array / String and print as a list.

public class dublicteCharacter {
    //find the
    public static void main(String[] args) {
        dublicateChar1("steerrriiing");
    }
        public static <Char> void dublicateChar1(String str1){
            int count = 1;

            for (int i = 0; i < str1.length()-1; i++)
            {
                for(int j=0;j<str1.length();j++)
                {
                if (str1.charAt(i) == str1.charAt(j + 1))
                {
                    count = count + 1;
                }
                }
                if (count>1)
                {
                System.out.println("The dublicate char is: " +str1.charAt(i)+"-"+count);}
            }

        }

}