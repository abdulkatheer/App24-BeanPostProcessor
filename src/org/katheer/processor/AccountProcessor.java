package org.katheer.processor;

import org.katheer.beans.Account;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class AccountProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization() method...");
        Account account = (Account) bean;
        if(account.getAccType() == null) {
            account.setAccType("Savings");
        }
        return account;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization() method...");
        Account account = (Account) bean;

        if(!account.getMobile().startsWith("91-")) {
            account.setMobile("91-" + account.getMobile());
        }

        if(!account.getEmail().contains("@")) {
            account.setEmail(account.getEmail() + "@gmail.com");
        }
        return account;
    }
}
