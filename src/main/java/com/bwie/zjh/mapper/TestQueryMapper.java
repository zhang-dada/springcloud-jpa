package com.bwie.zjh.mapper;

import com.bwie.zjh.pojo.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

public interface TestQueryMapper extends JpaRepository<JpaUser,Long> {
    /**
     * 删除  query  语句删除
     * @param id
     */
    @Query(value = "delete from jpa_user where id=?1",nativeQuery = true)
    @Modifying
    @Transactional
    public void deleteUserByUserId(Long id);




}
