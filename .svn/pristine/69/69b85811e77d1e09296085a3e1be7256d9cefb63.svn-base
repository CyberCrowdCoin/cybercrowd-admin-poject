package org.cybercrowd.admin.mapper;

import java.util.List;
import org.cybercrowd.admin.domain.DappsInfo;

/**
 * Dapp信息Mapper接口
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
public interface DappsInfoMapper 
{
    /**
     * 查询Dapp信息
     * 
     * @param id Dapp信息主键
     * @return Dapp信息
     */
    public DappsInfo selectDappsInfoById(Long id);

    /**
     * 查询Dapp信息列表
     * 
     * @param dappsInfo Dapp信息
     * @return Dapp信息集合
     */
    public List<DappsInfo> selectDappsInfoList(DappsInfo dappsInfo);

    /**
     * 新增Dapp信息
     * 
     * @param dappsInfo Dapp信息
     * @return 结果
     */
    public int insertDappsInfo(DappsInfo dappsInfo);

    /**
     * 修改Dapp信息
     * 
     * @param dappsInfo Dapp信息
     * @return 结果
     */
    public int updateDappsInfo(DappsInfo dappsInfo);

    /**
     * 删除Dapp信息
     * 
     * @param id Dapp信息主键
     * @return 结果
     */
    public int deleteDappsInfoById(Long id);

    /**
     * 批量删除Dapp信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDappsInfoByIds(Long[] ids);
}
