package com.nhnacademy.member.exception;

import com.nhnacademy.member.exception.type.NotFoundException;

public class NotFoundMember extends NotFoundException {
    public NotFoundMember() {
        super("member not found");
    }
    public NotFoundMember(String message) {
        super(message);
    }
}
