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

public class TalentCustomizedData {
    /**
     * 模块 ID
     * <p> 示例值：xxxx
     */
    @SerializedName("object_id")
    private String objectId;
    /**
     * 模块名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 类型
     * <p> 示例值：1
     */
    @SerializedName("object_type")
    private Integer objectType;
    /**
     * 模块下的字段
     * <p> 示例值：
     */
    @SerializedName("children")
    private TalentCustomizedDataChild[] children;

    // builder 开始
    public TalentCustomizedData() {
    }

    public TalentCustomizedData(Builder builder) {
        /**
         * 模块 ID
         * <p> 示例值：xxxx
         */
        this.objectId = builder.objectId;
        /**
         * 模块名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 类型
         * <p> 示例值：1
         */
        this.objectType = builder.objectType;
        /**
         * 模块下的字段
         * <p> 示例值：
         */
        this.children = builder.children;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Integer getObjectType() {
        return this.objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public TalentCustomizedDataChild[] getChildren() {
        return this.children;
    }

    public void setChildren(TalentCustomizedDataChild[] children) {
        this.children = children;
    }

    public static class Builder {
        /**
         * 模块 ID
         * <p> 示例值：xxxx
         */
        private String objectId;
        /**
         * 模块名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 类型
         * <p> 示例值：1
         */
        private Integer objectType;
        /**
         * 模块下的字段
         * <p> 示例值：
         */
        private TalentCustomizedDataChild[] children;

        /**
         * 模块 ID
         * <p> 示例值：xxxx
         *
         * @param objectId
         * @return
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }


        /**
         * 模块名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 类型
         * <p> 示例值：1
         *
         * @param objectType
         * @return
         */
        public Builder objectType(Integer objectType) {
            this.objectType = objectType;
            return this;
        }


        /**
         * 模块下的字段
         * <p> 示例值：
         *
         * @param children
         * @return
         */
        public Builder children(TalentCustomizedDataChild[] children) {
            this.children = children;
            return this;
        }


        public TalentCustomizedData build() {
            return new TalentCustomizedData(this);
        }
    }
}
