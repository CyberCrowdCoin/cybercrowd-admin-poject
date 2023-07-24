package org.cybercrowd.admin.service.impl;

import java.util.List;

import org.cybercrowd.admin.common.annotation.DataSource;
import org.cybercrowd.admin.common.enums.DataSourceType;
import org.cybercrowd.admin.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.cybercrowd.admin.mapper.DappsInfoMapper;
import org.cybercrowd.admin.domain.DappsInfo;
import org.cybercrowd.admin.service.IDappsInfoService;

/**
 * Dapp信息Service业务层处理
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class DappsInfoServiceImpl implements IDappsInfoService 
{
    @Autowired
    private DappsInfoMapper dappsInfoMapper;

    /**
     * 查询Dapp信息
     * 
     * @param id Dapp信息主键
     * @return Dapp信息
     */
    @Override
    public DappsInfo selectDappsInfoById(Long id)
    {
        return dappsInfoMapper.selectDappsInfoById(id);
    }

    /**
     * 查询Dapp信息列表
     * 
     * @param dappsInfo Dapp信息
     * @return Dapp信息
     */
    @Override
    public List<DappsInfo> selectDappsInfoList(DappsInfo dappsInfo)
    {
        return dappsInfoMapper.selectDappsInfoList(dappsInfo);
    }

    /**
     * 新增Dapp信息
     * 
     * @param dappsInfo Dapp信息
     * @return 结果
     */
    @Override
    public int insertDappsInfo(DappsInfo dappsInfo)
    {
        dappsInfo.setCreateTime(DateUtils.getNowDate());
        return dappsInfoMapper.insertDappsInfo(dappsInfo);
    }

    /**
     * 修改Dapp信息
     * 
     * @param dappsInfo Dapp信息
     * @return 结果
     */
    @Override
    public int updateDappsInfo(DappsInfo dappsInfo)
    {
        dappsInfo.setUpdateTime(DateUtils.getNowDate());
        return dappsInfoMapper.updateDappsInfo(dappsInfo);
    }

    /**
     * 批量删除Dapp信息
     * 
     * @param ids 需要删除的Dapp信息主键
     * @return 结果
     */
    @Override
    public int deleteDappsInfoByIds(Long[] ids)
    {
        return dappsInfoMapper.deleteDappsInfoByIds(ids);
    }

    /**
     * 删除Dapp信息信息
     * 
     * @param id Dapp信息主键
     * @return 结果
     */
    @Override
    public int deleteDappsInfoById(Long id)
    {
        return dappsInfoMapper.deleteDappsInfoById(id);
    }
}
