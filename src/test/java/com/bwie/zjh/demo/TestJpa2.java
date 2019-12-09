package com.bwie.zjh.demo;

import com.bwie.zjh.mapper.TestQueryMapper;
import com.bwie.zjh.pojo.JpaUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestJpa2 {

    @Autowired
    private TestQueryMapper testdao;

    /**
     * 删除
     */
    @Test
    public void delete(){
        testdao.deleteById(2L);
        System.out.println("删除成功！");
    }
    /**
     * 添加
     */
    @Test
    public void saves(){
        JpaUser jpaUser = new JpaUser();
        jpaUser.setCreateDate(new Date());
        jpaUser.setDepId(2L);
        jpaUser.setPassword("123");
        jpaUser.setUserName("23432");
        JpaUser jpaUser1 = testdao.saveAndFlush(jpaUser);



        System.out.println(jpaUser1+"添加成功！");
    }
    /**
     * 修改
     */
    @Test
    public void update(){
        Optional<JpaUser> byId = testdao.findById(3L);
        JpaUser jpaUser = byId.get();
        jpaUser.setUserName("hhh");
        JpaUser jpaUser1 = testdao.saveAndFlush(jpaUser);
        System.out.println("修改成功！"+jpaUser1);
    }
    /**
     * 查询所有
     */
    @Test
    public void selects(){
        List<JpaUser> all = testdao.findAll();
        for (JpaUser jpaUser : all) {
            System.out.println(jpaUser);
        }
    }
    /**
     * 根据Id查询
     */
    @Test
    public void selectByid(){
        JpaUser jpaUser = testdao.findById(3L).get();
        System.out.println(jpaUser+"++++++++++++++");
    }
}
