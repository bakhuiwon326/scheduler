package com.nhnacademy.member.service;

import com.nhnacademy.member.dto.request.MemberPostRequestDTO;
import com.nhnacademy.member.dto.response.MemberGetResponseDTO;
import com.nhnacademy.member.dto.response.MemberPostResponseDTO;

public interface MemberService {
    MemberPostResponseDTO registerMember(MemberPostRequestDTO memberPostRequestDTO);
    MemberGetResponseDTO getMember(long memberId);
}
