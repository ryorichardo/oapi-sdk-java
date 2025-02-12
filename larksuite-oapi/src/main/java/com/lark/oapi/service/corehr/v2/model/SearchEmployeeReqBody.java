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

public class SearchEmployeeReqBody {
    /**
     * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
     * <p> 示例值：
     */
    @SerializedName("fields")
    private String[] fields;
    /**
     * 雇佣 ID 列表
     * <p> 示例值：
     */
    @SerializedName("employment_id_list")
    private String[] employmentIdList;
    /**
     * 工号列表
     * <p> 示例值：
     */
    @SerializedName("employee_number_list")
    private String[] employeeNumberList;
    /**
     * 邮箱，精确匹配查询
     * <p> 示例值：13312345678@qq.com
     */
    @SerializedName("work_email")
    private String workEmail;
    /**
     * 个人电话，精确匹配查询
     * <p> 示例值：16760342300
     */
    @SerializedName("phone_number")
    private String phoneNumber;
    /**
     * 搜索关键字，支持对邮箱、工号和姓名的模糊匹配
     * <p> 示例值：张三
     */
    @SerializedName("key_word")
    private String keyWord;
    /**
     * 雇佣状态
     * <p> 示例值：
     */
    @SerializedName("employment_status")
    private String employmentStatus;
    /**
     * 人员类型 ID
     * <p> 示例值：6971090097697521314
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 部门 ID，根据员工主职的直接部门查询，可以通过【查询部门】API 获取 部门 ID
     * <p> 示例值：
     */
    @SerializedName("department_id_list")
    private String[] departmentIdList;
    /**
     * 直接上级的雇佣 ID，根据员工主职的直接上级查询
     * <p> 示例值：7027024823985447820
     */
    @SerializedName("direct_manager_id_list")
    private String[] directManagerIdList;
    /**
     * 虚线上级的雇佣 ID，根据员工主职的虚线上级查询
     * <p> 示例值：7027024823985117820
     */
    @SerializedName("dotted_line_manager_id_list")
    private String[] dottedLineManagerIdList;
    /**
     * 转正式员工日期-搜索范围开始
     * <p> 示例值：2020-01-01
     */
    @SerializedName("regular_employee_start_date_start")
    private String regularEmployeeStartDateStart;
    /**
     * 转正式员工日期-搜索范围结束
     * <p> 示例值：2020-01-01
     */
    @SerializedName("regular_employee_start_date_end")
    private String regularEmployeeStartDateEnd;
    /**
     * 入职日期-搜索范围开始，需要与搜索范围结束一同使用
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_time_start")
    private String effectiveTimeStart;
    /**
     * 入职日期-搜索范围结束
     * <p> 示例值：2020-01-01
     */
    @SerializedName("effective_time_end")
    private String effectiveTimeEnd;
    /**
     * 工作地点 ID 列表，查询属于该工作地点及下级工作地点的员工
     * <p> 示例值：
     */
    @SerializedName("work_location_id_list_include_sub")
    private String[] workLocationIdListIncludeSub;
    /**
     * 常用英文全名精确搜索
     * <p> 示例值：
     */
    @SerializedName("preferred_english_full_name_list")
    private String[] preferredEnglishFullNameList;
    /**
     * 常用本地全名精确搜索
     * <p> 示例值：
     */
    @SerializedName("preferred_local_full_name_list")
    private String[] preferredLocalFullNameList;
    /**
     * 居民身份证件号码精确搜索
     * <p> 示例值：
     */
    @SerializedName("national_id_number_list")
    private String[] nationalIdNumberList;
    /**
     * 个人电话列表，精确匹配查询
     * <p> 示例值：
     */
    @SerializedName("phone_number_list")
    private String[] phoneNumberList;
    /**
     * 工作邮箱地址列表，精确匹配查询
     * <p> 示例值：
     */
    @SerializedName("email_address_list")
    private String[] emailAddressList;
    /**
     * 部门 ID 列表，查询属于该部门及下级部门的员工
     * <p> 示例值：
     */
    @SerializedName("department_id_list_include_sub")
    private String[] departmentIdListIncludeSub;

    // builder 开始
    public SearchEmployeeReqBody() {
    }

    public SearchEmployeeReqBody(Builder builder) {
        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         */
        this.fields = builder.fields;
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        this.employmentIdList = builder.employmentIdList;
        /**
         * 工号列表
         * <p> 示例值：
         */
        this.employeeNumberList = builder.employeeNumberList;
        /**
         * 邮箱，精确匹配查询
         * <p> 示例值：13312345678@qq.com
         */
        this.workEmail = builder.workEmail;
        /**
         * 个人电话，精确匹配查询
         * <p> 示例值：16760342300
         */
        this.phoneNumber = builder.phoneNumber;
        /**
         * 搜索关键字，支持对邮箱、工号和姓名的模糊匹配
         * <p> 示例值：张三
         */
        this.keyWord = builder.keyWord;
        /**
         * 雇佣状态
         * <p> 示例值：
         */
        this.employmentStatus = builder.employmentStatus;
        /**
         * 人员类型 ID
         * <p> 示例值：6971090097697521314
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 部门 ID，根据员工主职的直接部门查询，可以通过【查询部门】API 获取 部门 ID
         * <p> 示例值：
         */
        this.departmentIdList = builder.departmentIdList;
        /**
         * 直接上级的雇佣 ID，根据员工主职的直接上级查询
         * <p> 示例值：7027024823985447820
         */
        this.directManagerIdList = builder.directManagerIdList;
        /**
         * 虚线上级的雇佣 ID，根据员工主职的虚线上级查询
         * <p> 示例值：7027024823985117820
         */
        this.dottedLineManagerIdList = builder.dottedLineManagerIdList;
        /**
         * 转正式员工日期-搜索范围开始
         * <p> 示例值：2020-01-01
         */
        this.regularEmployeeStartDateStart = builder.regularEmployeeStartDateStart;
        /**
         * 转正式员工日期-搜索范围结束
         * <p> 示例值：2020-01-01
         */
        this.regularEmployeeStartDateEnd = builder.regularEmployeeStartDateEnd;
        /**
         * 入职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2020-01-01
         */
        this.effectiveTimeStart = builder.effectiveTimeStart;
        /**
         * 入职日期-搜索范围结束
         * <p> 示例值：2020-01-01
         */
        this.effectiveTimeEnd = builder.effectiveTimeEnd;
        /**
         * 工作地点 ID 列表，查询属于该工作地点及下级工作地点的员工
         * <p> 示例值：
         */
        this.workLocationIdListIncludeSub = builder.workLocationIdListIncludeSub;
        /**
         * 常用英文全名精确搜索
         * <p> 示例值：
         */
        this.preferredEnglishFullNameList = builder.preferredEnglishFullNameList;
        /**
         * 常用本地全名精确搜索
         * <p> 示例值：
         */
        this.preferredLocalFullNameList = builder.preferredLocalFullNameList;
        /**
         * 居民身份证件号码精确搜索
         * <p> 示例值：
         */
        this.nationalIdNumberList = builder.nationalIdNumberList;
        /**
         * 个人电话列表，精确匹配查询
         * <p> 示例值：
         */
        this.phoneNumberList = builder.phoneNumberList;
        /**
         * 工作邮箱地址列表，精确匹配查询
         * <p> 示例值：
         */
        this.emailAddressList = builder.emailAddressList;
        /**
         * 部门 ID 列表，查询属于该部门及下级部门的员工
         * <p> 示例值：
         */
        this.departmentIdListIncludeSub = builder.departmentIdListIncludeSub;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String[] getFields() {
        return this.fields;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public String[] getEmploymentIdList() {
        return this.employmentIdList;
    }

    public void setEmploymentIdList(String[] employmentIdList) {
        this.employmentIdList = employmentIdList;
    }

    public String[] getEmployeeNumberList() {
        return this.employeeNumberList;
    }

    public void setEmployeeNumberList(String[] employeeNumberList) {
        this.employeeNumberList = employeeNumberList;
    }

    public String getWorkEmail() {
        return this.workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getEmploymentStatus() {
        return this.employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String[] getDepartmentIdList() {
        return this.departmentIdList;
    }

    public void setDepartmentIdList(String[] departmentIdList) {
        this.departmentIdList = departmentIdList;
    }

    public String[] getDirectManagerIdList() {
        return this.directManagerIdList;
    }

    public void setDirectManagerIdList(String[] directManagerIdList) {
        this.directManagerIdList = directManagerIdList;
    }

    public String[] getDottedLineManagerIdList() {
        return this.dottedLineManagerIdList;
    }

    public void setDottedLineManagerIdList(String[] dottedLineManagerIdList) {
        this.dottedLineManagerIdList = dottedLineManagerIdList;
    }

    public String getRegularEmployeeStartDateStart() {
        return this.regularEmployeeStartDateStart;
    }

    public void setRegularEmployeeStartDateStart(String regularEmployeeStartDateStart) {
        this.regularEmployeeStartDateStart = regularEmployeeStartDateStart;
    }

    public String getRegularEmployeeStartDateEnd() {
        return this.regularEmployeeStartDateEnd;
    }

    public void setRegularEmployeeStartDateEnd(String regularEmployeeStartDateEnd) {
        this.regularEmployeeStartDateEnd = regularEmployeeStartDateEnd;
    }

    public String getEffectiveTimeStart() {
        return this.effectiveTimeStart;
    }

    public void setEffectiveTimeStart(String effectiveTimeStart) {
        this.effectiveTimeStart = effectiveTimeStart;
    }

    public String getEffectiveTimeEnd() {
        return this.effectiveTimeEnd;
    }

    public void setEffectiveTimeEnd(String effectiveTimeEnd) {
        this.effectiveTimeEnd = effectiveTimeEnd;
    }

    public String[] getWorkLocationIdListIncludeSub() {
        return this.workLocationIdListIncludeSub;
    }

    public void setWorkLocationIdListIncludeSub(String[] workLocationIdListIncludeSub) {
        this.workLocationIdListIncludeSub = workLocationIdListIncludeSub;
    }

    public String[] getPreferredEnglishFullNameList() {
        return this.preferredEnglishFullNameList;
    }

    public void setPreferredEnglishFullNameList(String[] preferredEnglishFullNameList) {
        this.preferredEnglishFullNameList = preferredEnglishFullNameList;
    }

    public String[] getPreferredLocalFullNameList() {
        return this.preferredLocalFullNameList;
    }

    public void setPreferredLocalFullNameList(String[] preferredLocalFullNameList) {
        this.preferredLocalFullNameList = preferredLocalFullNameList;
    }

    public String[] getNationalIdNumberList() {
        return this.nationalIdNumberList;
    }

    public void setNationalIdNumberList(String[] nationalIdNumberList) {
        this.nationalIdNumberList = nationalIdNumberList;
    }

    public String[] getPhoneNumberList() {
        return this.phoneNumberList;
    }

    public void setPhoneNumberList(String[] phoneNumberList) {
        this.phoneNumberList = phoneNumberList;
    }

    public String[] getEmailAddressList() {
        return this.emailAddressList;
    }

    public void setEmailAddressList(String[] emailAddressList) {
        this.emailAddressList = emailAddressList;
    }

    public String[] getDepartmentIdListIncludeSub() {
        return this.departmentIdListIncludeSub;
    }

    public void setDepartmentIdListIncludeSub(String[] departmentIdListIncludeSub) {
        this.departmentIdListIncludeSub = departmentIdListIncludeSub;
    }

    public static class Builder {
        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         */
        private String[] fields;
        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         */
        private String[] employmentIdList;
        /**
         * 工号列表
         * <p> 示例值：
         */
        private String[] employeeNumberList;
        /**
         * 邮箱，精确匹配查询
         * <p> 示例值：13312345678@qq.com
         */
        private String workEmail;
        /**
         * 个人电话，精确匹配查询
         * <p> 示例值：16760342300
         */
        private String phoneNumber;
        /**
         * 搜索关键字，支持对邮箱、工号和姓名的模糊匹配
         * <p> 示例值：张三
         */
        private String keyWord;
        /**
         * 雇佣状态
         * <p> 示例值：
         */
        private String employmentStatus;
        /**
         * 人员类型 ID
         * <p> 示例值：6971090097697521314
         */
        private String employeeTypeId;
        /**
         * 部门 ID，根据员工主职的直接部门查询，可以通过【查询部门】API 获取 部门 ID
         * <p> 示例值：
         */
        private String[] departmentIdList;
        /**
         * 直接上级的雇佣 ID，根据员工主职的直接上级查询
         * <p> 示例值：7027024823985447820
         */
        private String[] directManagerIdList;
        /**
         * 虚线上级的雇佣 ID，根据员工主职的虚线上级查询
         * <p> 示例值：7027024823985117820
         */
        private String[] dottedLineManagerIdList;
        /**
         * 转正式员工日期-搜索范围开始
         * <p> 示例值：2020-01-01
         */
        private String regularEmployeeStartDateStart;
        /**
         * 转正式员工日期-搜索范围结束
         * <p> 示例值：2020-01-01
         */
        private String regularEmployeeStartDateEnd;
        /**
         * 入职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2020-01-01
         */
        private String effectiveTimeStart;
        /**
         * 入职日期-搜索范围结束
         * <p> 示例值：2020-01-01
         */
        private String effectiveTimeEnd;
        /**
         * 工作地点 ID 列表，查询属于该工作地点及下级工作地点的员工
         * <p> 示例值：
         */
        private String[] workLocationIdListIncludeSub;
        /**
         * 常用英文全名精确搜索
         * <p> 示例值：
         */
        private String[] preferredEnglishFullNameList;
        /**
         * 常用本地全名精确搜索
         * <p> 示例值：
         */
        private String[] preferredLocalFullNameList;
        /**
         * 居民身份证件号码精确搜索
         * <p> 示例值：
         */
        private String[] nationalIdNumberList;
        /**
         * 个人电话列表，精确匹配查询
         * <p> 示例值：
         */
        private String[] phoneNumberList;
        /**
         * 工作邮箱地址列表，精确匹配查询
         * <p> 示例值：
         */
        private String[] emailAddressList;
        /**
         * 部门 ID 列表，查询属于该部门及下级部门的员工
         * <p> 示例值：
         */
        private String[] departmentIdListIncludeSub;

        /**
         * 返回数据的字段列表，填写方式：为空时默认仅返回 ID
         * <p> 示例值：
         *
         * @param fields
         * @return
         */
        public Builder fields(String[] fields) {
            this.fields = fields;
            return this;
        }


        /**
         * 雇佣 ID 列表
         * <p> 示例值：
         *
         * @param employmentIdList
         * @return
         */
        public Builder employmentIdList(String[] employmentIdList) {
            this.employmentIdList = employmentIdList;
            return this;
        }


        /**
         * 工号列表
         * <p> 示例值：
         *
         * @param employeeNumberList
         * @return
         */
        public Builder employeeNumberList(String[] employeeNumberList) {
            this.employeeNumberList = employeeNumberList;
            return this;
        }


        /**
         * 邮箱，精确匹配查询
         * <p> 示例值：13312345678@qq.com
         *
         * @param workEmail
         * @return
         */
        public Builder workEmail(String workEmail) {
            this.workEmail = workEmail;
            return this;
        }


        /**
         * 个人电话，精确匹配查询
         * <p> 示例值：16760342300
         *
         * @param phoneNumber
         * @return
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }


        /**
         * 搜索关键字，支持对邮箱、工号和姓名的模糊匹配
         * <p> 示例值：张三
         *
         * @param keyWord
         * @return
         */
        public Builder keyWord(String keyWord) {
            this.keyWord = keyWord;
            return this;
        }


        /**
         * 雇佣状态
         * <p> 示例值：
         *
         * @param employmentStatus
         * @return
         */
        public Builder employmentStatus(String employmentStatus) {
            this.employmentStatus = employmentStatus;
            return this;
        }

        /**
         * 雇佣状态
         * <p> 示例值：
         *
         * @param employmentStatus {@link com.lark.oapi.service.corehr.v2.enums.SearchEmployeeEmploymentStatusEnum}
         * @return
         */
        public Builder employmentStatus(com.lark.oapi.service.corehr.v2.enums.SearchEmployeeEmploymentStatusEnum employmentStatus) {
            this.employmentStatus = employmentStatus.getValue();
            return this;
        }


        /**
         * 人员类型 ID
         * <p> 示例值：6971090097697521314
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 部门 ID，根据员工主职的直接部门查询，可以通过【查询部门】API 获取 部门 ID
         * <p> 示例值：
         *
         * @param departmentIdList
         * @return
         */
        public Builder departmentIdList(String[] departmentIdList) {
            this.departmentIdList = departmentIdList;
            return this;
        }


        /**
         * 直接上级的雇佣 ID，根据员工主职的直接上级查询
         * <p> 示例值：7027024823985447820
         *
         * @param directManagerIdList
         * @return
         */
        public Builder directManagerIdList(String[] directManagerIdList) {
            this.directManagerIdList = directManagerIdList;
            return this;
        }


        /**
         * 虚线上级的雇佣 ID，根据员工主职的虚线上级查询
         * <p> 示例值：7027024823985117820
         *
         * @param dottedLineManagerIdList
         * @return
         */
        public Builder dottedLineManagerIdList(String[] dottedLineManagerIdList) {
            this.dottedLineManagerIdList = dottedLineManagerIdList;
            return this;
        }


        /**
         * 转正式员工日期-搜索范围开始
         * <p> 示例值：2020-01-01
         *
         * @param regularEmployeeStartDateStart
         * @return
         */
        public Builder regularEmployeeStartDateStart(String regularEmployeeStartDateStart) {
            this.regularEmployeeStartDateStart = regularEmployeeStartDateStart;
            return this;
        }


        /**
         * 转正式员工日期-搜索范围结束
         * <p> 示例值：2020-01-01
         *
         * @param regularEmployeeStartDateEnd
         * @return
         */
        public Builder regularEmployeeStartDateEnd(String regularEmployeeStartDateEnd) {
            this.regularEmployeeStartDateEnd = regularEmployeeStartDateEnd;
            return this;
        }


        /**
         * 入职日期-搜索范围开始，需要与搜索范围结束一同使用
         * <p> 示例值：2020-01-01
         *
         * @param effectiveTimeStart
         * @return
         */
        public Builder effectiveTimeStart(String effectiveTimeStart) {
            this.effectiveTimeStart = effectiveTimeStart;
            return this;
        }


        /**
         * 入职日期-搜索范围结束
         * <p> 示例值：2020-01-01
         *
         * @param effectiveTimeEnd
         * @return
         */
        public Builder effectiveTimeEnd(String effectiveTimeEnd) {
            this.effectiveTimeEnd = effectiveTimeEnd;
            return this;
        }


        /**
         * 工作地点 ID 列表，查询属于该工作地点及下级工作地点的员工
         * <p> 示例值：
         *
         * @param workLocationIdListIncludeSub
         * @return
         */
        public Builder workLocationIdListIncludeSub(String[] workLocationIdListIncludeSub) {
            this.workLocationIdListIncludeSub = workLocationIdListIncludeSub;
            return this;
        }


        /**
         * 常用英文全名精确搜索
         * <p> 示例值：
         *
         * @param preferredEnglishFullNameList
         * @return
         */
        public Builder preferredEnglishFullNameList(String[] preferredEnglishFullNameList) {
            this.preferredEnglishFullNameList = preferredEnglishFullNameList;
            return this;
        }


        /**
         * 常用本地全名精确搜索
         * <p> 示例值：
         *
         * @param preferredLocalFullNameList
         * @return
         */
        public Builder preferredLocalFullNameList(String[] preferredLocalFullNameList) {
            this.preferredLocalFullNameList = preferredLocalFullNameList;
            return this;
        }


        /**
         * 居民身份证件号码精确搜索
         * <p> 示例值：
         *
         * @param nationalIdNumberList
         * @return
         */
        public Builder nationalIdNumberList(String[] nationalIdNumberList) {
            this.nationalIdNumberList = nationalIdNumberList;
            return this;
        }


        /**
         * 个人电话列表，精确匹配查询
         * <p> 示例值：
         *
         * @param phoneNumberList
         * @return
         */
        public Builder phoneNumberList(String[] phoneNumberList) {
            this.phoneNumberList = phoneNumberList;
            return this;
        }


        /**
         * 工作邮箱地址列表，精确匹配查询
         * <p> 示例值：
         *
         * @param emailAddressList
         * @return
         */
        public Builder emailAddressList(String[] emailAddressList) {
            this.emailAddressList = emailAddressList;
            return this;
        }


        /**
         * 部门 ID 列表，查询属于该部门及下级部门的员工
         * <p> 示例值：
         *
         * @param departmentIdListIncludeSub
         * @return
         */
        public Builder departmentIdListIncludeSub(String[] departmentIdListIncludeSub) {
            this.departmentIdListIncludeSub = departmentIdListIncludeSub;
            return this;
        }


        public SearchEmployeeReqBody build() {
            return new SearchEmployeeReqBody(this);
        }
    }
}
