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

package com.lark.oapi.service.docx.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.docx.v1.enums.*;
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

public class UpdateTextStyleRequest {
    /**
     * 文本样式
     * <p> 示例值：
     */
    @SerializedName("style")
    private TextStyle style;
    /**
     * 应更新的字段，必须至少指定一个字段。例如，要调整 Block 对齐方式，请设置 fields 为 [1]。
     * <p> 示例值：修改的文字样式属性
     */
    @SerializedName("fields")
    private Integer[] fields;

    // builder 开始
    public UpdateTextStyleRequest() {
    }

    public UpdateTextStyleRequest(Builder builder) {
        /**
         * 文本样式
         * <p> 示例值：
         */
        this.style = builder.style;
        /**
         * 应更新的字段，必须至少指定一个字段。例如，要调整 Block 对齐方式，请设置 fields 为 [1]。
         * <p> 示例值：修改的文字样式属性
         */
        this.fields = builder.fields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public TextStyle getStyle() {
        return this.style;
    }

    public void setStyle(TextStyle style) {
        this.style = style;
    }

    public Integer[] getFields() {
        return this.fields;
    }

    public void setFields(Integer[] fields) {
        this.fields = fields;
    }

    public static class Builder {
        /**
         * 文本样式
         * <p> 示例值：
         */
        private TextStyle style;
        /**
         * 应更新的字段，必须至少指定一个字段。例如，要调整 Block 对齐方式，请设置 fields 为 [1]。
         * <p> 示例值：修改的文字样式属性
         */
        private Integer[] fields;

        /**
         * 文本样式
         * <p> 示例值：
         *
         * @param style
         * @return
         */
        public Builder style(TextStyle style) {
            this.style = style;
            return this;
        }


        /**
         * 应更新的字段，必须至少指定一个字段。例如，要调整 Block 对齐方式，请设置 fields 为 [1]。
         * <p> 示例值：修改的文字样式属性
         *
         * @param fields
         * @return
         */
        public Builder fields(Integer[] fields) {
            this.fields = fields;
            return this;
        }


        public UpdateTextStyleRequest build() {
            return new UpdateTextStyleRequest(this);
        }
    }
}
