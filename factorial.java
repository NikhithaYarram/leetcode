import java.util.Arrays;
import java.util.Scanner;

class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // factorial
        // int a=sc.nextInt();
        // int fact=1;
        // for(int i=1; i<=a; i++){
        //     fact=fact*i;

        // }
        // System.out.println(fact);

        // prime
        // int num=sc.nextInt();
        // boolean b=true;
        // if(num<=1){
        //     b=false;
        // }
        // else{
        //     for(int i=2;i<=Math.sqrt(num); i++){
        //         if(num%i==0){
        //             b= false;
        //             break;
        //         }
        //     }
        // }
        // if(b){
        //     System.out.println("is prime");
        // }
        // else{
        //     System.out.println("Not a prime");
        // }


        // fibanoci
        // int num=sc.nextInt();
        // int a=1,b=2;
        // for(int i=0; i<=num; i++){
        //     System.out.print(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;

        // reverse a string
        // String str=sc.nextLine();
        // String rev="";
        // for(int i=str.length()-1; i>=0; i--){
        //     rev+=str.charAt(i);
        // }
        // System.out.println("reverse string is: "+rev);

        // palindrome
        // String str=sc.nextLine();
        // String rev="";
        // for(int i=str.length()-1; i>=0; i--){
        //     rev+=str.charAt(i);
        // }
        // if(str.equals(rev)){
        //     System.out.println("is a palindrome");
        // }


        // duplicates in array
        int arr[]={3,2,5,1,1,3,6,2,7};
        int temp[]=new int[arr.length];
        Arrays.sort(arr);
        int j=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]){
                temp[j++]=arr[i];
            }
        }
        temp[j++] = arr[arr.length-1];
        for(int i=0; i<temp.length-1; i++){
            System.out.print(temp[i]+" ");
        }

       sc.close();
    }
}