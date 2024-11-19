package com.yzg.demo.service;

import com.yzg.demo.model.entitiy.Crontable;
import org.springframework.stereotype.Service;

@Service
public class CrontableImpl {

    Crontable cron=new Crontable(1,"0/55 * * * * ?");
    public String getCronInfo(){
        return cron.getInfo();
    }
}
