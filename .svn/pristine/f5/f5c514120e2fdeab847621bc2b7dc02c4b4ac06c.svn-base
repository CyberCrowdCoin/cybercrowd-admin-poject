package org.cybercrowd.admin.service;

import java.util.List;
import org.cybercrowd.admin.domain.PlayerInfo;
import org.cybercrowd.admin.response.SyncPlayersRes;
import org.cybercrowd.admin.common.response.BaseResponse;

/**
 * 游戏者信息Service接口
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
public interface IPlayerInfoService 
{
    /**
     * 查询游戏者信息
     * 
     * @param id 游戏者信息主键
     * @return 游戏者信息
     */
    PlayerInfo selectPlayerInfoById(Long id);

    /**
     * 查询游戏者信息列表
     * 
     * @param playerInfo 游戏者信息
     * @return 游戏者信息集合
     */
    List<PlayerInfo> selectPlayerInfoList(PlayerInfo playerInfo);

    /**
     * 新增游戏者信息
     * 
     * @param playerInfo 游戏者信息
     * @return 结果
     */
    int insertPlayerInfo(PlayerInfo playerInfo);

    /**
     * 修改游戏者信息
     * 
     * @param playerInfo 游戏者信息
     * @return 结果
     */
    int updatePlayerInfo(PlayerInfo playerInfo);

    /**
     * 批量删除游戏者信息
     * 
     * @param ids 需要删除的游戏者信息主键集合
     * @return 结果
     */
    int deletePlayerInfoByIds(Long[] ids);

    /**
     * 删除游戏者信息信息
     * 
     * @param id 游戏者信息主键
     * @return 结果
     */
    int deletePlayerInfoById(Long id);

    /**
     * 同步游戏参与者
     * @return
     */
    SyncPlayersRes syncPlayer();

    /**
     * 同步游戏获胜者信息
     * @return
     */
    BaseResponse syncPlayerWinning();


    /**
     * 同步游戏参与者V2
     * @return
     */
    BaseResponse syncPlayerV2();

    /**
     * 同步游戏获胜者信息V2
     * @return
     */
    BaseResponse syncPlayerWinningV2();

}
