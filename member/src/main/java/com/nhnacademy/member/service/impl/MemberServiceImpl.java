package com.nhnacademy.member.service.impl;

import com.nhnacademy.member.dto.request.MemberPostRequestDTO;
import com.nhnacademy.member.dto.response.MemberGetResponseDTO;
import com.nhnacademy.member.dto.response.MemberPostResponseDTO;
import com.nhnacademy.member.entity.Member;
import com.nhnacademy.member.entity.Status;
import com.nhnacademy.member.exception.AlreadyExistEmail;
import com.nhnacademy.member.exception.NotFoundMember;
import com.nhnacademy.member.repository.MemberRepository;
import com.nhnacademy.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public MemberPostResponseDTO registerMember(MemberPostRequestDTO memberPostRequestDTO) {

        if(memberRepository.existsByEmail(memberPostRequestDTO.getEmail())) {
            throw new AlreadyExistEmail();
        }

        Member member = Member.create(memberPostRequestDTO, Status.ACTIVE);
        Member savedMember = memberRepository.save(member);

        return new MemberPostResponseDTO(savedMember.getId(), savedMember.getEmail(), savedMember.getNickname());
    }

    @Override
    public MemberGetResponseDTO getMember(long memberId) {
        Member member = memberRepository.findById(memberId).orElseThrow(() -> new NotFoundMember());
        return new MemberGetResponseDTO(member.getId(), member.getEmail(), member.getNickname(), member.getStatus());
    }
}
