package org.cybercrowd.admin.service.impl;

import java.util.List;

import org.cybercrowd.admin.common.annotation.DataSource;
import org.cybercrowd.admin.common.enums.DataSourceType;
import org.cybercrowd.admin.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.cybercrowd.admin.mapper.GameTimeControlMapper;
import org.cybercrowd.admin.domain.GameTimeControl;
import org.cybercrowd.admin.service.IGameTimeControlService;

/**
 * 游戏时间控制Service业务层处理
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class GameTimeControlServiceImpl implements IGameTimeControlService 
{
    @Autowired
    private GameTimeControlMapper gameTimeControlMapper;

    /**
     * 查询游戏时间控制
     * 
     * @param id 游戏时间控制主键
     * @return 游戏时间控制
     */
    @Override
    public GameTimeControl selectGameTimeControlById(Long id)
    {
        return gameTimeControlMapper.selectGameTimeControlById(id);
    }

    /**
     * 查询游戏时间控制列表
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 游戏时间控制
     */
    @Override
    public List<GameTimeControl> selectGameTimeControlList(GameTimeControl gameTimeControl)
    {
        return gameTimeControlMapper.selectGameTimeControlList(gameTimeControl);
    }

    /**
     * 新增游戏时间控制
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 结果
     */
    @Override
    public int insertGameTimeControl(GameTimeControl gameTimeControl)
    {
        gameTimeControl.setCreateTime(DateUtils.getNowDate());
        return gameTimeControlMapper.insertGameTimeControl(gameTimeControl);
    }

    /**
     * 修改游戏时间控制
     * 
     * @param gameTimeControl 游戏时间控制
     * @return 结果
     */
    @Override
    public int updateGameTimeControl(GameTimeControl gameTimeControl)
    {
        gameTimeControl.setUpdateTime(DateUtils.getNowDate());
        return gameTimeControlMapper.updateGameTimeControl(gameTimeControl);
    }

    /**
     * 批量删除游戏时间控制
     * 
     * @param ids 需要删除的游戏时间控制主键
     * @return 结果
     */
    @Override
    public int deleteGameTimeControlByIds(Long[] ids)
    {
        return gameTimeControlMapper.deleteGameTimeControlByIds(ids);
    }

    /**
     * 删除游戏时间控制信息
     * 
     * @param id 游戏时间控制主键
     * @return 结果
     */
    @Override
    public int deleteGameTimeControlById(Long id)
    {
        return gameTimeControlMapper.deleteGameTimeControlById(id);
    }
}
