package com.qt.share.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: mal
 * @date: 2020/10/27
 */
@Data
public class PushAppUserItem implements Serializable {

    private String phone;

    private String communityCode;

    private Long apartmentCode;


}
