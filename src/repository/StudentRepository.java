package repository;


import java.util.*;
import dto.StudentDTO;

public class StudentRepository {
    // 학생정보를 저장할 리스트
    private List<StudentDTO> studentDTOList = new ArrayList<>();

    public boolean save(StudentDTO studentDTO) {
        // id 값을 하나씩 증가시켜 함께 저장(현재 리스트에 저장된 학생 수 가져오고 1 증가하여 저장)
        int size = studentDTOList.size();
        studentDTO.setId((long) (size + 1));
        studentDTOList.add(studentDTO);
        System.out.println(studentDTOList.size());
        // 리스트에 신규학생 추가
        return true;
    }

    public List<StudentDTO> findAll() {
        return studentDTOList;
    }

    public StudentDTO findById(long id) {
        for (StudentDTO studentDTO : studentDTOList) {
            if (studentDTO.getId() == id) {
                return studentDTO;
            }
        }
        //for(int i = 0; i< studentDTOList.size(); i++){
        //if (id == studentDTOList.get(i).getId()){
        //return studentDTOList.get(i);
        //}
        //}
        return null; // 특정 ID에 해당하는 학생이 없을 경우 null을 반환합니다.
    }

    public StudentDTO update(StudentDTO studentDTO) {
        return studentDTO;
    }

    public void delete(long id) {
        for(StudentDTO studentDTO : studentDTOList) {
            if (id == studentDTO.getId()) {
                studentDTOList.remove(studentDTO);
            }
        }
    }

}

