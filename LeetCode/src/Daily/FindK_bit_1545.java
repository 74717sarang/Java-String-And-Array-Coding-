package Daily;

public class FindK_bit_1545 {
	public static char findKthBit(int n, int k) {

        if (n == 1) {
            return '0';
        }
        int length = (1 << n) - 1;
        int mid = length / 2 + 1;

        // StringBuilder str=new StringBuilder();
        // str="0";
        // String s=backtrakingString(str,n)

        if (k == mid) {
            return '1';
        } else if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            char bit = findKthBit(n - 1, length - k + 1);
            return (bit == '0') ? '1' : '0'; // Invert the bit
        }
    }
	
	
	public static void main(String[] args) {
		//letcode :: 1545
//	         	Input: n = 3, k = 1
//				Output: "0"
//				Explanation: S3 is "0111001".
//				The 1st bit is "0".
		
		System.out.println(findKthBit(4, 11));
	}
}
