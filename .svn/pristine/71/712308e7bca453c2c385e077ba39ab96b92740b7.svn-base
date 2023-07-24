package org.cybercrowd.admin.common.response;


import org.cybercrowd.admin.common.enums.ReturnCodeEnum;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private String code = "SUCCESS";
    private String message = "Successful";

    public void setReturnCodeEnum(ReturnCodeEnum returnCodeEnum){
        this.code = returnCodeEnum.getCode();
        this.message = returnCodeEnum.getMessage();
    }

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
}
