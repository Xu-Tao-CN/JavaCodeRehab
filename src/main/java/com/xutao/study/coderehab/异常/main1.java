package com.xutao.study.coderehab.异常;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main1 {

    @GetMapping("/test-exception")
    public String ttets(){
        int stack = 0;
        if (stack <= 0){
            throw new selfDifineException("库存不足");
        }
        return "yes";
    }

}
