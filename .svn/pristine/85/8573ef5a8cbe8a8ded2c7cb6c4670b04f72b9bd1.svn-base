package org.cybercrowd.admin.web.controller.activity;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.cybercrowd.admin.common.annotation.Log;
import org.cybercrowd.admin.common.core.controller.BaseController;
import org.cybercrowd.admin.common.core.domain.AjaxResult;
import org.cybercrowd.admin.common.enums.BusinessType;
import org.cybercrowd.admin.domain.DappsBanner;
import org.cybercrowd.admin.service.IDappsBannerService;
import org.cybercrowd.admin.common.utils.poi.ExcelUtil;
import org.cybercrowd.admin.common.core.page.TableDataInfo;

/**
 * dapps_banner信息Controller
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@RestController
@RequestMapping("/activity/dapps-banner")
public class DappsBannerController extends BaseController
{
    @Autowired
    private IDappsBannerService dappsBannerService;

    /**
     * 查询dapps_banner信息列表
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:list')")
    @GetMapping("/list")
    public TableDataInfo list(DappsBanner dappsBanner)
    {
        startPage();
        List<DappsBanner> list = dappsBannerService.selectDappsBannerList(dappsBanner);
        return getDataTable(list);
    }

    /**
     * 导出dapps_banner信息列表
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:export')")
    @Log(title = "dapps_banner信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DappsBanner dappsBanner)
    {
        List<DappsBanner> list = dappsBannerService.selectDappsBannerList(dappsBanner);
        ExcelUtil<DappsBanner> util = new ExcelUtil<DappsBanner>(DappsBanner.class);
        util.exportExcel(response, list, "dapps_banner信息数据");
    }

    /**
     * 获取dapps_banner信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dappsBannerService.selectDappsBannerById(id));
    }

    /**
     * 新增dapps_banner信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:add')")
    @Log(title = "dapps_banner信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DappsBanner dappsBanner)
    {
        return toAjax(dappsBannerService.insertDappsBanner(dappsBanner));
    }

    /**
     * 修改dapps_banner信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:edit')")
    @Log(title = "dapps_banner信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DappsBanner dappsBanner)
    {
        return toAjax(dappsBannerService.updateDappsBanner(dappsBanner));
    }

    /**
     * 删除dapps_banner信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps-banner:remove')")
    @Log(title = "dapps_banner信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dappsBannerService.deleteDappsBannerByIds(ids));
    }
}
