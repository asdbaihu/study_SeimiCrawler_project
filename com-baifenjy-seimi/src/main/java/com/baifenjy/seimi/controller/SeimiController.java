package com.baifenjy.seimi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import cn.wanghaomiao.seimi.core.Seimi;


@RequestMapping(value="/order",method=RequestMethod.GET)
@RestController
@SuppressWarnings("deprecation")
public class SeimiController
{
    @GetMapping("/query")
    public void queryByOrderId(@RequestParam(value = "crawlerNames",required = true)String crawlerNames){
        Seimi seimi = new Seimi();
        seimi.start(crawlerNames);
    }
}
