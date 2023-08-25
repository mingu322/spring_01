package service;

import dto.MemberDTO;
import dto.StudentDTO;
import repository.MemberRepository;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MemberService {
    Scanner sc = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    // 로그인 여부를 판단하는 static 필드 // static을 쓰는 이유는 맴버서비스라는 프로젝트가 새로 재 실행이 되서 리셋이 되도 값은 유지 될 수 있게 하는 것이다.
    private  static String loginEmail = null;

    public void save(){
        System.out.print("이메일: ");
        String memberEmail = sc.next();
        System.out.print("비밀번호: ");
        String memberPassword = sc.next();
        System.out.print("이름: ");
        String memberName = sc.next();
        System.out.print("전화번호: ");
        String memberMobile = sc.next();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setMemberEmail(memberEmail);
        memberDTO.setMemberPassword(memberPassword);
        memberDTO.setMemberName(memberName);
        memberDTO.setMemberMobile(memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result){
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원가입 실패");
        }
    }

    public void findAll(){
        for(MemberDTO dto : memberRepository.findAll()){
            System.out.println(dto.toString());
        }
    }

    public void findById(){
        findAll();
        System.out.print("조회할 학생: ");
        String email = sc.next();
        MemberDTO dto = memberRepository.findById(email);
        if(dto == null){
            System.out.println("찾는 정보가 없습니다.");
        }else {
            System.out.println("조회회원 정보: " + dto);
        }
    }

    public void update(){
        findAll();
        System.out.print("수정할 회원정보: ");
        String email = sc.next();
        MemberDTO dto = memberRepository.findById(email);
        System.out.println("회원 정보: " + dto);
        System.out.print("수정할 비밀번호: ");
        String memberPassword = sc.next();
        dto.setMemberPassword(memberPassword);
        System.out.print("수정할 이름: ");
        String memberName = sc.next();
        dto.setMemberName(memberName);
        System.out.print("수정할 전화번호: ");
        String memberMobile = sc.next();
        dto.setMemberMobile(memberMobile);
        memberRepository.update(dto);
        System.out.println("수정 완료: " + dto);
    }
    public void delete(){
        findAll();
        System.out.print("삭제할 회원: ");
        String email = sc.next();
        MemberDTO memberDTO = memberRepository.findById(email);
        if(memberDTO == null) {
            System.out.println("존재x ");
        } else {
            memberRepository.delete(memberDTO);
            System.out.println("삭제성공");
        }
    }

    public void login(){
        System.out.print("이메일: ");
        String memberEmail = sc.next();
        System.out.print("비밀번호: ");
        String memberPassword = sc.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
        if(loginResult != null){
            System.out.println("로그인 성공");
            loginEmail = memberEmail;
        }else{
            System.out.println("로그인 실패");
        }
    }
}
