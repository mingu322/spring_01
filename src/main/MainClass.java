package main;

import service.StudentService;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class MainClass {
    // 스캐너를 이용하여
    // 1. 학생등록
    // 2. 학생상세조회
    // 3. 학생목록조회
    // 를 선택하는 코드를 작성합시다.

    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        while(true){
        Scanner sc = new Scanner(System.in);

            System.out.println("=====학생페이지=====");
            System.out.println("1. 학생등록, 2.,학생상세조회 3.학생목록조회, 4,학생정보수정, 5,학생삭제, 0.종료");
            int stu = sc.nextInt();

            if (stu == 0) {
                System.out.println("종료");
                break;
            } else if (stu == 1){
                System.out.println("학생등록");
                studentService.save();
            } else if (stu == 2) {
                System.out.println("학생상세조회");
                studentService.findById();
                  /*
                service의 findById
                - id값을 입력받고, repository의 findById로 id값을 넘김
                - 입력받은 id에 해당하는 학생 데이터를 리턴받음(일치하는 것 찾기)
                - 리턴받은 값을 출력함
                 */
            } else if (stu == 3) {
                System.out.println("학생목록조회");
                studentService.findAll();
            } else if (stu == 4) {
                System.out.println("학생정보수정");
                studentService.update();
            } else if (stu == 5) {
                System.out.println("학생삭제");
                studentService.delete();
            } else {
                System.out.println("다시 선택하세요.");
            }
        }
    }
}

