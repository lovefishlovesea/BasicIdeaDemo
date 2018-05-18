package com.Basic.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanzhaoyang on 17/5/12.
 */
@Component
@ConfigurationProperties(prefix="company")
public class EmploysSetting {
    private List<String> employs=new ArrayList<String>();

    @Override
    public String toString() {
        return "EmploysSetting{" +
                "employs=" + employs +
                '}';
    }

    public List<String> getEmploys() {
        return employs;
    }

    public void setEmploys(List<String> employs) {
        this.employs = employs;
    }
}
