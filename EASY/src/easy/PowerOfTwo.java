package easy;
/**231. Power of Two  QuestionEditorial Solution  My Submissions
Total Accepted: 90169
Total Submissions: 237048
Difficulty: Easy
Given an integer, write a function to determine if it is a power of two.*/
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        //after writing out the binary representation of some numbers: 1,2,4,8,16,32, you can easily figure out that
        //every number that is power of two has only one bit that is 1
        //then we can apply that cool trick that we learned from {@link easy.NumberOfIBits}: n&(n-1) which will clear the least significant bit in n to zero
        if(n <= 0) return false;
        return (n&(n-1)) == 0;
    }
    
    public static void main(String...strings){
        PowerOfTwo test = new PowerOfTwo();
        System.out.println(test.isPowerOfTwo(14));
    }
}