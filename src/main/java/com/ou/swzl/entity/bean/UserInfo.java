package com.ou.swzl.entity.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ou.swzl.entity.po.User;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leo
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserInfo {

    private Integer userId;

    private String userName;

    private String userPassword;

    private String userMobile;

    public UserInfo parseFromPO(User po) {
        userId = po.getUserId();
        userName = po.getUserName();
        userPassword = po.getUserPassword();
        userMobile = po.getUserMobile();
        return this;
    }
}
