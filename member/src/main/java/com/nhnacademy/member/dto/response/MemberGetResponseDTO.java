package com.nhnacademy.member.dto.response;

import com.nhnacademy.member.entity.Member;
import com.nhnacademy.member.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberGetResponseDTO {
    private long id;
    private String email;
    private String nickname;
    private Status status;
}
