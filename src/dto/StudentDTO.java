package dto;

public class StudentDTO {
    private long id; //학생 관리번호
    private String studentName;
    private String studentMajor;
    private String studentMobile;

    public StudentDTO(){

    }

    public long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public String getStudentMobile() {
        return studentMobile;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public void setStudentMobile(String studentMobile) {
        this.studentMobile = studentMobile;
    }

    @Override //부모에게 받은 상속을 자식이 맘대로 바꾸고 싶을 때 쓰는 것 && Overloding : 생성자를 여러개 두는 것
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentMobile='" + studentMobile + '\'' +
                '}';
    }

    public void delete(){

    }
}
