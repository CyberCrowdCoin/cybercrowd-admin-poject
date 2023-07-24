package org.cybercrowd.admin.mapper;

import java.util.List;
import org.cybercrowd.admin.domain.PlayerGameControl;

/**
 * 玩家游戏控制Mapper接口
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
public interface PlayerGameControlMapper {
    /**
     * 查询玩家游戏控制
     * 
     * @param id 玩家游戏控制主键
     * @return 玩家游戏控制
     */
    public PlayerGameControl selectPlayerGameControlById(Long id);

    /**
     * 查询玩家游戏控制列表
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 玩家游戏控制集合
     */
    public List<PlayerGameControl> selectPlayerGameControlList(PlayerGameControl playerGameControl);

    /**
     * 新增玩家游戏控制
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 结果
     */
    public int insertPlayerGameControl(PlayerGameControl playerGameControl);

    /**
     * 修改玩家游戏控制
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 结果
     */
    public int updatePlayerGameControl(PlayerGameControl playerGameControl);

    /**
     * 删除玩家游戏控制
     * 
     * @param id 玩家游戏控制主键
     * @return 结果
     */
    public int deletePlayerGameControlById(Long id);

    /**
     * 批量删除玩家游戏控制
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePlayerGameControlByIds(Long[] ids);

    /**
     * 查询最新游戏回合号
     * @return
     */
    String latestGameRoundNo();

    /**
     * 根据状态查询最新游戏回合号
     * @param playerGameStatus
     * @return
     */
    PlayerGameControl latestPlayerGameControl(String playerGameStatus);
}
