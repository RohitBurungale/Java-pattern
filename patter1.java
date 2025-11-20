import java.util.*;
public class patter1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the how many rows");
        int  n=sc.nextInt();
        System.out.println("enter the how many colums");
        int m= sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
               if(i==1||i==n||j==1||j==m){
                System.out.print("*");
               }
            else{
                System.out.print(" ");
            }
            }System.out.println("");
         }
    }
    
}
//output:
// enter the how many rows
// 3
// enter the how many colums
// 4
// ****
// *  *
// ****
