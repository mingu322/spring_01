package main;

import service.MemberService;

import java.util.Scanner;

public class MainsClass {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("=====맴버 관리 페이지=====");
            System.out.println("1.회원가입, 2.로그인, 3.회원목록조회, 4.회원상세정보, 5.회원정보수정, 6.회원정보삭제, 0.종료");
            System.out.print("메뉴 선택: ");
            int mb = sc.nextInt();

            if (mb == 0){
                System.out.println("프로그램 종료");
                break;
            }else if (mb == 1){
                System.out.println("회원가입");
                memberService.save();
            }else if (mb == 2){
                System.out.println("로그인");
                memberService.login();
            }else if (mb == 3){
                System.out.println("회원목록조회");
                memberService.findAll();
            }else if (mb == 4){
                System.out.println("회원상세정보");
                memberService.findById();
            }else if (mb == 5){
                System.out.println("회원정보수정");
                memberService.update();
            }else if (mb == 6){
                System.out.println("회원정보삭제");
                memberService.delete();
            }else {
                System.out.println("메뉴를 다시 선택하세요.");
            }
        }
    }
}
