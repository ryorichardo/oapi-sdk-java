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

public class TalentCombinedBasicInfo {
    /**
     * 名字
     * <p> 示例值：测试
     */
    @SerializedName("name")
    private String name;
    /**
     * 手机号
     * <p> 示例值：182900291190
     */
    @SerializedName("mobile")
    private String mobile;
    /**
     * 手机国家代码
     * <p> 示例值：CN_1
     */
    @SerializedName("mobile_country_code")
    private String mobileCountryCode;
    /**
     * 邮箱
     * <p> 示例值：16xx1@126.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 证件类型
     * <p> 示例值：1
     */
    @SerializedName("identification_type")
    private Integer identificationType;
    /**
     * 证件号
     * <p> 示例值：511699199x1x111234
     */
    @SerializedName("identification_number")
    private String identificationNumber;
    /**
     * 证件信息
     * <p> 示例值：
     */
    @SerializedName("identification")
    private TalentIdentificationInfo identification;
    /**
     * 开始工作时间
     * <p> 示例值：293016767159
     */
    @SerializedName("start_work_time")
    private String startWorkTime;
    /**
     * 出生日期
     * <p> 示例值：293016767159
     */
    @SerializedName("birthday")
    private String birthday;
    /**
     * 性别
     * <p> 示例值：1
     */
    @SerializedName("gender")
    private Integer gender;
    /**
     * 国籍编码
     * <p> 示例值：CN_112
     */
    @SerializedName("nationality_id")
    private String nationalityId;
    /**
     * 所在地点编码
     * <p> 示例值：CT_159
     */
    @SerializedName("current_city_code")
    private String currentCityCode;
    /**
     * 家乡编码
     * <p> 示例值：CT_159
     */
    @SerializedName("hometown_city_code")
    private String hometownCityCode;
    /**
     * 自定义字段列表
     * <p> 示例值：
     */
    @SerializedName("customized_data")
    private TalentCustomizedDataObjectValue[] customizedData;

    // builder 开始
    public TalentCombinedBasicInfo() {
    }

    public TalentCombinedBasicInfo(Builder builder) {
        /**
         * 名字
         * <p> 示例值：测试
         */
        this.name = builder.name;
        /**
         * 手机号
         * <p> 示例值：182900291190
         */
        this.mobile = builder.mobile;
        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         */
        this.mobileCountryCode = builder.mobileCountryCode;
        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         */
        this.email = builder.email;
        /**
         * 证件类型
         * <p> 示例值：1
         */
        this.identificationType = builder.identificationType;
        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         */
        this.identificationNumber = builder.identificationNumber;
        /**
         * 证件信息
         * <p> 示例值：
         */
        this.identification = builder.identification;
        /**
         * 开始工作时间
         * <p> 示例值：293016767159
         */
        this.startWorkTime = builder.startWorkTime;
        /**
         * 出生日期
         * <p> 示例值：293016767159
         */
        this.birthday = builder.birthday;
        /**
         * 性别
         * <p> 示例值：1
         */
        this.gender = builder.gender;
        /**
         * 国籍编码
         * <p> 示例值：CN_112
         */
        this.nationalityId = builder.nationalityId;
        /**
         * 所在地点编码
         * <p> 示例值：CT_159
         */
        this.currentCityCode = builder.currentCityCode;
        /**
         * 家乡编码
         * <p> 示例值：CT_159
         */
        this.hometownCityCode = builder.hometownCityCode;
        /**
         * 自定义字段列表
         * <p> 示例值：
         */
        this.customizedData = builder.customizedData;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        this.mobileCountryCode = mobileCountryCode;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdentificationType() {
        return this.identificationType;
    }

    public void setIdentificationType(Integer identificationType) {
        this.identificationType = identificationType;
    }

    public String getIdentificationNumber() {
        return this.identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public TalentIdentificationInfo getIdentification() {
        return this.identification;
    }

    public void setIdentification(TalentIdentificationInfo identification) {
        this.identification = identification;
    }

    public String getStartWorkTime() {
        return this.startWorkTime;
    }

    public void setStartWorkTime(String startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getNationalityId() {
        return this.nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getCurrentCityCode() {
        return this.currentCityCode;
    }

    public void setCurrentCityCode(String currentCityCode) {
        this.currentCityCode = currentCityCode;
    }

    public String getHometownCityCode() {
        return this.hometownCityCode;
    }

    public void setHometownCityCode(String hometownCityCode) {
        this.hometownCityCode = hometownCityCode;
    }

    public TalentCustomizedDataObjectValue[] getCustomizedData() {
        return this.customizedData;
    }

    public void setCustomizedData(TalentCustomizedDataObjectValue[] customizedData) {
        this.customizedData = customizedData;
    }

    public static class Builder {
        /**
         * 名字
         * <p> 示例值：测试
         */
        private String name;
        /**
         * 手机号
         * <p> 示例值：182900291190
         */
        private String mobile;
        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         */
        private String mobileCountryCode;
        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         */
        private String email;
        /**
         * 证件类型
         * <p> 示例值：1
         */
        private Integer identificationType;
        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         */
        private String identificationNumber;
        /**
         * 证件信息
         * <p> 示例值：
         */
        private TalentIdentificationInfo identification;
        /**
         * 开始工作时间
         * <p> 示例值：293016767159
         */
        private String startWorkTime;
        /**
         * 出生日期
         * <p> 示例值：293016767159
         */
        private String birthday;
        /**
         * 性别
         * <p> 示例值：1
         */
        private Integer gender;
        /**
         * 国籍编码
         * <p> 示例值：CN_112
         */
        private String nationalityId;
        /**
         * 所在地点编码
         * <p> 示例值：CT_159
         */
        private String currentCityCode;
        /**
         * 家乡编码
         * <p> 示例值：CT_159
         */
        private String hometownCityCode;
        /**
         * 自定义字段列表
         * <p> 示例值：
         */
        private TalentCustomizedDataObjectValue[] customizedData;

        /**
         * 名字
         * <p> 示例值：测试
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 手机号
         * <p> 示例值：182900291190
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        /**
         * 手机国家代码
         * <p> 示例值：CN_1
         *
         * @param mobileCountryCode
         * @return
         */
        public Builder mobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：16xx1@126.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 证件类型
         * <p> 示例值：1
         *
         * @param identificationType
         * @return
         */
        public Builder identificationType(Integer identificationType) {
            this.identificationType = identificationType;
            return this;
        }


        /**
         * 证件号
         * <p> 示例值：511699199x1x111234
         *
         * @param identificationNumber
         * @return
         */
        public Builder identificationNumber(String identificationNumber) {
            this.identificationNumber = identificationNumber;
            return this;
        }


        /**
         * 证件信息
         * <p> 示例值：
         *
         * @param identification
         * @return
         */
        public Builder identification(TalentIdentificationInfo identification) {
            this.identification = identification;
            return this;
        }


        /**
         * 开始工作时间
         * <p> 示例值：293016767159
         *
         * @param startWorkTime
         * @return
         */
        public Builder startWorkTime(String startWorkTime) {
            this.startWorkTime = startWorkTime;
            return this;
        }


        /**
         * 出生日期
         * <p> 示例值：293016767159
         *
         * @param birthday
         * @return
         */
        public Builder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }


        /**
         * 性别
         * <p> 示例值：1
         *
         * @param gender
         * @return
         */
        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }


        /**
         * 国籍编码
         * <p> 示例值：CN_112
         *
         * @param nationalityId
         * @return
         */
        public Builder nationalityId(String nationalityId) {
            this.nationalityId = nationalityId;
            return this;
        }


        /**
         * 所在地点编码
         * <p> 示例值：CT_159
         *
         * @param currentCityCode
         * @return
         */
        public Builder currentCityCode(String currentCityCode) {
            this.currentCityCode = currentCityCode;
            return this;
        }


        /**
         * 家乡编码
         * <p> 示例值：CT_159
         *
         * @param hometownCityCode
         * @return
         */
        public Builder hometownCityCode(String hometownCityCode) {
            this.hometownCityCode = hometownCityCode;
            return this;
        }


        /**
         * 自定义字段列表
         * <p> 示例值：
         *
         * @param customizedData
         * @return
         */
        public Builder customizedData(TalentCustomizedDataObjectValue[] customizedData) {
            this.customizedData = customizedData;
            return this;
        }


        public TalentCombinedBasicInfo build() {
            return new TalentCombinedBasicInfo(this);
        }
    }
}
