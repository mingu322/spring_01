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

    public MemberDTO findById(long id) {
        for (MemberDTO memberDTO : memberDTOList) {
            if (memberDTO.getId() == id) {
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
}

