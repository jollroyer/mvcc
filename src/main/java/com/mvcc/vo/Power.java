package com.mvcc.vo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Power {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

}
