package com.cloud.service;

import org.junit.BeforeClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class BaseTest {

    static ClassPathXmlApplicationContext context = null;
    static MyServices services = null;

    @BeforeClass
    public static void setu() {
        try {

            context = new ClassPathXmlApplicationContext(new String[] { "classpath:service-test.xml" });
            context.start();
            services = context.getBean("services",MyServices.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




//    @AfterClass
//    public static void cleanU() {
//        try {
//            ctEduRsrcService.removeResource(resouceId);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        context.destroy();
//        context.close();
//    }

}
