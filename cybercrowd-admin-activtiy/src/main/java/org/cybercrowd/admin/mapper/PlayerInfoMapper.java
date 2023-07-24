package org.cybercrowd.admin.mapper;

import java.util.List;
import org.cybercrowd.admin.domain.PlayerInfo;

/**
 * 游戏者信息Mapper接口
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
public interface PlayerInfoMapper 
{
    /**
     * 查询游戏者信息
     * 
     * @param id 游戏者信息主键
     * @return 游戏者信息
     */
    public PlayerInfo selectPlayerInfoById(Long id);

    /**
     * 查询游戏者信息列表
     * 
     * @param playerInfo 游戏者信息
     * @return 游戏者信息集合
     */
    public List<PlayerInfo> selectPlayerInfoList(PlayerInfo playerInfo);

    /**
     * 新增游戏者信息
     * 
     * @param playerInfo 游戏者信息
     * @return 结果
     */
    public int insertPlayerInfo(PlayerInfo playerInfo);

    /**
     * 修改游戏者信息
     * 
     * @param playerInfo 游戏者信息
     * @return 结果
     */
    public int updatePlayerInfo(PlayerInfo playerInfo);

    /**
     * 删除游戏者信息
     * 
     * @param id 游戏者信息主键
     * @return 结果
     */
    public int deletePlayerInfoById(Long id);

    /**
     * 批量删除游戏者信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePlayerInfoByIds(Long[] ids);


    PlayerInfo selectOnePlayer(PlayerInfo playerInfo);

    /**
     * 查询指定回合号下游戏玩家信息
     * @param roundNo
     * @param playerAddress
     * @return
     */
    PlayerInfo selectPlayer(String roundNo,String playerAddress);

    /**
     * 本轮邀请者列表
     *
     * @param roundNo
     * @return
     */
    List<String> selectInviterList(String roundNo);


    /**
     * 查询游戏中的玩家
     * @param roundNo
     * @param playerAddress
     * @return
     */
    PlayerInfo selectInGamePlayer(String roundNo,String playerAddress);

    /**
     * 更新玩家游戏结束状态
     * @param roundNo
     * @param gameStatus
     * @return
     */
    int updatePlayerGameOver(String roundNo,String gameStatus);
}
