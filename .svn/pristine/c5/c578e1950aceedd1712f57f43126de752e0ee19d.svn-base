package org.cybercrowd.admin.service;

import java.util.List;
import org.cybercrowd.admin.domain.GameTimeControl;

/**
 * 游戏时间控制Service接口
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
public interface IGameTimeControlService 
{
    /**
     * 查询游戏时间控制
     * 
     * @param id 游戏时间控制主键
     * @return 游戏时间控制
     */
    public GameTimeControl selectGameTimeControlById(Long id);

    /**
     * 查询游戏时间控制列表
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 游戏时间控制集合
     */
    public List<GameTimeControl> selectGameTimeControlList(GameTimeControl gameTimeControl);

    /**
     * 新增游戏时间控制
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 结果
     */
    public int insertGameTimeControl(GameTimeControl gameTimeControl);

    /**
     * 修改游戏时间控制
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 结果
     */
    public int updateGameTimeControl(GameTimeControl gameTimeControl);

    /**
     * 批量删除游戏时间控制
     * 
     * @param ids 需要删除的游戏时间控制主键集合
     * @return 结果
     */
    public int deleteGameTimeControlByIds(Long[] ids);

    /**
     * 删除游戏时间控制信息
     * 
     * @param id 游戏时间控制主键
     * @return 结果
     */
    public int deleteGameTimeControlById(Long id);
}
