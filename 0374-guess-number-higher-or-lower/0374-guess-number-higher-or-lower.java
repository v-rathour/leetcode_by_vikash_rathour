/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i=0;
        int mid=0;
        while(i<=n){
             mid=(n-i)/2+i;
            if(guess(mid)==0)
               break;
            if(guess(mid)<0)
                n=mid-1;
            if(guess(mid)>0)
                i=mid+1;
        }
        return mid;
    }
}