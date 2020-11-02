package com.qt.share.controller;

import com.qt.share.dto.Bulletin;
import com.qt.share.dto.PushAppMessage;
import com.qt.share.dto.PushAppUserItem;
import com.qt.share.service.MQ;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: mal
 * @date: 2020/10/29
 */
@RestController
public class Api {

    @Resource
    private MQ mq;

    @GetMapping("/mq")
    public void Mq() {
        System.out.println("mq");
        ArrayList<PushAppUserItem> list = new ArrayList<>();
        PushAppUserItem pushAppUserItem = new PushAppUserItem();
        pushAppUserItem.setPhone("15659838724");
        list.add(pushAppUserItem);
        PushAppMessage body = new PushAppMessage();
        body.setTitle("小马哥推送");
        body.setBody("小马哥推送商品-敬请关注");
        body.setLink("http://test.sunshine-h5.quesoar.com/#/home?commodityId=139");
        body.setPushTime(System.currentTimeMillis());
        body.setPushUserList(list);
        ArrayList<PushAppMessage> pushAppMessages = new ArrayList<>();
        pushAppMessages.add(body);
        Bulletin bulletin = new Bulletin(pushAppMessages);
        mq.send(bulletin);
        System.out.println("mq--");

    }

}
