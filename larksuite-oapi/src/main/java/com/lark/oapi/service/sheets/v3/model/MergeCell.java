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

package com.lark.oapi.service.sheets.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.sheets.v3.enums.*;
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

public class MergeCell {
    /**
     * 合并单元格的范围
     * <p> 示例值：Zj2ts!A1:B2
     */
    @SerializedName("range")
    private MergeRange range;
    /**
     * 合并单元格类型
     * <p> 示例值：MergeAll
     */
    @SerializedName("merge_type")
    private String mergeType;

    // builder 开始
    public MergeCell() {
    }

    public MergeCell(Builder builder) {
        /**
         * 合并单元格的范围
         * <p> 示例值：Zj2ts!A1:B2
         */
        this.range = builder.range;
        /**
         * 合并单元格类型
         * <p> 示例值：MergeAll
         */
        this.mergeType = builder.mergeType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public MergeRange getRange() {
        return this.range;
    }

    public void setRange(MergeRange range) {
        this.range = range;
    }

    public String getMergeType() {
        return this.mergeType;
    }

    public void setMergeType(String mergeType) {
        this.mergeType = mergeType;
    }

    public static class Builder {
        /**
         * 合并单元格的范围
         * <p> 示例值：Zj2ts!A1:B2
         */
        private MergeRange range;
        /**
         * 合并单元格类型
         * <p> 示例值：MergeAll
         */
        private String mergeType;

        /**
         * 合并单元格的范围
         * <p> 示例值：Zj2ts!A1:B2
         *
         * @param range
         * @return
         */
        public Builder range(MergeRange range) {
            this.range = range;
            return this;
        }


        /**
         * 合并单元格类型
         * <p> 示例值：MergeAll
         *
         * @param mergeType
         * @return
         */
        public Builder mergeType(String mergeType) {
            this.mergeType = mergeType;
            return this;
        }

        /**
         * 合并单元格类型
         * <p> 示例值：MergeAll
         *
         * @param mergeType {@link com.lark.oapi.service.sheets.v3.enums.MergeCellMergeTypeEnum}
         * @return
         */
        public Builder mergeType(com.lark.oapi.service.sheets.v3.enums.MergeCellMergeTypeEnum mergeType) {
            this.mergeType = mergeType.getValue();
            return this;
        }


        public MergeCell build() {
            return new MergeCell(this);
        }
    }
}
