import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07_Array {
    public static void main(String[] args){
        print("");

/*

//        (1)
        int[] int_arr1 = {1, 2, 3, 4};


//        (2)
        int[] int_arr2 = new int[4];
        int_arr2[0] = 1;
        int_arr2[1] = 2;
        int_arr2[2] = 3;
        int_arr2[3] = 4;


//        (3)
        int[] int_arr3 = new int[]{1, 2, 3, 4};



//        int [] int_arr4 = new int[]; 길이를 정해줘야함, 나중에 늘리는 것은 불가능.




*/



/*
        String[] arr_st = new String[5];
        String[] arr_st1 = {"123","1234","1234","142"};

        for(String a : arr_st1)
            print(a);
*/




/*
        int[] arr = {12, 3, 6, 56, 3, 2, 4, 5, 67, 2, 3, 4, 0};
        Arrays.sort(arr);



//        객체타입인 경우에만 Comparator클래서 객체 사용가능

        print(Arrays.toString(arr));


        String[] str = {"abc", "bc", "dg","aa","bdd"};
        Arrays.sort(str);
        print(Arrays.toString(str));


        Arrays.sort(str, Comparator.reverseOrder());
        print(Arrays.toString(str));


        Integer[] arr_Integer = {12, 3, 6, 56, 3, 2, 4, 5, 67, 2, 3, 4, 0};
        Arrays.sort(arr_Integer, Comparator.reverseOrder());
        print(Arrays.toString(arr_Integer));

        */



//        방법 2 배열 뒤집기.
/*

        int[] arr1 = {4, 12, 3, 6, 56, 3, 2, 4, 5, 67, 2, 3, 4, 0};
        Arrays.sort(arr1);
        int temp = 0;
        for ( int i = 0 ; i < arr1.length/2 ; i++){
            temp = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = temp;
        }

        print(Arrays.toString(arr1));

*/


//        StreamApi, lamda를 활용한 내림 차순 정렬.


        int[] arr2 = {9, 4, 12, 3, 6, 56, 3, 2, 4, 5, 67, 2, 3, 4, 0};

        int[] new_arr2 = Arrays.stream(arr2)                    // arr2 대상으로 Stream 객체 생성
                .boxed()                                        // Interger 형 변환한 스트림 객체 생성
                .sorted(Comparator.reverseOrder())              // 내림차순 정렬
                .mapToInt( a -> a )                             // Interger 를 인트로 변환 ( 람다 )
                .toArray();                                     // 배열로 변환

        print(Arrays.toString(new_arr2));




//      실습
/*

        int sum = 0;

        int[] int_num = {85, 65, 90};
        for(int a : int_num)
            sum += a;
        double averge = (double) sum/int_num.length;
        print("합계는 " + sum +"이고 평균은 "+ averge + "입니다");

*/

/*

        int[] arr = {10, 20, -3, 41, 45, 2, 34, 6,-7};

        int max = arr[0];
        int min = arr[0];

        for ( int a : arr ){
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }

        print("max : " + max + "     min : " + min);

*/

// 배열의 순서 바꾸기
/*

        int[] arr = {10, 20};
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        print(Arrays.toString(arr));
*/
/*

        int temp2 = 0 ;

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
        for ( int i = 0 ; i < arr2.length-1 ; i++ ){
            temp2 = arr2[i];
            arr2[i] = arr2[i+1];
            arr2[i+1] = temp2;
        }
        print(Arrays.toString(arr2));

*/


//      배열 뒤집기.  for upload ********************



/*

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int length = arr.length;
        int[] arr2 = new int[length];

        for ( int a : arr )
            arr2[--length] = a;

        print(Arrays.toString(arr2));



// 배열 뒤집기 2

*/



/*

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
        int temp = 0;

        int length = arr.length;

        for ( int i = 0 ; i < length/2 ; i++ ){
            temp = arr[i];
            arr[i] = arr[ length - i - 1 ];
            arr[ length - i - 1 ] = temp;
        }

        print(Arrays.toString(arr));

*/
//
//        (n-1) + (n-2) + (n-3) + .. + (n - (n-1)) = n^2 + -3n + 2
//        6c2 = 6*5 / 2*1


// 선택정렬 알고리즘

//        int temp = 0;
//
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i = 0; i < arr.length - 1; i++)
//            for (int j = i+1; j < arr.length; j++)
//                if ( arr[i] < arr[j] ) {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//        print(Arrays.toString(arr));


//        2개의 합의 조합.

/*


        int count = 0;
        int[] arr = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {
                print(arr[i] + "," + arr[j] + "  count : " + ++count);
                print("sum = " + (arr[i] + arr[j]));
            }

*/


//
//// 두개 뽑아서 더하기.
//        import java.util.Arrays;
//
//        class Solution {
//            public int[] solution(int[] numbers) {
//
//                int count = 0;
//                for (int i = 0; i < numbers.length -1; i++)
//                    for (int j = i + 1; j < numbers.length; j++)
//                        count++;
//
//                int[] preAnswer = new int[count];
//
//                count = 0;
//                for (int i = 0; i < numbers.length - 1; i++)
//                    for (int j = i + 1; j < numbers.length; j++)
//                        preAnswer[count++] = numbers[i] + numbers[j];
//
//                Arrays.sort(preAnswer);
//
//                int[] temp = new int[preAnswer.length];
//
//                count = 0;
//                for (int i = 0; i < preAnswer.length - 1; i++)
//                    if (preAnswer[i] != preAnswer[i+1])
//                        temp[count++] = preAnswer[i];
//
//                temp[count++] = preAnswer[preAnswer.length -1];
//                int[] Answer = Arrays.copyOfRange(temp, 0, count);
//
//                return Answer;
//            }
//        }

//
////      버블정렬
//        int[] arr = {9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,1,2,3,4,1,2,3,4,1,2,3,4};
//        System.out.println(Arrays.toString(arr));
//        int temp= 0;
//        int length = arr.length -1;
//        int count1 = 0;
//        int count2 = 0;
//        int count3 = 0;
//
//        for (int i = 0; i < length ; i++) {
//            boolean bool1 = false;
//            for (int j = 0; j < length - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    bool1 = true;
//                }
//                count2++;
//            }
//            if (bool1 = false)
//                break;
//            count3++;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        print(count1 + count2 + count3);
//        print(arr.length);
//        print(arr.length*arr.length);
//









    } // main

    private static void print(List<Integer> A) {
        System.out.println(A);
    }
    private static void print(String a) {
        System.out.println(a);
    }
    private static void print(boolean a) {
        System.out.println(a);
    }
    private static void print(int a) {
        System.out.println(a);
    }

}

















































