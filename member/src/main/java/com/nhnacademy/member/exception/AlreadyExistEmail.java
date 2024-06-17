package com.nhnacademy.member.exception;

import com.nhnacademy.member.exception.type.BadRequestException;

public class AlreadyExistEmail extends BadRequestException {
    public AlreadyExistEmail(){
        super("email already exist");
    }
    public AlreadyExistEmail(String message) {
        super(message);
    }
}
