package com.qt.share.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @description:
 * @author:
 * @date: 2020/10/27
 */
@Data
public class PushAppMessage implements Serializable {

    private String title;

    private String body;

    private Long pushTime;

    private String link;

    private ArrayList<PushAppUserItem> pushUserList;

    private String pushCommunityCodeList;

    private String pushApartmentCodeList;

    public PushAppMessage(){

    }


}
