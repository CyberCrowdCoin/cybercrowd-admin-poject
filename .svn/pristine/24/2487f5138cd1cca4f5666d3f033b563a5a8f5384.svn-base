package org.cybercrowd.admin.web.controller.activity;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.cybercrowd.admin.service.IGameTimeControlService;
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
import org.cybercrowd.admin.domain.GameTimeControl;
import org.cybercrowd.admin.common.utils.poi.ExcelUtil;
import org.cybercrowd.admin.common.core.page.TableDataInfo;

/**
 * 游戏时间控制Controller
 * 
 * @author gengchaonan
 * @date 2023-05-04
 */
@RestController
@RequestMapping("/activity/game-time")
public class GameTimeControlController extends BaseController
{
    @Autowired
    private IGameTimeControlService gameTimeControlService;

    /**
     * 查询游戏时间控制列表
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time-time:list')")
    @GetMapping("/list")
    public TableDataInfo list(GameTimeControl gameTimeControl)
    {
        startPage();
        List<GameTimeControl> list = gameTimeControlService.selectGameTimeControlList(gameTimeControl);
        return getDataTable(list);
    }

    /**
     * 导出游戏时间控制列表
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time-time:export')")
    @Log(title = "游戏时间控制", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, GameTimeControl gameTimeControl)
    {
        List<GameTimeControl> list = gameTimeControlService.selectGameTimeControlList(gameTimeControl);
        ExcelUtil<GameTimeControl> util = new ExcelUtil<GameTimeControl>(GameTimeControl.class);
        util.exportExcel(response, list, "游戏时间控制数据");
    }

    /**
     * 获取游戏时间控制详细信息
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gameTimeControlService.selectGameTimeControlById(id));
    }

    /**
     * 新增游戏时间控制
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time:add')")
    @Log(title = "游戏时间控制", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GameTimeControl gameTimeControl)
    {
        return toAjax(gameTimeControlService.insertGameTimeControl(gameTimeControl));
    }

    /**
     * 修改游戏时间控制
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time:edit')")
    @Log(title = "游戏时间控制", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GameTimeControl gameTimeControl)
    {
        return toAjax(gameTimeControlService.updateGameTimeControl(gameTimeControl));
    }

    /**
     * 删除游戏时间控制
     */
    @PreAuthorize("@ss.hasPermi('activity:game-time:remove')")
    @Log(title = "游戏时间控制", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gameTimeControlService.deleteGameTimeControlByIds(ids));
    }
}
