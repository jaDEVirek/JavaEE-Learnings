package com.jadevirek.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class JspTag extends TagSupport {

    private String time = "5000";

    @Override public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();
        try {
            out.print("<div id=\"inner\">\n" + " <p id=\"pin\">\n> </p>" +
                    "    </div>");
            out.print(
                    "<script>document.getElementById(\"inner\").addEventListener(\"load\", setIntervalAction(" + time + "));</script>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (EVAL_BODY_INCLUDE);
    }
}
