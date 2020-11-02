package com.qt.share.dto;

import com.qt.share.service.MD5Utils;
import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @description:
 * @author:
 * @date: 2020/10/27
 */
@Data
public class Bulletin implements Serializable {

    private UUID id;

    private Integer crud;

    private String source;

    private String target;

    private String objectName;

    private ArrayList<PushAppMessage> body;

    private String appId;

    private Long time;

    private String sign;

    public Bulletin(ArrayList<PushAppMessage> body){
        this.body = body;
        this.id = UUID.randomUUID();
        this.crud = 0;
        this.source = "third";
        this.target = "saas";
        this.objectName = "PushAppMessage";
        this.appId = "10000002";
        this.time = System.currentTimeMillis();
        try {
            this.sign = MD5Utils.md5Bit32Upper(appId + "20634c36f532007f21547c6bdf7493149aeb1008" + time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
