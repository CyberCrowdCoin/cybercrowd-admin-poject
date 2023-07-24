package org.cybercrowd.admin.service.impl;

import java.util.List;

import org.cybercrowd.admin.common.annotation.DataSource;
import org.cybercrowd.admin.common.enums.DataSourceType;
import org.cybercrowd.admin.common.enums.activity.PlayerGameControlStatusEnum;
import org.cybercrowd.admin.common.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.cybercrowd.admin.mapper.PlayerGameControlMapper;
import org.cybercrowd.admin.domain.PlayerGameControl;
import org.cybercrowd.admin.service.IPlayerGameControlService;

/**
 * 玩家游戏控制Service业务层处理
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class PlayerGameControlServiceImpl implements IPlayerGameControlService{

    private Logger logger = LoggerFactory.getLogger(PlayerGameControlServiceImpl.class);

    @Autowired
    private PlayerGameControlMapper playerGameControlMapper;

    @Autowired
    StringRedisTemplate redisTemplate;

    /**
     * 查询玩家游戏控制
     * 
     * @param id 玩家游戏控制主键
     * @return 玩家游戏控制
     */
    @Override
    public PlayerGameControl selectPlayerGameControlById(Long id)
    {
        return playerGameControlMapper.selectPlayerGameControlById(id);
    }

    /**
     * 查询玩家游戏控制列表
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 玩家游戏控制
     */
    @Override
    public List<PlayerGameControl> selectPlayerGameControlList(PlayerGameControl playerGameControl)
    {
        return playerGameControlMapper.selectPlayerGameControlList(playerGameControl);
    }

    /**
     * 新增玩家游戏控制
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 结果
     */
    @Override
    public int insertPlayerGameControl(PlayerGameControl playerGameControl)
    {
        playerGameControl.setCreateTime(DateUtils.getNowDate());
        return playerGameControlMapper.insertPlayerGameControl(playerGameControl);
    }

    /**
     * 修改玩家游戏控制
     * 
     * @param playerGameControl 玩家游戏控制
     * @return 结果
     */
    @Override
    public int updatePlayerGameControl(PlayerGameControl playerGameControl)
    {
        playerGameControl.setUpdateTime(DateUtils.getNowDate());
        return playerGameControlMapper.updatePlayerGameControl(playerGameControl);
    }

    /**
     * 批量删除玩家游戏控制
     * 
     * @param ids 需要删除的玩家游戏控制主键
     * @return 结果
     */
    @Override
    public int deletePlayerGameControlByIds(Long[] ids)
    {
        return playerGameControlMapper.deletePlayerGameControlByIds(ids);
    }

    /**
     * 删除玩家游戏控制信息
     * 
     * @param id 玩家游戏控制主键
     * @return 结果
     */
    @Override
    public int deletePlayerGameControlById(Long id)
    {
        return playerGameControlMapper.deletePlayerGameControlById(id);
    }

    @Override
    public String latestGameRoundNo() {
        //查询最新游戏回合号
        return playerGameControlMapper.latestGameRoundNo();
    }

    @Override
    public PlayerGameControl latestPlayerGameControl(PlayerGameControlStatusEnum playerGameControlStatusEnum) {
        return playerGameControlMapper.latestPlayerGameControl(playerGameControlStatusEnum.getCode());
    }
}
