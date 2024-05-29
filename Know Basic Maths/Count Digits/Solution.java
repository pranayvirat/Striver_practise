class Solution{
    static int evenlyDivides(int N){
        // code here
        
        int sum = 0;
        int temp = N;
        
        while(temp>0){
            int n = temp%10;
            
            if(n!=0 && N%n==0){
                sum++;
            }
            temp = temp/10;
        }
        
        return sum;
        
    }
}