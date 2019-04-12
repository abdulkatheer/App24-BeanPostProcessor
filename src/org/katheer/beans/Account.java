package org.katheer.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Account implements InitializingBean, DisposableBean {
    private String name;
    private String accNo;
    private String accType;
    private String branch;
    private String email;
    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        System.out.println("Setting accType via setter method...");
        this.accType = accType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void customInit() {
        System.out.println("customInit() method...");
    }

    public void customDestroy() {
        System.out.println("customDestroy() method...");
    }

    @PostConstruct
    public void annotationInit() {
        System.out.println("annotationInit() mathod...");
    }

    @PreDestroy
    public void annotationDestroy() {
        System.out.println("annotationDestroy() method...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Interface destroy() method...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Interface afterPropertiesSet() method...");
    }

    public void getAccountDetails() {
        System.out.println(String.format("%-10s: %s\n%-10s: %s\n%-10s: %s\n" +
                "%-10s: %s\n%-10s: %s\n%-10s: %s\n",
                "Acc No", this.getAccNo(), "Name", this.getName(),
                "Acc Type", this.getAccType(), "Branch", this.getBranch(),
                "Email", this.getEmail(), "Mobile", this.getMobile()));
    }
}