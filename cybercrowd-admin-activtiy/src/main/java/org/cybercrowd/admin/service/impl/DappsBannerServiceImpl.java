package org.cybercrowd.admin.service.impl;

import java.util.List;

import org.cybercrowd.admin.common.annotation.DataSource;
import org.cybercrowd.admin.common.enums.DataSourceType;
import org.cybercrowd.admin.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.cybercrowd.admin.mapper.DappsBannerMapper;
import org.cybercrowd.admin.domain.DappsBanner;
import org.cybercrowd.admin.service.IDappsBannerService;

/**
 * dapps_banner信息Service业务层处理
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@Service
@DataSource(value = DataSourceType.SLAVE)
public class DappsBannerServiceImpl implements IDappsBannerService 
{
    @Autowired
    private DappsBannerMapper dappsBannerMapper;

    /**
     * 查询dapps_banner信息
     * 
     * @param id dapps_banner信息主键
     * @return dapps_banner信息
     */
    @Override
    public DappsBanner selectDappsBannerById(Long id)
    {
        return dappsBannerMapper.selectDappsBannerById(id);
    }

    /**
     * 查询dapps_banner信息列表
     * 
     * @param dappsBanner dapps_banner信息
     * @return dapps_banner信息
     */
    @Override
    public List<DappsBanner> selectDappsBannerList(DappsBanner dappsBanner)
    {
        return dappsBannerMapper.selectDappsBannerList(dappsBanner);
    }

    /**
     * 新增dapps_banner信息
     * 
     * @param dappsBanner dapps_banner信息
     * @return 结果
     */
    @Override
    public int insertDappsBanner(DappsBanner dappsBanner)
    {
        dappsBanner.setCreateTime(DateUtils.getNowDate());
        return dappsBannerMapper.insertDappsBanner(dappsBanner);
    }

    /**
     * 修改dapps_banner信息
     * 
     * @param dappsBanner dapps_banner信息
     * @return 结果
     */
    @Override
    public int updateDappsBanner(DappsBanner dappsBanner)
    {
        dappsBanner.setUpdateTime(DateUtils.getNowDate());
        return dappsBannerMapper.updateDappsBanner(dappsBanner);
    }

    /**
     * 批量删除dapps_banner信息
     * 
     * @param ids 需要删除的dapps_banner信息主键
     * @return 结果
     */
    @Override
    public int deleteDappsBannerByIds(Long[] ids)
    {
        return dappsBannerMapper.deleteDappsBannerByIds(ids);
    }

    /**
     * 删除dapps_banner信息信息
     * 
     * @param id dapps_banner信息主键
     * @return 结果
     */
    @Override
    public int deleteDappsBannerById(Long id)
    {
        return dappsBannerMapper.deleteDappsBannerById(id);
    }
}
