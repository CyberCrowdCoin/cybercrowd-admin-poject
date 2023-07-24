package org.cybercrowd.admin.mapper;

import java.util.List;
import org.cybercrowd.admin.domain.DappsBanner;

/**
 * dapps_banner信息Mapper接口
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
public interface DappsBannerMapper 
{
    /**
     * 查询dapps_banner信息
     * 
     * @param id dapps_banner信息主键
     * @return dapps_banner信息
     */
    public DappsBanner selectDappsBannerById(Long id);

    /**
     * 查询dapps_banner信息列表
     * 
     * @param dappsBanner dapps_banner信息
     * @return dapps_banner信息集合
     */
    public List<DappsBanner> selectDappsBannerList(DappsBanner dappsBanner);

    /**
     * 新增dapps_banner信息
     * 
     * @param dappsBanner dapps_banner信息
     * @return 结果
     */
    public int insertDappsBanner(DappsBanner dappsBanner);

    /**
     * 修改dapps_banner信息
     * 
     * @param dappsBanner dapps_banner信息
     * @return 结果
     */
    public int updateDappsBanner(DappsBanner dappsBanner);

    /**
     * 删除dapps_banner信息
     * 
     * @param id dapps_banner信息主键
     * @return 结果
     */
    public int deleteDappsBannerById(Long id);

    /**
     * 批量删除dapps_banner信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDappsBannerByIds(Long[] ids);
}
