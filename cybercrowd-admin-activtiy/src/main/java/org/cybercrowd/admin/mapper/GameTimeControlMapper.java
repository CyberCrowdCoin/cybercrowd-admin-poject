package org.cybercrowd.admin.mapper;

import java.util.List;
import org.cybercrowd.admin.domain.GameTimeControl;

/**
 * 游戏时间控制Mapper接口
 * 
 * @author gengchaonan
 * @date 2023-04-26
 */
public interface GameTimeControlMapper 
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
     * 删除游戏时间控制
     * 
     * @param id 游戏时间控制主键
     * @return 结果
     */
    public int deleteGameTimeControlById(Long id);

    /**
     * 批量删除游戏时间控制
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGameTimeControlByIds(Long[] ids);


    GameTimeControl latestGameTimeControl();
}
