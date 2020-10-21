package com.qt.vip.vo;

import com.qt.vip.feign.dto.Balance;
import lombok.Data;

/**
 * description: 演示
 * date: 2020/10/21
 * @author wuyanzu
 */
@Data
public class User {

    private int id;
    private String name;
    private Balance balance;

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }


}
