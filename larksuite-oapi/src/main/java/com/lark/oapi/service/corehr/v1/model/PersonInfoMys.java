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

public class PersonInfoMys {
    /**
     * 实体在CoreHR内部的唯一键
     * <p> 示例值：6950635856373745165
     */
    @SerializedName("id")
    private String id;
    /**
     * 关联人员ID
     * <p> 示例值：6919733647952053768
     */
    @SerializedName("person_id")
    private String personId;
    /**
     * 是否本年度在前雇主已有工作收入
     * <p> 示例值：true
     */
    @SerializedName("previous_income_in_the_current_year")
    private Boolean previousIncomeInTheCurrentYear;
    /**
     * 是否应届毕业生
     * <p> 示例值：true
     */
    @SerializedName("fresh_graduate")
    private Boolean freshGraduate;
    /**
     * 雇主信息列表
     * <p> 示例值：
     */
    @SerializedName("previous_employers_list")
    private PreviousEmployer[] previousEmployersList;
    /**
     * 每月总收入
     * <p> 示例值：123
     */
    @SerializedName("monthly_gross")
    private String monthlyGross;
    /**
     * 税收减免一
     * <p> 示例值：123
     */
    @SerializedName("tax_relief_1")
    private String taxRelief1;
    /**
     * 税收减免二
     * <p> 示例值：123
     */
    @SerializedName("tax_relief_2")
    private String taxRelief2;
    /**
     * 税收减免三
     * <p> 示例值：123
     */
    @SerializedName("tax_relief_3")
    private String taxRelief3;
    /**
     * 税收减免四
     * <p> 示例值：123
     */
    @SerializedName("tax_relief_4")
    private String taxRelief4;
    /**
     * 税收减免五
     * <p> 示例值：123
     */
    @SerializedName("tax_relief_5")
    private String taxRelief5;
    /**
     * 员工就业公积金
     * <p> 示例值：123
     */
    @SerializedName("common_reserve_fund")
    private String commonReserveFund;
    /**
     * 每月减税
     * <p> 示例值：123
     */
    @SerializedName("monthly_tax_deduction")
    private String monthlyTaxDeduction;
    /**
     * 社会保险金缴款
     * <p> 示例值：123
     */
    @SerializedName("social_insurance")
    private String socialInsurance;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public PersonInfoMys() {
    }

    public PersonInfoMys(Builder builder) {
        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：6950635856373745165
         */
        this.id = builder.id;
        /**
         * 关联人员ID
         * <p> 示例值：6919733647952053768
         */
        this.personId = builder.personId;
        /**
         * 是否本年度在前雇主已有工作收入
         * <p> 示例值：true
         */
        this.previousIncomeInTheCurrentYear = builder.previousIncomeInTheCurrentYear;
        /**
         * 是否应届毕业生
         * <p> 示例值：true
         */
        this.freshGraduate = builder.freshGraduate;
        /**
         * 雇主信息列表
         * <p> 示例值：
         */
        this.previousEmployersList = builder.previousEmployersList;
        /**
         * 每月总收入
         * <p> 示例值：123
         */
        this.monthlyGross = builder.monthlyGross;
        /**
         * 税收减免一
         * <p> 示例值：123
         */
        this.taxRelief1 = builder.taxRelief1;
        /**
         * 税收减免二
         * <p> 示例值：123
         */
        this.taxRelief2 = builder.taxRelief2;
        /**
         * 税收减免三
         * <p> 示例值：123
         */
        this.taxRelief3 = builder.taxRelief3;
        /**
         * 税收减免四
         * <p> 示例值：123
         */
        this.taxRelief4 = builder.taxRelief4;
        /**
         * 税收减免五
         * <p> 示例值：123
         */
        this.taxRelief5 = builder.taxRelief5;
        /**
         * 员工就业公积金
         * <p> 示例值：123
         */
        this.commonReserveFund = builder.commonReserveFund;
        /**
         * 每月减税
         * <p> 示例值：123
         */
        this.monthlyTaxDeduction = builder.monthlyTaxDeduction;
        /**
         * 社会保险金缴款
         * <p> 示例值：123
         */
        this.socialInsurance = builder.socialInsurance;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public Boolean getPreviousIncomeInTheCurrentYear() {
        return this.previousIncomeInTheCurrentYear;
    }

    public void setPreviousIncomeInTheCurrentYear(Boolean previousIncomeInTheCurrentYear) {
        this.previousIncomeInTheCurrentYear = previousIncomeInTheCurrentYear;
    }

    public Boolean getFreshGraduate() {
        return this.freshGraduate;
    }

    public void setFreshGraduate(Boolean freshGraduate) {
        this.freshGraduate = freshGraduate;
    }

    public PreviousEmployer[] getPreviousEmployersList() {
        return this.previousEmployersList;
    }

    public void setPreviousEmployersList(PreviousEmployer[] previousEmployersList) {
        this.previousEmployersList = previousEmployersList;
    }

    public String getMonthlyGross() {
        return this.monthlyGross;
    }

    public void setMonthlyGross(String monthlyGross) {
        this.monthlyGross = monthlyGross;
    }

    public String getTaxRelief1() {
        return this.taxRelief1;
    }

    public void setTaxRelief1(String taxRelief1) {
        this.taxRelief1 = taxRelief1;
    }

    public String getTaxRelief2() {
        return this.taxRelief2;
    }

    public void setTaxRelief2(String taxRelief2) {
        this.taxRelief2 = taxRelief2;
    }

    public String getTaxRelief3() {
        return this.taxRelief3;
    }

    public void setTaxRelief3(String taxRelief3) {
        this.taxRelief3 = taxRelief3;
    }

    public String getTaxRelief4() {
        return this.taxRelief4;
    }

    public void setTaxRelief4(String taxRelief4) {
        this.taxRelief4 = taxRelief4;
    }

    public String getTaxRelief5() {
        return this.taxRelief5;
    }

    public void setTaxRelief5(String taxRelief5) {
        this.taxRelief5 = taxRelief5;
    }

    public String getCommonReserveFund() {
        return this.commonReserveFund;
    }

    public void setCommonReserveFund(String commonReserveFund) {
        this.commonReserveFund = commonReserveFund;
    }

    public String getMonthlyTaxDeduction() {
        return this.monthlyTaxDeduction;
    }

    public void setMonthlyTaxDeduction(String monthlyTaxDeduction) {
        this.monthlyTaxDeduction = monthlyTaxDeduction;
    }

    public String getSocialInsurance() {
        return this.socialInsurance;
    }

    public void setSocialInsurance(String socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：6950635856373745165
         */
        private String id;
        /**
         * 关联人员ID
         * <p> 示例值：6919733647952053768
         */
        private String personId;
        /**
         * 是否本年度在前雇主已有工作收入
         * <p> 示例值：true
         */
        private Boolean previousIncomeInTheCurrentYear;
        /**
         * 是否应届毕业生
         * <p> 示例值：true
         */
        private Boolean freshGraduate;
        /**
         * 雇主信息列表
         * <p> 示例值：
         */
        private PreviousEmployer[] previousEmployersList;
        /**
         * 每月总收入
         * <p> 示例值：123
         */
        private String monthlyGross;
        /**
         * 税收减免一
         * <p> 示例值：123
         */
        private String taxRelief1;
        /**
         * 税收减免二
         * <p> 示例值：123
         */
        private String taxRelief2;
        /**
         * 税收减免三
         * <p> 示例值：123
         */
        private String taxRelief3;
        /**
         * 税收减免四
         * <p> 示例值：123
         */
        private String taxRelief4;
        /**
         * 税收减免五
         * <p> 示例值：123
         */
        private String taxRelief5;
        /**
         * 员工就业公积金
         * <p> 示例值：123
         */
        private String commonReserveFund;
        /**
         * 每月减税
         * <p> 示例值：123
         */
        private String monthlyTaxDeduction;
        /**
         * 社会保险金缴款
         * <p> 示例值：123
         */
        private String socialInsurance;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 实体在CoreHR内部的唯一键
         * <p> 示例值：6950635856373745165
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 关联人员ID
         * <p> 示例值：6919733647952053768
         *
         * @param personId
         * @return
         */
        public Builder personId(String personId) {
            this.personId = personId;
            return this;
        }


        /**
         * 是否本年度在前雇主已有工作收入
         * <p> 示例值：true
         *
         * @param previousIncomeInTheCurrentYear
         * @return
         */
        public Builder previousIncomeInTheCurrentYear(Boolean previousIncomeInTheCurrentYear) {
            this.previousIncomeInTheCurrentYear = previousIncomeInTheCurrentYear;
            return this;
        }


        /**
         * 是否应届毕业生
         * <p> 示例值：true
         *
         * @param freshGraduate
         * @return
         */
        public Builder freshGraduate(Boolean freshGraduate) {
            this.freshGraduate = freshGraduate;
            return this;
        }


        /**
         * 雇主信息列表
         * <p> 示例值：
         *
         * @param previousEmployersList
         * @return
         */
        public Builder previousEmployersList(PreviousEmployer[] previousEmployersList) {
            this.previousEmployersList = previousEmployersList;
            return this;
        }


        /**
         * 每月总收入
         * <p> 示例值：123
         *
         * @param monthlyGross
         * @return
         */
        public Builder monthlyGross(String monthlyGross) {
            this.monthlyGross = monthlyGross;
            return this;
        }


        /**
         * 税收减免一
         * <p> 示例值：123
         *
         * @param taxRelief1
         * @return
         */
        public Builder taxRelief1(String taxRelief1) {
            this.taxRelief1 = taxRelief1;
            return this;
        }


        /**
         * 税收减免二
         * <p> 示例值：123
         *
         * @param taxRelief2
         * @return
         */
        public Builder taxRelief2(String taxRelief2) {
            this.taxRelief2 = taxRelief2;
            return this;
        }


        /**
         * 税收减免三
         * <p> 示例值：123
         *
         * @param taxRelief3
         * @return
         */
        public Builder taxRelief3(String taxRelief3) {
            this.taxRelief3 = taxRelief3;
            return this;
        }


        /**
         * 税收减免四
         * <p> 示例值：123
         *
         * @param taxRelief4
         * @return
         */
        public Builder taxRelief4(String taxRelief4) {
            this.taxRelief4 = taxRelief4;
            return this;
        }


        /**
         * 税收减免五
         * <p> 示例值：123
         *
         * @param taxRelief5
         * @return
         */
        public Builder taxRelief5(String taxRelief5) {
            this.taxRelief5 = taxRelief5;
            return this;
        }


        /**
         * 员工就业公积金
         * <p> 示例值：123
         *
         * @param commonReserveFund
         * @return
         */
        public Builder commonReserveFund(String commonReserveFund) {
            this.commonReserveFund = commonReserveFund;
            return this;
        }


        /**
         * 每月减税
         * <p> 示例值：123
         *
         * @param monthlyTaxDeduction
         * @return
         */
        public Builder monthlyTaxDeduction(String monthlyTaxDeduction) {
            this.monthlyTaxDeduction = monthlyTaxDeduction;
            return this;
        }


        /**
         * 社会保险金缴款
         * <p> 示例值：123
         *
         * @param socialInsurance
         * @return
         */
        public Builder socialInsurance(String socialInsurance) {
            this.socialInsurance = socialInsurance;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public PersonInfoMys build() {
            return new PersonInfoMys(this);
        }
    }
}
