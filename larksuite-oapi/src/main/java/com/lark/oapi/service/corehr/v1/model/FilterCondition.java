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

package com.lark.oapi.service.corehr.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v1.enums.*;
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

public class FilterCondition {
    /**
     * 左值
     * <p> 示例值：
     */
    @SerializedName("left")
    private FilterRuleValue left;
    /**
     * 右值
     * <p> 示例值：
     */
    @SerializedName("right")
    private FilterRuleValue right;
    /**
     * 操作符
     * <p> 示例值：1
     */
    @SerializedName("operator")
    private Integer operator;
    /**
     * 右值类型
     * <p> 示例值：1
     */
    @SerializedName("right_value_type")
    private Integer rightValueType;

    // builder 开始
    public FilterCondition() {
    }

    public FilterCondition(Builder builder) {
        /**
         * 左值
         * <p> 示例值：
         */
        this.left = builder.left;
        /**
         * 右值
         * <p> 示例值：
         */
        this.right = builder.right;
        /**
         * 操作符
         * <p> 示例值：1
         */
        this.operator = builder.operator;
        /**
         * 右值类型
         * <p> 示例值：1
         */
        this.rightValueType = builder.rightValueType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public FilterRuleValue getLeft() {
        return this.left;
    }

    public void setLeft(FilterRuleValue left) {
        this.left = left;
    }

    public FilterRuleValue getRight() {
        return this.right;
    }

    public void setRight(FilterRuleValue right) {
        this.right = right;
    }

    public Integer getOperator() {
        return this.operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Integer getRightValueType() {
        return this.rightValueType;
    }

    public void setRightValueType(Integer rightValueType) {
        this.rightValueType = rightValueType;
    }

    public static class Builder {
        /**
         * 左值
         * <p> 示例值：
         */
        private FilterRuleValue left;
        /**
         * 右值
         * <p> 示例值：
         */
        private FilterRuleValue right;
        /**
         * 操作符
         * <p> 示例值：1
         */
        private Integer operator;
        /**
         * 右值类型
         * <p> 示例值：1
         */
        private Integer rightValueType;

        /**
         * 左值
         * <p> 示例值：
         *
         * @param left
         * @return
         */
        public Builder left(FilterRuleValue left) {
            this.left = left;
            return this;
        }


        /**
         * 右值
         * <p> 示例值：
         *
         * @param right
         * @return
         */
        public Builder right(FilterRuleValue right) {
            this.right = right;
            return this;
        }


        /**
         * 操作符
         * <p> 示例值：1
         *
         * @param operator
         * @return
         */
        public Builder operator(Integer operator) {
            this.operator = operator;
            return this;
        }


        /**
         * 右值类型
         * <p> 示例值：1
         *
         * @param rightValueType
         * @return
         */
        public Builder rightValueType(Integer rightValueType) {
            this.rightValueType = rightValueType;
            return this;
        }


        public FilterCondition build() {
            return new FilterCondition(this);
        }
    }
}
