package com.gjw.seckill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author guojinwu
 * @since 2022-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    private Long id;

    private String nickname;

    /**
     * MD5
     */
    private Integer password;

    private String slat;

    private String head;

    private Date registerDate;

    private Date lastLoginDate;

    private Integer loginCoun6;


}
