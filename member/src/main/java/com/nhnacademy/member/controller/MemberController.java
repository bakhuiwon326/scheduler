package com.nhnacademy.member.controller;

import com.nhnacademy.member.dto.request.MemberPostRequestDTO;
import com.nhnacademy.member.dto.response.MemberGetResponseDTO;
import com.nhnacademy.member.dto.response.MemberPostResponseDTO;
import com.nhnacademy.member.service.MemberService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/members")
public class MemberController {

    private MemberService memberService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MemberPostResponseDTO registerMember(@RequestBody MemberPostRequestDTO requestDTO){
        return memberService.registerMember(requestDTO);
    }

    @GetMapping("/{memberId}")
    public MemberGetResponseDTO getMember(@PathVariable long memberId){
        return memberService.getMember(memberId);
    }

}
