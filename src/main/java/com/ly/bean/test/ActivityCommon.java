package com.ly.bean.test;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 活动的基础表
 * </p>
 *
 * @author xjb
 * @since 2019-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ActivityCommon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "acid", type = IdType.AUTO)
    private Long acid;

    /**
     * 活动编号
     */
    private String activityNumber;

    /**
     * 标题
     */
    private String activityTitle;

    /**
     * 类型:0活动，1应用
     */
    private Integer activityType;

    /**
     * 平台:0微信H5/1 小程序/2 app
     */
    private String activityPlat;

    /**
     * 5分销/6船票
     */
    private Integer activityModel;

    /**
     * 标签
     */
    private String activityTag;

    /**
     * code
     */
    private String activityCode;

    /**
     * 图文详情
     */
    private String activityDetail;

    /**
     * 活动摘要
     */
    private String shareDetail;

    /**
     * 缩略图
     */
    private String thumbnail;

    /**
     * 模板风格
     */
    @TableField("templateStyle")
    private String templateStyle;

    /**
     * 营销权益
     */
    private String marketRights;

    /**
     * 业务线编号
     */
    private String businessNumber;

    /**
     * 发布状态:0未上架;1已上架;-1已下架
     */
    private Integer releaseStatus;

    /**
     * 商品编号
     */
    private String goodsNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 行状态：0正常1删除
     */
    private Integer rowstatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    private String updateBy;


}
