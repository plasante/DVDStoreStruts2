package com.uniksoft.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private String name;
    
    public String execute() throws Exception {
        System.out.println("Inside HelloWorldAction");
        if ("SECRET".equals(name)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
