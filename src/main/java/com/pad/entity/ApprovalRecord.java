package com.pad.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 审批记录表
 * </p>
 *
 * @author F4
 * @since 2022-09-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ApprovalRecord对象", description="审批记录表")
public class ApprovalRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "审批记录编号")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "贷款信息编号")
    private String lId;

    @ApiModelProperty(value = "审核人物（银行或平台）")
    private String character;

    @ApiModelProperty(value = "审批状态 0未审核，1审核通过，-1审核失败")
    private Integer status;

    @ApiModelProperty(value = "审批说明    通过不通过都写原因")
    private String message;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;


}
