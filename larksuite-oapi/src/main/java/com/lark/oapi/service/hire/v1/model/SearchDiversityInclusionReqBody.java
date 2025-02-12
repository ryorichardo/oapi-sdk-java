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
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class SearchDiversityInclusionReqBody {
    /**
     * 需要查询DI数据的人才ID列表
     * <p> 示例值：
     */
    @SerializedName("talent_ids")
    private String[] talentIds;
    /**
     * 需要查询DI数据的投递ID列表
     * <p> 示例值：
     */
    @SerializedName("application_ids")
    private String[] applicationIds;

    // builder 开始
    public SearchDiversityInclusionReqBody() {
    }

    public SearchDiversityInclusionReqBody(Builder builder) {
        /**
         * 需要查询DI数据的人才ID列表
         * <p> 示例值：
         */
        this.talentIds = builder.talentIds;
        /**
         * 需要查询DI数据的投递ID列表
         * <p> 示例值：
         */
        this.applicationIds = builder.applicationIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getTalentIds() {
        return this.talentIds;
    }

    public void setTalentIds(String[] talentIds) {
        this.talentIds = talentIds;
    }

    public String[] getApplicationIds() {
        return this.applicationIds;
    }

    public void setApplicationIds(String[] applicationIds) {
        this.applicationIds = applicationIds;
    }

    public static class Builder {
        /**
         * 需要查询DI数据的人才ID列表
         * <p> 示例值：
         */
        private String[] talentIds;
        /**
         * 需要查询DI数据的投递ID列表
         * <p> 示例值：
         */
        private String[] applicationIds;

        /**
         * 需要查询DI数据的人才ID列表
         * <p> 示例值：
         *
         * @param talentIds
         * @return
         */
        public Builder talentIds(String[] talentIds) {
            this.talentIds = talentIds;
            return this;
        }


        /**
         * 需要查询DI数据的投递ID列表
         * <p> 示例值：
         *
         * @param applicationIds
         * @return
         */
        public Builder applicationIds(String[] applicationIds) {
            this.applicationIds = applicationIds;
            return this;
        }


        public SearchDiversityInclusionReqBody build() {
            return new SearchDiversityInclusionReqBody(this);
        }
    }
}
