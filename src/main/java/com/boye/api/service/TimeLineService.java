package com.boye.api.service;

import com.boye.api.model.TimeLine;

import java.util.List;

/**
 * @Author:阿捷
 * @date:2021/4/6 21:49
 */
public interface TimeLineService {

    /**
     * 时间线
     * @return
     */
    List<TimeLine> listAll();
}
