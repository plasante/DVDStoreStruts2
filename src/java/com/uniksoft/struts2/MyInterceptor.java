package com.uniksoft.struts2;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        
        String output = "Pre-Processing";
        System.out.println(output);
        
        String result = invocation.invoke();
        
        output = "Post-Processing";
        System.out.println(output);
        
        return result;
    }
}
