package com.mvcc.control;

import com.alibaba.fastjson.JSONObject;
import com.mvcc.vo.Power;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PowerControl {
    //
    @Autowired
    Power pa;

    @RequestMapping(value = "/power",method = RequestMethod.GET)
    @ResponseBody
    public String get(@RequestParam(value="areaid") String areaid){
        System.out.println("areaid"+areaid);
        JSONObject json = new JSONObject();
        json.put("01:00","0.66");
        json.put("02:00","0.61");
        json.put("03:00","0.52");
        json.put("04:00","0.33");
        json.put("05:00","0.41");
        json.put("06:00","0.63");
        json.put("07:00","0.43");
        json.put("08:00","0.73");
        json.put("09:00","0.81");
        return json.toJSONString();
    }
}
