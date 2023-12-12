import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_for_Excute {
    public static void main(String[] args) {
        print("");



// 끼워넣기
List<Integer> myList = new ArrayList<>();
myList.add(10);
myList.add(20);
myList.add(1,15);
print("끼워넣기 : " + myList.toString());



// 2번째 만들어 붙이기
List<Integer> myList2 = new ArrayList<>();
myList2.add(30);
myList2.add(40);
myList2.add(50);

myList.addAll(myList2);
print("붙이기 : " + myList.toString());
print("붙이고 나서 List2 : " + myList2.toString());      //empty



// get 하기.
for (Integer integer : myList) print(integer);



// 삭제하기.
myList.remove(0);
myList.remove(Integer.valueOf(0));
print(myList.toString());



// 삽입하기.
myList.set(myList.size()-1, 100);
print(myList.toString());



// 특정값 이 있는지.
print(myList.contains(15));



// 인덱스 찾기.  - 없으면 -1;
List<Integer> myList3 = new ArrayList<>();

myList3.add(10);
myList3.add(10);
myList3.add(20);
myList3.add(30);

print("인덱스 값은 : " + myList3.indexOf(20));     // 같은 숫자는 처음 값 리턴.



// 전체 삭제
myList3.clear();
print("클리어 : " + myList3.toString());



// 전체삭제.
print(myList2.isEmpty());
myList2.clear();



// 리스트 출력














    }   // main

    private static void print(Integer A) {
        System.out.println(A);
    }
    private static void print(List<String> A) {
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





























































