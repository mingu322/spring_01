public class TestClass {
    /*
     * class가 가지고 있는 자원
     * - 필드(field): 속성값, 해당 자원이 가질 수 있는 구체적 정보(회원의 이름, 비번, 아이디 등)
     * - 생성자(constructor): 해당 클래스 객체(인스턴스)를 만들 때 정의하는 규칙
     * - 메서드(method): 특정 기능을 수행하기 위한 코드 블록
     */

    // 생성 단축키 : alt + insert

    //필드
    private int num;
    private String name;

    // 기본 생성자
    public TestClass() {
    }

    // 매개변수가 있는 생성자
    public TestClass(int num, String name){
        this.num = num;
        this.name = name;
    }
    // getter/setter method : 필드는 private으로 보호하고 필드 값 접근을 위해 공개하는 method
    // getter : 필드 값을 가져올 때(return 있음)
    // setter : 필드 값을 저장할 때(return 없고, 매개변수 있음)

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String testMethod1() {
        return "안녕하세요";
    }
}