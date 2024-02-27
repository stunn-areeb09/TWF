package com.example.TWF.dto;

import lombok.Data;


@Data
public class ResponseBody {

    String translatation;

    public String getTranslatation() {
        return translatation;
    }

    public void setTranslatation(String translatation) {
        this.translatation = translatation;
    }
}
