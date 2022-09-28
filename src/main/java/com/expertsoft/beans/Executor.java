package com.expertsoft.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Executor {
    private String target;

    public Executor() {

    }

    public String execute() {
        /*target = new StringBuilder(target)
                .reverse()
                .toString();*/
        target = target.split("\\s").length + " words";
        return "result";
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
