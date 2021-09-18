package com.ou.swzl.entity.dto;

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
@ApiModel
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserDTO {


    private Integer userId;

    private String userName;

    private String userPassword;

    private String userMobile;

    public User toUserPO() {
        User user = new User();
        user.setUserId(this.userId);
        user.setUserName(this.userName);
        user.setUserPassword(this.userPassword);
        user.setUserMobile(this.userMobile);
        return user;
    }


}
