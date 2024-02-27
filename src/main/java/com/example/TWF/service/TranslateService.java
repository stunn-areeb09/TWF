package com.example.TWF.service;

import com.example.TWF.dto.RequestBody;
import com.example.TWF.dto.ResponseBody;
import net.suuft.libretranslate.Language;
import net.suuft.libretranslate.Translator;

public class TranslateService {
    public static ResponseBody translator(RequestBody body){
        ResponseBody responseBody=new ResponseBody();
        
        String translatedtext = Translator.translate(Language.ENGLISH, Language.FRENCH, body.getText());
        responseBody.setTranslatation(translatedtext);
        return responseBody;
    }
}
