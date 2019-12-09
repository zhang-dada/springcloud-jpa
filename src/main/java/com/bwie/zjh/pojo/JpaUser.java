package com.bwie.zjh.pojo;

import lombok.Data;
import org.hibernate.exception.DataException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "jpa_user")
@Data
public class JpaUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")

    private String password;

    @Column(name = "createDate")
    private Date createDate;

    @Column(name = "dep_id")
    private Long depId;
}
