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

package com.lark.oapi.service.corehr.v2.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.corehr.v2.enums.*;
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

public class BankAccountForUpdate {
    /**
     * 银行名称：- 当填入 bank_id 时，自动填入 bank 的名称 - 未填入 bank_id ，取传入的银行名称
     * <p> 示例值：中国农业银行
     */
    @SerializedName("bank_name")
    private String bankName;
    /**
     * 支行名称，仅当支行为手动输入时该字段才需要填入
     * <p> 示例值：中国农业银行支行
     */
    @SerializedName("branch_name")
    private String branchName;
    /**
     * 银行账号
     * <p> 示例值：6231200000001223
     */
    @SerializedName("bank_account_number")
    private String bankAccountNumber;
    /**
     * 开户人姓名
     * <p> 示例值：孟十五
     */
    @SerializedName("account_holder")
    private String accountHolder;
    /**
     * 国家/地区 ID，详细信息可通过【查询国家/地区信息】接口查询获得
     * <p> 示例值：6862995745889322510
     */
    @SerializedName("country_region_id")
    private String countryRegionId;
    /**
     * 银行卡用途，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_usage"
     * <p> 示例值：
     */
    @SerializedName("bank_account_usages")
    private String[] bankAccountUsages;
    /**
     * 银行卡类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_type"
     * <p> 示例值：checking
     */
    @SerializedName("bank_account_type")
    private String bankAccountType;

    // builder 开始
    public BankAccountForUpdate() {
    }

    public BankAccountForUpdate(Builder builder) {
        /**
         * 银行名称：- 当填入 bank_id 时，自动填入 bank 的名称 - 未填入 bank_id ，取传入的银行名称
         * <p> 示例值：中国农业银行
         */
        this.bankName = builder.bankName;
        /**
         * 支行名称，仅当支行为手动输入时该字段才需要填入
         * <p> 示例值：中国农业银行支行
         */
        this.branchName = builder.branchName;
        /**
         * 银行账号
         * <p> 示例值：6231200000001223
         */
        this.bankAccountNumber = builder.bankAccountNumber;
        /**
         * 开户人姓名
         * <p> 示例值：孟十五
         */
        this.accountHolder = builder.accountHolder;
        /**
         * 国家/地区 ID，详细信息可通过【查询国家/地区信息】接口查询获得
         * <p> 示例值：6862995745889322510
         */
        this.countryRegionId = builder.countryRegionId;
        /**
         * 银行卡用途，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_usage"
         * <p> 示例值：
         */
        this.bankAccountUsages = builder.bankAccountUsages;
        /**
         * 银行卡类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_type"
         * <p> 示例值：checking
         */
        this.bankAccountType = builder.bankAccountType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getCountryRegionId() {
        return this.countryRegionId;
    }

    public void setCountryRegionId(String countryRegionId) {
        this.countryRegionId = countryRegionId;
    }

    public String[] getBankAccountUsages() {
        return this.bankAccountUsages;
    }

    public void setBankAccountUsages(String[] bankAccountUsages) {
        this.bankAccountUsages = bankAccountUsages;
    }

    public String getBankAccountType() {
        return this.bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public static class Builder {
        /**
         * 银行名称：- 当填入 bank_id 时，自动填入 bank 的名称 - 未填入 bank_id ，取传入的银行名称
         * <p> 示例值：中国农业银行
         */
        private String bankName;
        /**
         * 支行名称，仅当支行为手动输入时该字段才需要填入
         * <p> 示例值：中国农业银行支行
         */
        private String branchName;
        /**
         * 银行账号
         * <p> 示例值：6231200000001223
         */
        private String bankAccountNumber;
        /**
         * 开户人姓名
         * <p> 示例值：孟十五
         */
        private String accountHolder;
        /**
         * 国家/地区 ID，详细信息可通过【查询国家/地区信息】接口查询获得
         * <p> 示例值：6862995745889322510
         */
        private String countryRegionId;
        /**
         * 银行卡用途，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_usage"
         * <p> 示例值：
         */
        private String[] bankAccountUsages;
        /**
         * 银行卡类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_type"
         * <p> 示例值：checking
         */
        private String bankAccountType;

        /**
         * 银行名称：- 当填入 bank_id 时，自动填入 bank 的名称 - 未填入 bank_id ，取传入的银行名称
         * <p> 示例值：中国农业银行
         *
         * @param bankName
         * @return
         */
        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }


        /**
         * 支行名称，仅当支行为手动输入时该字段才需要填入
         * <p> 示例值：中国农业银行支行
         *
         * @param branchName
         * @return
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            return this;
        }


        /**
         * 银行账号
         * <p> 示例值：6231200000001223
         *
         * @param bankAccountNumber
         * @return
         */
        public Builder bankAccountNumber(String bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
            return this;
        }


        /**
         * 开户人姓名
         * <p> 示例值：孟十五
         *
         * @param accountHolder
         * @return
         */
        public Builder accountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
            return this;
        }


        /**
         * 国家/地区 ID，详细信息可通过【查询国家/地区信息】接口查询获得
         * <p> 示例值：6862995745889322510
         *
         * @param countryRegionId
         * @return
         */
        public Builder countryRegionId(String countryRegionId) {
            this.countryRegionId = countryRegionId;
            return this;
        }


        /**
         * 银行卡用途，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_usage"
         * <p> 示例值：
         *
         * @param bankAccountUsages
         * @return
         */
        public Builder bankAccountUsages(String[] bankAccountUsages) {
            this.bankAccountUsages = bankAccountUsages;
            return this;
        }


        /**
         * 银行卡类型，枚举值可查询【获取字段详情】接口获取，按如下参数查询即可：- object_api_name = "bank_account" - custom_api_name = "bank_account_type"
         * <p> 示例值：checking
         *
         * @param bankAccountType
         * @return
         */
        public Builder bankAccountType(String bankAccountType) {
            this.bankAccountType = bankAccountType;
            return this;
        }


        public BankAccountForUpdate build() {
            return new BankAccountForUpdate(this);
        }
    }
}
