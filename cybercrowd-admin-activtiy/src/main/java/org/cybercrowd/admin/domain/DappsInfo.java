package org.cybercrowd.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.cybercrowd.admin.common.annotation.Excel;
import org.cybercrowd.admin.common.core.domain.BaseEntity;

/**
 * Dapp信息对象 dapps_info
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
public class DappsInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 应用类型 */
    @Excel(name = "应用类型")
    private String dappType;

    /** 应用名称 */
    @Excel(name = "应用名称")
    private String dappName;

    /** 应用logo */
    @Excel(name = "应用logo")
    private String dappLogo;

    /** 背景图片 */
    @Excel(name = "背景图片")
    private String dappBgImage;

    /** 应用简介 */
    @Excel(name = "应用简介")
    private String dappIntro;

    /** 应用详细介绍 */
    @Excel(name = "应用详细介绍")
    private String dappDetailsIntro;

    /** 应用链接 */
    @Excel(name = "应用链接")
    private String dappLink;

    /** 应用官网 */
    @Excel(name = "应用官网")
    private String dappOfficialWebsite;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dappTwitter;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dappDiscrod;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String dappTelegram;

    /** 应用热度 */
    @Excel(name = "应用热度")
    private Long dappHot;

    /** 应用热度状态 0 非热门应用 1 热门应用 */
    @Excel(name = "应用热度状态 0 非热门应用 1 热门应用")
    private String dappHotStatus;

    /** 应用状态  1 已上线 2 待下线 3 已下线 */
    @Excel(name = "应用状态  1 已上线 2 待下线 3 已下线")
    private String dappStatus;

    /** dapp下线时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "dapp下线时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dappOfflineTime;

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
    public void setDappType(String dappType)
    {
        this.dappType = dappType;
    }

    public String getDappType()
    {
        return dappType;
    }
    public void setDappName(String dappName)
    {
        this.dappName = dappName;
    }

    public String getDappName()
    {
        return dappName;
    }
    public void setDappLogo(String dappLogo)
    {
        this.dappLogo = dappLogo;
    }

    public String getDappLogo()
    {
        return dappLogo;
    }
    public void setDappBgImage(String dappBgImage)
    {
        this.dappBgImage = dappBgImage;
    }

    public String getDappBgImage()
    {
        return dappBgImage;
    }
    public void setDappIntro(String dappIntro)
    {
        this.dappIntro = dappIntro;
    }

    public String getDappIntro()
    {
        return dappIntro;
    }
    public void setDappDetailsIntro(String dappDetailsIntro)
    {
        this.dappDetailsIntro = dappDetailsIntro;
    }

    public String getDappDetailsIntro()
    {
        return dappDetailsIntro;
    }
    public void setDappLink(String dappLink)
    {
        this.dappLink = dappLink;
    }

    public String getDappLink()
    {
        return dappLink;
    }
    public void setDappOfficialWebsite(String dappOfficialWebsite)
    {
        this.dappOfficialWebsite = dappOfficialWebsite;
    }

    public String getDappOfficialWebsite()
    {
        return dappOfficialWebsite;
    }
    public void setDappTwitter(String dappTwitter)
    {
        this.dappTwitter = dappTwitter;
    }

    public String getDappTwitter()
    {
        return dappTwitter;
    }
    public void setDappDiscrod(String dappDiscrod)
    {
        this.dappDiscrod = dappDiscrod;
    }

    public String getDappDiscrod()
    {
        return dappDiscrod;
    }
    public void setDappTelegram(String dappTelegram)
    {
        this.dappTelegram = dappTelegram;
    }

    public String getDappTelegram()
    {
        return dappTelegram;
    }
    public void setDappHot(Long dappHot)
    {
        this.dappHot = dappHot;
    }

    public Long getDappHot()
    {
        return dappHot;
    }
    public void setDappHotStatus(String dappHotStatus)
    {
        this.dappHotStatus = dappHotStatus;
    }

    public String getDappHotStatus()
    {
        return dappHotStatus;
    }
    public void setDappStatus(String dappStatus)
    {
        this.dappStatus = dappStatus;
    }

    public String getDappStatus()
    {
        return dappStatus;
    }
    public void setDappOfflineTime(Date dappOfflineTime)
    {
        this.dappOfflineTime = dappOfflineTime;
    }

    public Date getDappOfflineTime()
    {
        return dappOfflineTime;
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
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("dappType", getDappType())
                .append("dappName", getDappName())
                .append("dappLogo", getDappLogo())
                .append("dappBgImage", getDappBgImage())
                .append("dappIntro", getDappIntro())
                .append("dappDetailsIntro", getDappDetailsIntro())
                .append("dappLink", getDappLink())
                .append("dappOfficialWebsite", getDappOfficialWebsite())
                .append("dappTwitter", getDappTwitter())
                .append("dappDiscrod", getDappDiscrod())
                .append("dappTelegram", getDappTelegram())
                .append("dappHot", getDappHot())
                .append("dappHotStatus", getDappHotStatus())
                .append("dappStatus", getDappStatus())
                .append("dappOfflineTime", getDappOfflineTime())
                .append("extend", getExtend())
                .append("extend2", getExtend2())
                .append("createTime", getCreateTime())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
