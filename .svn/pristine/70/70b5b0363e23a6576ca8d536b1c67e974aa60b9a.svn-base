package org.cybercrowd.admin.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.cybercrowd.admin.common.annotation.Excel;
import org.cybercrowd.admin.common.core.domain.BaseEntity;

/**
 * 游戏者信息对象 player_info
 * 
 * @author Gengchaonan
 * @date 2023-03-10
 */
public class PlayerInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 游戏回合编号, 0000001 */
    @Excel(name = "游戏回合编号, 0000001")
    private String roundNo;

    /** 玩家索引 */
    @Excel(name = "玩家索引")
    private Long playerIndex;

    /** 游戏者地址 */
    @Excel(name = "游戏者地址")
    private String playerAddress;

    /** 邀请码 */
    @Excel(name = "邀请码")
    private String inviteCode;

    /** 被邀请码,绑定邀请关系 */
    @Excel(name = "被邀请码,绑定邀请关系")
    private String inviteCodeBy;

    /** 邀请玩家 */
    @Excel(name = "邀请玩家")
    private String invitePlayer;

    /** 付款金额 */
    @Excel(name = "付款金额")
    private Long payAmount;

    /** 奖励Token数量 */
    @Excel(name = "奖励Token数量")
    private BigDecimal bonusToken;

    /** 奖金金额 */
    @Excel(name = "奖金金额")
    private Long bonusAmount;

    /** 奖金 */
    @Excel(name = "奖金")
    private BigDecimal bonus;

    /** 获奖状态, 0 未中奖 1 中奖 */
    @Excel(name = "获奖状态, 0 未中奖 1 中奖")
    private String winningStatus;

    /** 游戏状态, 0 未参与 1 参与中 2 已结束 */
    @Excel(name = "游戏状态, 0 未参与 1 参与中 2 已结束")
    private String gameStatus;

    /** 开奖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开奖时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lotteryTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRoundNo(String roundNo) 
    {
        this.roundNo = roundNo;
    }

    public String getRoundNo() 
    {
        return roundNo;
    }
    public void setPlayerIndex(Long playerIndex) 
    {
        this.playerIndex = playerIndex;
    }

    public Long getPlayerIndex() 
    {
        return playerIndex;
    }
    public void setPlayerAddress(String playerAddress) 
    {
        this.playerAddress = playerAddress;
    }

    public String getPlayerAddress() 
    {
        return playerAddress;
    }
    public void setInviteCode(String inviteCode) 
    {
        this.inviteCode = inviteCode;
    }

    public String getInviteCode() 
    {
        return inviteCode;
    }
    public void setInviteCodeBy(String inviteCodeBy) 
    {
        this.inviteCodeBy = inviteCodeBy;
    }

    public String getInviteCodeBy() 
    {
        return inviteCodeBy;
    }
    public void setInvitePlayer(String invitePlayer) 
    {
        this.invitePlayer = invitePlayer;
    }

    public String getInvitePlayer() 
    {
        return invitePlayer;
    }
    public void setPayAmount(Long payAmount)
    {
        this.payAmount = payAmount;
    }

    public Long getPayAmount()
    {
        return payAmount;
    }
    public void setBonusToken(BigDecimal bonusToken) 
    {
        this.bonusToken = bonusToken;
    }

    public BigDecimal getBonusToken() 
    {
        return bonusToken;
    }
    public void setBonusAmount(Long bonusAmount) 
    {
        this.bonusAmount = bonusAmount;
    }

    public Long getBonusAmount() 
    {
        return bonusAmount;
    }
    public void setBonus(BigDecimal bonus) 
    {
        this.bonus = bonus;
    }

    public BigDecimal getBonus() 
    {
        return bonus;
    }
    public void setWinningStatus(String winningStatus) 
    {
        this.winningStatus = winningStatus;
    }

    public String getWinningStatus() 
    {
        return winningStatus;
    }
    public void setGameStatus(String gameStatus) 
    {
        this.gameStatus = gameStatus;
    }

    public String getGameStatus() 
    {
        return gameStatus;
    }
    public void setLotteryTime(Date lotteryTime) 
    {
        this.lotteryTime = lotteryTime;
    }

    public Date getLotteryTime() 
    {
        return lotteryTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("roundNo", getRoundNo())
            .append("playerIndex", getPlayerIndex())
            .append("playerAddress", getPlayerAddress())
            .append("inviteCode", getInviteCode())
            .append("inviteCodeBy", getInviteCodeBy())
            .append("invitePlayer", getInvitePlayer())
            .append("payAmount", getPayAmount())
            .append("bonusToken", getBonusToken())
            .append("bonusAmount", getBonusAmount())
            .append("bonus", getBonus())
            .append("winningStatus", getWinningStatus())
            .append("gameStatus", getGameStatus())
            .append("lotteryTime", getLotteryTime())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
