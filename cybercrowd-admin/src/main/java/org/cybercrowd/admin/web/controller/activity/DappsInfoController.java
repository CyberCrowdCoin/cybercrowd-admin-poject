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
import org.cybercrowd.admin.domain.DappsInfo;
import org.cybercrowd.admin.service.IDappsInfoService;
import org.cybercrowd.admin.common.utils.poi.ExcelUtil;
import org.cybercrowd.admin.common.core.page.TableDataInfo;

/**
 * Dapp信息Controller
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@RestController
@RequestMapping("/activity/dapps")
public class DappsInfoController extends BaseController
{
    @Autowired
    private IDappsInfoService dappsInfoService;

    /**
     * 查询Dapp信息列表
     */
    @PreAuthorize("@ss.hasPermi('activtiy:dapps:list')")
    @GetMapping("/list")
    public TableDataInfo list(DappsInfo dappsInfo)
    {
        startPage();
        List<DappsInfo> list = dappsInfoService.selectDappsInfoList(dappsInfo);
        return getDataTable(list);
    }

    /**
     * 导出Dapp信息列表
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps:export')")
    @Log(title = "Dapp信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, DappsInfo dappsInfo)
    {
        List<DappsInfo> list = dappsInfoService.selectDappsInfoList(dappsInfo);
        ExcelUtil<DappsInfo> util = new ExcelUtil<DappsInfo>(DappsInfo.class);
        util.exportExcel(response, list, "Dapp信息数据");
    }

    /**
     * 获取Dapp信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(dappsInfoService.selectDappsInfoById(id));
    }

    /**
     * 新增Dapp信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps:add')")
    @Log(title = "Dapp信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody DappsInfo dappsInfo)
    {
        return toAjax(dappsInfoService.insertDappsInfo(dappsInfo));
    }

    /**
     * 修改Dapp信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps:edit')")
    @Log(title = "Dapp信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody DappsInfo dappsInfo)
    {
        return toAjax(dappsInfoService.updateDappsInfo(dappsInfo));
    }

    /**
     * 删除Dapp信息
     */
    @PreAuthorize("@ss.hasPermi('activity:dapps:remove')")
    @Log(title = "Dapp信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(dappsInfoService.deleteDappsInfoByIds(ids));
    }
}
