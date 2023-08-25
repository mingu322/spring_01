package repository;

import dto.MemberDTO;
import dto.StudentDTO;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<MemberDTO> memberDTOList = new ArrayList<>();

    public boolean save(MemberDTO memberDTO){
        int size = memberDTOList.size();
        memberDTO.setId((long) (size+1));
        memberDTOList.add(memberDTO);
        System.out.println(memberDTOList.size());
        return true;
    }

    public List<MemberDTO> findAll(){
        return memberDTOList;
    }

    public MemberDTO findById(String email) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (email.equals(memberDTO.getMemberEmail())) {
                return memberDTO;
            }
        }
        return null;
    }
    public MemberDTO update(MemberDTO memberDTO){
        return memberDTO;
    }

    public void delete(MemberDTO memberDTO) {
        memberDTOList.remove(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPassword){
        for(MemberDTO memberDTO : memberDTOList){
            if(memberEmail.equals(memberDTO.getMemberEmail()) && memberPassword.equals(memberDTO.getMemberPassword())){
                return memberDTO;
            }
        }
        return null;
    }
}

