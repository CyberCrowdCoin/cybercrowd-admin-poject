package org.cybercrowd.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.cybercrowd.admin.common.annotation.Excel;
import org.cybercrowd.admin.common.core.domain.BaseEntity;

/**
 * 游戏时间控制对象 game_time_control
 * 
 * @author gengchaonan
 * @date 2023-04-26
 */
public class GameTimeControl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "", width = 30, dateFormat = "yyyy-MM-dd")
    private Date gameStartTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long timeInterval;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGameStartTime(Date gameStartTime) 
    {
        this.gameStartTime = gameStartTime;
    }

    public Date getGameStartTime() 
    {
        return gameStartTime;
    }
    public void setTimeInterval(Long timeInterval) 
    {
        this.timeInterval = timeInterval;
    }

    public Long getTimeInterval() 
    {
        return timeInterval;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gameStartTime", getGameStartTime())
            .append("timeInterval", getTimeInterval())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
