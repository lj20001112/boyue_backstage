package com.boye.api.dao;

import com.boye.api.model.TimeLine;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @Author:阿捷
 * @date:2021/4/6 21:42
 */
@Repository
@Mapper
public interface TimeLineDAO{
    List<TimeLine> listAll();
}
