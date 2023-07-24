package org.cybercrowd.admin.response;


import org.cybercrowd.admin.common.response.BaseResponse;

import java.io.Serializable;
import java.util.List;

public class SyncPlayersRes extends BaseResponse implements Serializable {

    private List<String> inviters;

    public List<String> getInviters() {
        return inviters;
    }

    public void setInviters(List<String> inviters) {
        this.inviters = inviters;
    }
}
