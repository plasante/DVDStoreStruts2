package com.uniksoft.struts2;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import java.util.HashMap;
import java.util.Map;

public class HelloWorldOGNLAction extends ActionSupport {
    private String name;
    
    @Override
    public String execute() throws Exception {
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> context = new HashMap<String, Object>();
        
        context.put("key1", new String("This is key1"));
        context.put("key2", new String("This is key2"));
        stack.push(context);
        
        System.out.println("Size of valueStack: " + stack.size());
        return "success";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
