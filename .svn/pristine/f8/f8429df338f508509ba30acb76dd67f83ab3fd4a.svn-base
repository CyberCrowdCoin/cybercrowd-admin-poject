package org.cybercrowd.admin.web.controller.activity;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
import org.cybercrowd.admin.domain.PlayerInfo;
import org.cybercrowd.admin.service.IPlayerInfoService;
import org.cybercrowd.admin.common.utils.poi.ExcelUtil;
import org.cybercrowd.admin.common.core.page.TableDataInfo;

/**
 * 游戏者信息Controller
 * 
 * @author Gengchaonan
 * @date 2023-03-07
 */
@RestController
@RequestMapping("/activity/player")
public class PlayerInfoController extends BaseController
{
    @Autowired
    private IPlayerInfoService playerInfoService;

    /**
     * 查询游戏者信息列表
     */
    @PreAuthorize("@ss.hasPermi('activity:player:list')")
    @GetMapping("/list")
    public TableDataInfo list(PlayerInfo playerInfo)
    {
        startPage();
        List<PlayerInfo> list = playerInfoService.selectPlayerInfoList(playerInfo);
        return getDataTable(list);
    }

    /**
     * 导出游戏者信息列表
     */
    @PreAuthorize("@ss.hasPermi('activity:player:export')")
    @Log(title = "游戏者信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PlayerInfo playerInfo)
    {
        List<PlayerInfo> list = playerInfoService.selectPlayerInfoList(playerInfo);
        ExcelUtil<PlayerInfo> util = new ExcelUtil<PlayerInfo>(PlayerInfo.class);
        util.exportExcel(response, list, "游戏者信息数据");
    }

    /**
     * 获取游戏者信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('activity:player:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(playerInfoService.selectPlayerInfoById(id));
    }

    /**
     * 新增游戏者信息
     */
    @PreAuthorize("@ss.hasPermi('activity:player:add')")
    @Log(title = "游戏者信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PlayerInfo playerInfo)
    {
        return toAjax(playerInfoService.insertPlayerInfo(playerInfo));
    }

    /**
     * 修改游戏者信息
     */
    @PreAuthorize("@ss.hasPermi('activity:player:edit')")
    @Log(title = "游戏者信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PlayerInfo playerInfo)
    {
        return toAjax(playerInfoService.updatePlayerInfo(playerInfo));
    }

    /**
     * 删除游戏者信息
     */
    @PreAuthorize("@ss.hasPermi('activity:player:remove')")
    @Log(title = "游戏者信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(playerInfoService.deletePlayerInfoByIds(ids));
    }

    @PreAuthorize("@ss.hasPermi('activity:player:sync')")
    @Log(title = "同步玩家信息", businessType = BusinessType.UPDATE)
    @GetMapping("/sync")
    public AjaxResult syncPlayer(){
        return success(playerInfoService.syncPlayerV2());
    }

    @PreAuthorize("@ss.hasPermi('activity:player:sync-winning')")
    @Log(title = "同步玩家中奖信息", businessType = BusinessType.UPDATE)
    @GetMapping("/sync-winning")
    public AjaxResult syncPlayerWinning(){
        return success(playerInfoService.syncPlayerWinningV2());
    }
}
