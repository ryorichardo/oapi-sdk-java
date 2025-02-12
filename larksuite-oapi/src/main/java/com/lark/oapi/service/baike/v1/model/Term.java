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

package com.lark.oapi.service.baike.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.baike.v1.enums.*;
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

public class Term {
    /**
     * 名称的值
     * <p> 示例值：企业百科
     */
    @SerializedName("key")
    private String key;
    /**
     * 名称展示范围
     * <p> 示例值：
     */
    @SerializedName("display_status")
    private DisplayStatus displayStatus;

    // builder 开始
    public Term() {
    }

    public Term(Builder builder) {
        /**
         * 名称的值
         * <p> 示例值：企业百科
         */
        this.key = builder.key;
        /**
         * 名称展示范围
         * <p> 示例值：
         */
        this.displayStatus = builder.displayStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public DisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    public void setDisplayStatus(DisplayStatus displayStatus) {
        this.displayStatus = displayStatus;
    }

    public static class Builder {
        /**
         * 名称的值
         * <p> 示例值：企业百科
         */
        private String key;
        /**
         * 名称展示范围
         * <p> 示例值：
         */
        private DisplayStatus displayStatus;

        /**
         * 名称的值
         * <p> 示例值：企业百科
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 名称展示范围
         * <p> 示例值：
         *
         * @param displayStatus
         * @return
         */
        public Builder displayStatus(DisplayStatus displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }


        public Term build() {
            return new Term(this);
        }
    }
}
