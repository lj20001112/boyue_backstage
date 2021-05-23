package com.boye.api.service.impl;

import com.boye.api.dao.TimeLineDAO;
import com.boye.api.model.TimeLine;
import com.boye.api.service.TimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:阿捷
 * @date:2021/4/6 21:49
 */
@Service
public class TimeLineServiceImpl implements TimeLineService {
    @Autowired
    private TimeLineDAO timeLineDAO;

    /**
     * 时间线
     * @return
     */
    @Override
    public List<TimeLine> listAll() {
        return timeLineDAO.listAll();
    }
}
