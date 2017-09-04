package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SubUserInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

public class SellercenterSubusersGetResponse
        extends TaobaoResponse {
    private static final long serialVersionUID = 8358349823594318445L;
    @ApiListField("subusers")
    @ApiField("sub_user_info")
    private List<SubUserInfo> subusers;

    public void setSubusers(List<SubUserInfo> subusers) {
        this.subusers = subusers;
    }

    public List<SubUserInfo> getSubusers() {
        return this.subusers;
    }
}


