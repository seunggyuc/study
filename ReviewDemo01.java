//import java.util.Scanner;
//// v.01
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int cnt = 0;
//
//        for(int k=1; k<=number; k++){
//            if(number % k == 0)
//                cnt++;
//        }
//
//        if(cnt==2)
//            System.out.println(number + "은(는) 소수!");
//        else System.out.println(number + "은(는) 소수가 아닙니다.");
//    }
//}

//import java.util.Scanner;
//// v.02
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int cnt = 0;
//
//        for(int k=2; k<number; k++){ // 반복횟수 2회 감소
//            if(number % k == 0)
//                cnt++;
//        }
//
//        if(cnt==0) // 카운트가 0 이 유지되면 true
//            System.out.println(number + "은(는) 소수!");
//        else System.out.println(number + "은(는) 소수가 아닙니다.");
//    }
//}

//
//import java.util.Scanner;
//// v.03
//public class ReviewDemo01 {
//    public static void main(String[] args) {
//        // 소수 : 1과 자기자신외에는 나누어 떨어지지않는 수
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        boolean isPrime = true;  // flag 타입의 변수 (isPrime)
//        // is 가 사용되는 구문은 참,거짓을 주로 나타내며, 논리형 boolean 타입을 사용함
//
//        for(int k=2; k<number; k++){ // 반복횟수 2회 감소
//            if(number % k == 0) // 입력된 수를 k로 나누었을 때 나머지가 0인 경우 즉, 약수의미
//                isPrime  = false;
//        }
//
//        if(isPrime) // isPrime 변수값이 true 로 유지가 되면
//            System.out.println(number + "은(는) 소수!");
//        else
//            System.out.println(number + "은(는) 소수가 아닙니다.");
//    }
//}

import java.util.Scanner;
// v.05
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;  // flag 타입의 변수 (isPrime)
        // is 가 사용되는 구문은 참,거짓을 주로 나타내며, 논리형 boolean 타입을 사용함

      /*  for(int k=2; k<number; k++){ // 반복횟수 2회 감소
            if(number % k == 0) { // 입력된 수를 k로 나누었을 때 나머지가 0인 경우 즉, 약수의미
                isPrime = false;
                break; // false 가 되면 바로 브레이크해서 의미없는 증가 금지
            }
            System.out.println(k);
        }*/

        int k=2;
        while(k<number){
            if(number%k==0) {
                isPrime = false;
                break;
            }
            System.out.println(k);
            k++;
        }

        if(isPrime) // isPrime 변수값이 true 로 유지가 되면
            System.out.println(number + "은(는) 소수!");
        else
            System.out.println(number + "은(는) 소수가 아닙니다.");
    }
