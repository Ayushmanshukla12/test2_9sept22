package test2_9sept22;
import java.util.*;
class Operations{
    void display(){
        System.out.println("1. number of data you want to enter");
        System.out.println("2. to fetch the array");
        System.out.println("3.to sort and reverse the array");
        System.out.println("4.exit");
    }
    void menudriven(){
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the choice");
////        int choice=sc.nextInt();
        System.out.println("enter the number of data");
        int numofdata=sc.nextInt();

        int index;
        int arr[]=new int[numofdata];
        while(true){
            System.out.println("enter the choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter the array elements");
                    for(index=0;index<arr.length;index++){
                        arr[index]=sc.nextInt();
                    }
                    break;
                case 2:
                    for(index=0;index<arr.length;index++){
                        System.out.println(arr[index]);
                    }
                    break;
                case 3:
                    Arrays.sort(arr);
                       for(index=0;index< arr.length;index++){
                        System.out.println("sorted array is " +arr[index] );}
                        System.out.println("*******************************");

                    for(index= arr.length-1;index>0;index--){
                            System.out.println("reverse array is "+ arr[index]);
                        }
                        break;
                default:
                    System.out.println("exit");


            }
        }
    }
}
public class Menudrivendemo {
    public static void main(String[] args) {
        Operations operations =new Operations();
        operations.display();
        operations.menudriven();
    }
}
