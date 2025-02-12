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

package com.lark.oapi.service.application.v6.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.application.v6.enums.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ApplicationVisibilityUserWhiteBlackInfo {
    /**
     * 用户ID
     * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 是否在白名单中
     * <p> 示例值：false
     */
    @SerializedName("in_white_list")
    private Boolean inWhiteList;
    /**
     * 是否在黑名单中
     * <p> 示例值：false
     */
    @SerializedName("in_black_list")
    private Boolean inBlackList;
    /**
     * 是否在付费名单中
     * <p> 示例值：false
     */
    @SerializedName("in_paid_list")
    private Boolean inPaidList;

    // builder 开始
    public ApplicationVisibilityUserWhiteBlackInfo() {
    }

    public ApplicationVisibilityUserWhiteBlackInfo(Builder builder) {
        /**
         * 用户ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        this.userId = builder.userId;
        /**
         * 是否在白名单中
         * <p> 示例值：false
         */
        this.inWhiteList = builder.inWhiteList;
        /**
         * 是否在黑名单中
         * <p> 示例值：false
         */
        this.inBlackList = builder.inBlackList;
        /**
         * 是否在付费名单中
         * <p> 示例值：false
         */
        this.inPaidList = builder.inPaidList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getInWhiteList() {
        return this.inWhiteList;
    }

    public void setInWhiteList(Boolean inWhiteList) {
        this.inWhiteList = inWhiteList;
    }

    public Boolean getInBlackList() {
        return this.inBlackList;
    }

    public void setInBlackList(Boolean inBlackList) {
        this.inBlackList = inBlackList;
    }

    public Boolean getInPaidList() {
        return this.inPaidList;
    }

    public void setInPaidList(Boolean inPaidList) {
        this.inPaidList = inPaidList;
    }

    public static class Builder {
        /**
         * 用户ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         */
        private String userId;
        /**
         * 是否在白名单中
         * <p> 示例值：false
         */
        private Boolean inWhiteList;
        /**
         * 是否在黑名单中
         * <p> 示例值：false
         */
        private Boolean inBlackList;
        /**
         * 是否在付费名单中
         * <p> 示例值：false
         */
        private Boolean inPaidList;

        /**
         * 用户ID
         * <p> 示例值：ou_d317f090b7258ad0372aa53963cda70d
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 是否在白名单中
         * <p> 示例值：false
         *
         * @param inWhiteList
         * @return
         */
        public Builder inWhiteList(Boolean inWhiteList) {
            this.inWhiteList = inWhiteList;
            return this;
        }


        /**
         * 是否在黑名单中
         * <p> 示例值：false
         *
         * @param inBlackList
         * @return
         */
        public Builder inBlackList(Boolean inBlackList) {
            this.inBlackList = inBlackList;
            return this;
        }


        /**
         * 是否在付费名单中
         * <p> 示例值：false
         *
         * @param inPaidList
         * @return
         */
        public Builder inPaidList(Boolean inPaidList) {
            this.inPaidList = inPaidList;
            return this;
        }


        public ApplicationVisibilityUserWhiteBlackInfo build() {
            return new ApplicationVisibilityUserWhiteBlackInfo(this);
        }
    }
}
