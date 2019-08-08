package com.mvcc.test;

import com.mvcc.vo.Power;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:/WEB-INF/dispatcher-servlet.xml"})
public class TestMain {

    //@Autowired
    //Power pa;

    @Test
    public void runMain(){
        //System.out.println(pa.getType()+ "============================>");
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:test.xml");
        //Power po = (Power) context.getBean("paa");
        Power po2=context.getBean(Power.class);

        System.out.println(po2.getType());
    }

}
