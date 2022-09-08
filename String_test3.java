package test2_9sept22;
import java.util.*;

class Stringsssssss {
    String temp;

    void sortinganddisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of data ");
        int numofdata=sc.nextInt();
        String string[] = new String[numofdata];
        System.out.println("Enter the string");
        for(int i=0;i<string.length;i++)
        string[i] = sc.nextLine();

        for(int outerindex=0;outerindex<string.length;outerindex++){
            for(int innerindex=outerindex+1;innerindex<string.length;innerindex++){
                if(string[innerindex].length()<string[outerindex].length()){
                    temp=string[outerindex];
                    string[outerindex]=string[innerindex];
                    string[innerindex]=temp;
                }
            }

        }
        System.out.println(Arrays.toString(string));
    }
    void lexicographicallysorting(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of data ");
////        int numofdata=sc.nextInt();
//
//        System.out.println("Enter the string");
        String string1 ="I Love My India";
        String string[] = string1.split(" ");
        Arrays.sort(string);

        System.out.println(Arrays.toString(string));

    }
    void reversing(){
        StringBuffer sb = new StringBuffer("I love my India");
        System.out.println(sb.reverse());
    }

}

public class String_test3 {
    public static void main(String[] args) {
      Stringsssssss stringsssssss = new Stringsssssss();

     //stringsssssss.lexicographicallysorting();
      //stringsssssss.reversing();
        stringsssssss.sortinganddisplay();
    }
}
