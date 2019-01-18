package com.tianyalei.windowwechat;

import com.tianyalei.windowwechat.model.MessageEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2019/1/18.
 */
@Service
public class WechatService {
    @Resource
    private MessageRepository messageRepository;

    public MessageEntity add(Wechat wechat) {
        MessageEntity messageEntity = new MessageEntity();
        BeanUtils.copyProperties(wechat, messageEntity);;
        messageEntity.setContent(wechat.getMsg());

        return messageRepository.save(messageEntity);

    }

}
