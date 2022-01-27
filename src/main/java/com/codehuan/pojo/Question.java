package com.codehuan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@Getter
@Setter
@TableName("t_question")
@ApiModel(value = "Question对象", description = "")
public class Question implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("发起人")
    @TableField("userid")
    private Integer userid;

    @ApiModelProperty("内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("创建日期")
    @TableField("created_time")
    private LocalDateTime createdTime;

    @ApiModelProperty("完成日期")
    @TableField("finish_time")
    private LocalDateTime finishTime;

    @ApiModelProperty("是否解决 1已解决 0未解决 2进行中")
    @TableField("status")
    private String status;

    @ApiModelProperty("分类id")
    @TableField("tagid")
    private Integer tagid;


}
