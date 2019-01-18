package com.tianyalei.windowwechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/11/12.
 */
@RestController
@RequestMapping("wechat")
public class WechatController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Resource
    private WechatService wechatService;

    @RequestMapping("")
    public void wechat(@RequestBody Wechat wechat) {
        logger.info(wechat.toString());
        wechatService.add(wechat);
    }
}

