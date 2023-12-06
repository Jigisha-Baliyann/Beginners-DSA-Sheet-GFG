class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] answer = new long[n];
        int a=1, b=1;
        answer[0] = a;
        if (n==1) return answer;
        answer[1] = 1;
        if (n==2) return answer;
        int c = a + b;
        answer[2] = c;
        if (n==3) return answer;
        for (int i=3; i<n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }
}
