package com.mvcc.control;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Record {

    @RequestMapping(value = "/record",method = RequestMethod.GET)
    @ResponseBody
    public String get(){
        JSONObject json = new JSONObject();
        json.put("max","1.55");

        return json.toJSONString();
    }
}
