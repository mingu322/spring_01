package dto;

public class MemberDTO {
    private long id; //맴버 관리번호
    private String MemberEmail;
    private String MemberPassword;
    private String MemberName;
    private String MemberMobile;

    public MemberDTO(){

    }

    public long getId() {
        return id;
    }

    public String getMemberEmail() {
        return MemberEmail;
    }

    public String getMemberPassword() {
        return MemberPassword;
    }

    public String getMemberName() {
        return MemberName;
    }

    public String getMemberMobile() {
        return MemberMobile;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMemberEmail(String memberEmail) {
        MemberEmail = memberEmail;
    }

    public void setMemberPassword(String memberPassword) {
        MemberPassword = memberPassword;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public void setMemberMobile(String memberMobile) {
        MemberMobile = memberMobile;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "id=" + id +
                ", MemberEmail='" + MemberEmail + '\'' +
                ", MemberPassword='" + MemberPassword + '\'' +
                ", MemberName='" + MemberName + '\'' +
                ", MemberMobile='" + MemberMobile + '\'' +
                '}';
    }
}

