public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.

        for(int i=0;i<n;i++){
            int flag = 0;
            if(i%2==0) flag = 1;
            for(int j=0;j<=i;j++){
                if(flag==0){
                    System.out.print(flag+" ");
                    flag=1;
                }
                else{
                    System.out.print(flag+" ");
                    flag=0;
                }
            }
            System.out.println();
        }
    }
}