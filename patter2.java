import java.util.*;
public class patter2
{
    public static void main(String [] args)
    {
        int a=4;
        // for(int i=1;i<=4;i++){
        //     for(int j=a;j>=i;j--){
        //         System.out.print("*");
                
        //     }System.out.println(" ");
        // // } out put   *****
        //                ***
        //                **
        //                *




        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=a-i;j++)
            {
                System.out.print(" ");
            }
                for (int k=1;k<=i;k++)
                {
                    System.out.print("*");
                }
                System.out.println(" ");
                
        } 
        
    }

}

//output:
//    * 
//   ** 
//  *** 
// **** 
