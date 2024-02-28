package com.example.TWF.service;

import com.example.TWF.dto.RequestBody;
import com.example.TWF.dto.ResponseBody;
import lombok.extern.slf4j.Slf4j;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

@Slf4j
public class TranslateService {
    public static ResponseBody translator(RequestBody body){
        ResponseBody responseBody=new ResponseBody();
        
        String translatedtext = Translator.translate(Language.ENGLISH, Language.FRENCH, body.getText());
        responseBody.setTranslatation(translatedtext);
        log.info("Request is translated ");
        return responseBody;
    }
}
