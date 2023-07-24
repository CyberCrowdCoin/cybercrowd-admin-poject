package org.cybercrowd.admin.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.cybercrowd.admin.common.annotation.Excel;
import org.cybercrowd.admin.common.core.domain.BaseEntity;

/**
 * 玩家游戏控制对象 player_game_control
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
public class PlayerGameControl extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 最新游戏回合号 */
    @Excel(name = "最新游戏回合号")
    private String latestRoundNo;

    /** 游戏上一回合编号 */
    @Excel(name = "游戏上一回合编号")
    private String previousRoundNo;

    /** 游戏状态，已开始 0  开奖中 1 已开奖 2 */
    @Excel(name = "游戏状态，已开始 0  开奖中 1 已开奖 2")
    private String gameStatus;

    /** 下一次游戏开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "下一次游戏开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nextGameTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLatestRoundNo(String latestRoundNo) 
    {
        this.latestRoundNo = latestRoundNo;
    }

    public String getLatestRoundNo() 
    {
        return latestRoundNo;
    }
    public void setPreviousRoundNo(String previousRoundNo) 
    {
        this.previousRoundNo = previousRoundNo;
    }

    public String getPreviousRoundNo() 
    {
        return previousRoundNo;
    }
    public void setGameStatus(String gameStatus) 
    {
        this.gameStatus = gameStatus;
    }

    public String getGameStatus() 
    {
        return gameStatus;
    }
    public void setNextGameTime(Date nextGameTime) 
    {
        this.nextGameTime = nextGameTime;
    }

    public Date getNextGameTime() 
    {
        return nextGameTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("latestRoundNo", getLatestRoundNo())
            .append("previousRoundNo", getPreviousRoundNo())
            .append("gameStatus", getGameStatus())
            .append("nextGameTime", getNextGameTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
