class Solution {
    static int safePos(int n, int k) {

        int answer = result(n,k);

        return answer+1;

    }

     static int result(int n, int k) {

        if(n==1)

          return 0;

        int answer = result(n-1,k);

        return (answer+k)%n;

    }
};