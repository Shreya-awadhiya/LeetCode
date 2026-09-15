// class Solution {
//     public boolean checkDivisibility(int n) {
//        int first = n/10; //2
//        int last = n%10;  //3

//        int sum = first + last;   //5
//        int mul = first * last;   //6

//        int add = sum + mul;    //11

//        if( n%add == 0 ){       // 23/11 ==0
//           return true;
//        }    
//        return false;
//     }
// }


class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int digitSum = 0;
        int digitProduct = 1;

        while (n > 0) {
            int digit = n % 10;
            digitSum += digit;
            digitProduct *= digit;
            n /= 10;
        }

        int divisor = digitSum + digitProduct;
        return original % divisor == 0;
    }
}