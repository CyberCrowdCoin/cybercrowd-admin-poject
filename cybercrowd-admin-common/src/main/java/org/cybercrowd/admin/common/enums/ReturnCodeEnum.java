package org.cybercrowd.admin.common.enums;

public enum ReturnCodeEnum {
    SUCCESS("SUCCESS","请求成功"),
    FAIL("FAIL","系统异常"),

    PARAMETER_ERROR("PARAMETER_ERROR","参数错误"),

    PLAYER_PULL_DATA_ERROR("PLAYER_PULL_DATA_ERROR","玩家数据拉取异常"),
    PLAYER_ADDRESS_ERROR("PLAYER_ADDRESS_ERROR","玩家地址错误"),
    PLAYER_WINNING_PULL_ERROR("PLAYER_WINNING_ERROR","玩家中奖数据拉取异常"),
    PLAYER_SYNC_ING_ERROR("PLAYER_SYNC_ING_ERROR","玩家数据同步中,请勿重复操作"),
    PLAYER_WINNING_SYNC_ING_ERROR("PLAYER_WINNING_SYNC_ING_ERROR","玩家中奖数据同步中,请勿重复操作"),
    PLAYER_GAME_NOT_SYNC_CONDITION_ERROR("PLAYER_GAME_NOT_SYNC_CONDITION_ERROR","不符合同步数据的条件"),


    ;

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ReturnCodeEnum(String code, String message){
        this.code = code;
        this.message = message;
    }
}
