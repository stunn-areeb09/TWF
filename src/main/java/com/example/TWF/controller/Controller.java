package com.example.TWF.controller;

import com.example.TWF.dto.RequestBody;
import com.example.TWF.dto.ResponseBody;
import com.example.TWF.service.TranslateService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Controller {
    @PostMapping("/translate")
    public ResponseEntity Translate(@org.springframework.web.bind.annotation.RequestBody RequestBody body){
        ResponseBody responseBody = new ResponseBody();
        if(body.getText().isBlank() || body.getText().isEmpty()){
            responseBody.setTranslatation("Empty Response body !! Please Provide something to translate");
            return new ResponseEntity<>(responseBody,HttpStatus.FORBIDDEN);
        }
        log.info("Request reached controller ");
        responseBody = TranslateService.translator(body);
        log.info("Request is translated Response is " + HttpStatus.ACCEPTED);
        return new ResponseEntity<>(responseBody, HttpStatus.ACCEPTED);
    }
}
