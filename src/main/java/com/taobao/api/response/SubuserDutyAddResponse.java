package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

public class SubuserDutyAddResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 2311218692891138711L;
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }
}


