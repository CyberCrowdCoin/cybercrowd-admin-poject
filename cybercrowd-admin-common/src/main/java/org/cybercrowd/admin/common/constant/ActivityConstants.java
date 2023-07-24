package org.cybercrowd.admin.common.constant;

public class ActivityConstants {

    /**
     * 应用名称
     */
    private final static String APP_NAME = "CyberCrowd-Admin";

    /**
     * 服务名称
     */
    private static final String CYBERPAY_CROWD_ADMIN_SERVER_NAME = ":ACTIVITY";

    /**
     * 缓存前缀
     */
    public static final String REDIS_CACHE_PREFIX = APP_NAME + CYBERPAY_CROWD_ADMIN_SERVER_NAME + ":CACHE";

    //锁
    /**
     * 玩家更新锁KEY
     */
    public static final String PLAYER_UPATE_LOCK_KEY = REDIS_CACHE_PREFIX + ":PLAYER_UPATE_LOCK_KEY";
    /**
     * 玩家中奖获胜更新锁KEY
     */
    public static final String PLAYER_WINNING_UPATE_LOCK_KEY = REDIS_CACHE_PREFIX + ":PLAYER_WINNING_UPATE_LOCK_KEY";


    //缓存
    /**
     * 游戏最新回合号
     */
    public static final String PLAYER_LATEST_ROUND_NO_CACH = REDIS_CACHE_PREFIX + ":PLAYER_LATEST_ROUND_NO";



}
