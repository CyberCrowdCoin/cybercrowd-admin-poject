package org.cybercrowd.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.cybercrowd.admin.common.annotation.Excel;
import org.cybercrowd.admin.common.core.domain.BaseEntity;

/**
 * dapps_banner信息对象 dapps_banner
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
public class DappsBanner extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** banner介绍 */
    @Excel(name = "banner介绍")
    private String bannerIntro;

    /** banner图片地址 */
    @Excel(name = "banner图片地址")
    private String bannerImageUrl;

    /** 跳转地址 */
    @Excel(name = "跳转地址")
    private String jumpUrl;

    /** banner 状态 0 已下架 1 已上架 */
    @Excel(name = "banner 状态 0 已下架 1 已上架")
    private String bannerStatus;

    /** banner 过期下架时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "banner 过期下架时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expireTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String extend;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String extend2;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setBannerIntro(String bannerIntro) 
    {
        this.bannerIntro = bannerIntro;
    }

    public String getBannerIntro() 
    {
        return bannerIntro;
    }
    public void setBannerImageUrl(String bannerImageUrl) 
    {
        this.bannerImageUrl = bannerImageUrl;
    }

    public String getBannerImageUrl() 
    {
        return bannerImageUrl;
    }
    public void setJumpUrl(String jumpUrl) 
    {
        this.jumpUrl = jumpUrl;
    }

    public String getJumpUrl() 
    {
        return jumpUrl;
    }
    public void setBannerStatus(String bannerStatus) 
    {
        this.bannerStatus = bannerStatus;
    }

    public String getBannerStatus() 
    {
        return bannerStatus;
    }
    public void setExpireTime(Date expireTime) 
    {
        this.expireTime = expireTime;
    }

    public Date getExpireTime() 
    {
        return expireTime;
    }
    public void setExtend(String extend) 
    {
        this.extend = extend;
    }

    public String getExtend() 
    {
        return extend;
    }
    public void setExtend2(String extend2) 
    {
        this.extend2 = extend2;
    }

    public String getExtend2() 
    {
        return extend2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("bannerIntro", getBannerIntro())
            .append("bannerImageUrl", getBannerImageUrl())
            .append("jumpUrl", getJumpUrl())
            .append("bannerStatus", getBannerStatus())
            .append("expireTime", getExpireTime())
            .append("extend", getExtend())
            .append("extend2", getExtend2())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
