// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.hire.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class CreateWebsiteChannelReq {
    /**
     * 官网 ID
     * <p> 示例值：1618209327096
     */
    @Path
    @SerializedName("website_id")
    private String websiteId;
    @Body
    private CreateWebsiteChannelReqBody body;

    // builder 开始
    public CreateWebsiteChannelReq() {
    }

    public CreateWebsiteChannelReq(Builder builder) {
        /**
         * 官网 ID
         * <p> 示例值：1618209327096
         */
        this.websiteId = builder.websiteId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getWebsiteId() {
        return this.websiteId;
    }

    public void setWebsiteId(String websiteId) {
        this.websiteId = websiteId;
    }

    public CreateWebsiteChannelReqBody getCreateWebsiteChannelReqBody() {
        return this.body;
    }

    public void setCreateWebsiteChannelReqBody(CreateWebsiteChannelReqBody body) {
        this.body = body;
    }

    public static class Builder {

        private String websiteId; // 官网 ID
        private CreateWebsiteChannelReqBody body;

        /**
         * 官网 ID
         * <p> 示例值：1618209327096
         *
         * @param websiteId
         * @return
         */
        public Builder websiteId(String websiteId) {
            this.websiteId = websiteId;
            return this;
        }

        public CreateWebsiteChannelReqBody getCreateWebsiteChannelReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder createWebsiteChannelReqBody(CreateWebsiteChannelReqBody body) {
            this.body = body;
            return this;
        }

        public CreateWebsiteChannelReq build() {
            return new CreateWebsiteChannelReq(this);
        }
    }
}
