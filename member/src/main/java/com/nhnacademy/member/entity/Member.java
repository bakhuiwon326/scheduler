package com.nhnacademy.member.entity;

import com.nhnacademy.member.dto.request.MemberPostRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Email
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String nickname;
    @NotNull
    private Status status;

    public Member(String email, String password, String nickname, Status status){
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.status = status;
    }

    public static Member create(MemberPostRequestDTO requestDTO, Status status){
        return new Member(requestDTO.getEmail(), requestDTO.getPassword(), requestDTO.getNickname(), status);
    }
}
