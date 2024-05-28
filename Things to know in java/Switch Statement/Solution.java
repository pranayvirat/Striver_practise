class Solution{
    static double switchCase(int choice, List<Double> arr){
        // code here
        
        switch(choice){
            case 1:
                return (double)(Math.PI*arr.get(0)*arr.get(0));
                
            case 2:
                return (double)(arr.get(0)*arr.get(1));
                
            
            default:
                return 0;
        }
    }
}