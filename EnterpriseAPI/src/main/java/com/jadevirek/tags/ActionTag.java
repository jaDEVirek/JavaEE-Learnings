package com.jadevirek.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class ActionTag extends SimpleTagSupport {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.print(message);
    }
}
