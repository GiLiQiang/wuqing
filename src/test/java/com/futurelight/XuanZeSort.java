package com.futurelight;

import com.futurelight.starter.Starter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

//@RunWith(SpringRunner.class)
@SpringBootTest(classes = Starter.class)
public class XuanZeSort {
    @Test
    public void Sort(){
        int [] a = {5,6,2,8,9,7,3,1};
        for (int i=0;i<a.length-1;i++){
            int mind =i;
            for (int j=i+1;j<a.length;j++){
                if(a[mind]>a[j]){
                    mind=j;
                }
            }
            int temp = a[i];
            a[i]=a[mind];
            a[mind]=temp;
        }
        System.out.println(Arrays.toString(a));
    }


}
