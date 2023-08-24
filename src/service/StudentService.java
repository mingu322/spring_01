package service;

import dto.StudentDTO;
import repository.StudentRepository;

import java.util.Scanner;

public class StudentService {
    Scanner sc = new Scanner(System.in);
    StudentRepository studentRepository = new StudentRepository();

    // 학생등록 메서드
    // 매개변수 없음.
    // 리턴 없음.
    // 메서드 이름: save()
    // 실행내용
    // 스캐너로 이름(studentName), 학과(studentMajor), 전화번호(studentMoblie)를 입력받고
    // 입력값을 DTO객체에 담아서 StudentRepository의 save() 메서드로 전달
    public void save() {
        System.out.print("이름: ");
        String studentName = sc.next();
        System.out.print("학과: ");
        String studentMajor = sc.next();
        System.out.print("전화번호: ");
        String studentMobile = sc.next();
        // DTO 객체
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentMajor(studentMajor);
        studentDTO.setStudentMobile(studentMobile);
        // DTO 객제를 StudentRepository의 save() 메서드로 전달하여 리턴을 boolean으로 받음.
        boolean result = studentRepository.save(studentDTO);
        //reponsitory save() 내용
        // 넘겨받은 dto 객제를 리스트에 추가하고 추가하면 true 리턴
        if (result) {
            System.out.println("등록 성공");
        } else {
            System.out.println("등록 실패");
        }
    }

    /*
        findAll() 메서듣
        Main에서 3번 선택시 호출되는 메서드
        매개변수 리턴 없음.
        실행내용
        - Repository의 findAll 메서드를 호출하여 리스트를 리턴받음.
        - 리턴받은 리스트에 담긴 데이터를 for문을 이용하여 출력함.
     */
    public void findAll() {
        for (StudentDTO dto : studentRepository.findAll()) {
            System.out.println(dto.toString());
        }
    }

    public void findById(){
        findAll();
        System.out.print("조회할 학생: ");
        long id = sc.nextLong();
        StudentDTO dto = studentRepository.findById(id);
        if(dto == null){
            System.out.println("찾는 정보가 없습니다.");
        }else {
            System.out.println("조회학생 정보: " + dto);
        }
    }

    public void update(){
        System.out.print("수정할 학생: ");
        long id = sc.nextLong();
        StudentDTO dto = studentRepository.findById(id);
        System.out.println("학생 정보: " + dto);
        System.out.print("수정할 전화번호: ");
        String studentMobile = sc.next();
        dto.setStudentMobile(studentMobile); // 조회된 학생 정보의 전화번호를 수정
        studentRepository.update(dto); // 수정된 학생 정보 업데이트
        System.out.println("업데이트 완료: " + dto);
    }

    public void delete() {
        findAll();
        // 삭제할 id 입력
        System.out.print("삭제 id: ");
        long id = sc.nextLong();
        studentRepository.delete(id);
    }
}
