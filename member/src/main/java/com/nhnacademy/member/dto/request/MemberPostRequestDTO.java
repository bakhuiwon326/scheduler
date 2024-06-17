package com.nhnacademy.member.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberPostRequestDTO {
    private String email;
    private String password;
    private String nickname;
}
