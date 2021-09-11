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

import java.util.Scanner;
// v.02
public class ReviewDemo01 {
    public static void main(String[] args) {
        // 소수 : 1과 자기자신외에는 나누어 떨어지지않는 수
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int cnt = 0;

        for(int k=2; k<number; k++){ // 반복횟수 2회 감소
            if(number % k == 0)
                cnt++;
        }

        if(cnt==0) // 카운트가 0 이 유지되면 true
            System.out.println(number + "은(는) 소수!");
        else System.out.println(number + "은(는) 소수가 아닙니다.");
    }
}

