package org.katheer.test;

import org.katheer.beans.Account;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Order of execution
        1. Initializing values through property tag (i.e. setXXX() methods);
        2. postProcessBeforeInitialization() method of BeanPostProcessor
        3. InitializingBean's afterPropertiesSet() method
        4. customInit() method
        5. postProcessAfterInitialization() method
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext
                ("org/katheer/resources/applicationContext.xml");
        Account acc1 = (Account) context.getBean("acc1");
        Account acc2 = (Account) context.getBean("acc2");

        acc1.getAccountDetails();
        acc2.getAccountDetails();

        context.registerShutdownHook();
    }
}
