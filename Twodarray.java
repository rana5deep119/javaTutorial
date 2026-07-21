import java.util.*;

public class Twodarray{
    public static void main(String[] args){
        int[][] arr=new int[3][4];

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();               
            }
        }

        int sum =0;

         for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("sum of 2d array is "+ sum);
    }

    
}