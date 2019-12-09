package com.bwie.zjh.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "test_yyyy")
public class TestEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "creeateTime")
    private Date createTime;
}
