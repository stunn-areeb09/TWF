package com.example.TWF.dto;

import lombok.Data;


@Data
public class RequestBody {

    String text;

    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
