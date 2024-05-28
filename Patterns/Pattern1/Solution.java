class Solution {

    void printSquare(int n) {
        // code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==n-1) System.out.print("*");
                else
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}