package com.futurelight;

import com.futurelight.mapper.ContactMapper;
import com.futurelight.starter.Starter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class MapperTest {
    @Autowired
    private ContactMapper contactMapper;

    @Test
    public void query(){
        Integer a =222;
        Integer b =222;
        if (a.equals(b)){
            System.out.println("对");
        }
        System.out.println("1111");

//        System.out.println(contactMapper.query());
    }
}
