package com.nhnacademy.member.dto.response;

import lombok.Getter;

@Getter
public class MemberPostResponseDTO {
    private long id;
    private String email;
    private String nickname;
    public MemberPostResponseDTO(long id, String email, String nickname){
        this.id = id;
        this.email = email;
        this.nickname = nickname;
    }
}
