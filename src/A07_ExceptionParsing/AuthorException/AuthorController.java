package A07_ExceptionParsing.AuthorException;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class AuthorController {
    public static void main(String[] args) {

        //        메모리 DB에 데이터 추가/삭제 부분은 repository로 분리.
//        Controller (입력받고, 객체 생성, 예외처리)
//        Service (비지니스로직 - resister,login throw new)
//        Repository (


        AuthorService authorService = new AuthorService();

        Scanner myScan = new Scanner(System.in);
        String name, email, password;


        while (true) {
            print(""); print("");
            print("----------------------------------");
            print("-- 이용하실 서비스 번호를 눌러주세요 --"); print("");
            print("     1. 회원가입");
            print("     2. 로그인");
            print("     종료 : exit");

            String select = myScan.nextLine(); if(select.equals("exit")) break;

            switch (select){
                case "1" :          // 회원 등록
                    print("");
                    print("******* 회원가입 정보(이름,이메일,비밀번호)를 입력해주세요 *******");
                    print("이름:");  name = myScan.nextLine();
                    print("이메일:");  email = myScan.nextLine();
                    print("비밀번호:"); password = myScan.nextLine();
                    try {
                        authorService.register(new Author(name, email, password));
                    } catch ()
                    break;


                case "2" :          // 로그인
                    print("");
                    print("******* 로그인 하실 (이메일,Password) 정보를 입력해주세요.. *******"); print("");
                    print("이메일:"); email = myScan.nextLine();
                    print("비밀번호:"); password = myScan.nextLine();

                    try {}
                    catch{}

                    Optional<Author> loginedAuthor = authorService.; (없으면 여기서
                예외 발생)
                    if(){
                        loginedAuthor.get() " 환영합니다. "
                    }
                    break;
            }
        }
    }
    static void print(String a) {System.out.println(a);}

}
