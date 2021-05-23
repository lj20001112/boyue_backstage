package com.boye.api.controller;

import com.boye.api.common.R;
import com.boye.api.service.TimeLineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:阿捷
 * @date:2021/4/6 21:51
 */
@Controller
@RequestMapping("/timeline")
public class TimeLineController {

    @Autowired
    private TimeLineService timeLineService;


    @GetMapping("/getLine")
    @ResponseBody
    public R getLine(){
        return R.ok().data(timeLineService.listAll());
    }

}


