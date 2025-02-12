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

public class CalculateParam {
    /**
     * 部门 ID
     * <p> 示例值：slnkdnaklsnda
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 人员类型 ID
     * <p> 示例值：kajsdnjasdn
     */
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    /**
     * 工作地点 ID
     * <p> 示例值：asbjldasnjdlwa
     */
    @SerializedName("work_location_id")
    private String workLocationId;
    /**
     * 社保公积金缴纳地 ID
     * <p> 示例值：dsalndlnasl
     */
    @SerializedName("social_security_city_id")
    private String socialSecurityCityId;
    /**
     * 序列 ID
     * <p> 示例值：bjlsadnas
     */
    @SerializedName("job_family_id")
    private String jobFamilyId;
    /**
     * 职级 ID
     * <p> 示例值：dsadamkdq
     */
    @SerializedName("job_level_id")
    private String jobLevelId;
    /**
     * 职务 ID
     * <p> 示例值：dsandkjanjnda
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 人员自定义字段
     * <p> 示例值：
     */
    @SerializedName("matching_rule_dimension")
    private DimensionValue[] matchingRuleDimension;

    // builder 开始
    public CalculateParam() {
    }

    public CalculateParam(Builder builder) {
        /**
         * 部门 ID
         * <p> 示例值：slnkdnaklsnda
         */
        this.departmentId = builder.departmentId;
        /**
         * 人员类型 ID
         * <p> 示例值：kajsdnjasdn
         */
        this.employeeTypeId = builder.employeeTypeId;
        /**
         * 工作地点 ID
         * <p> 示例值：asbjldasnjdlwa
         */
        this.workLocationId = builder.workLocationId;
        /**
         * 社保公积金缴纳地 ID
         * <p> 示例值：dsalndlnasl
         */
        this.socialSecurityCityId = builder.socialSecurityCityId;
        /**
         * 序列 ID
         * <p> 示例值：bjlsadnas
         */
        this.jobFamilyId = builder.jobFamilyId;
        /**
         * 职级 ID
         * <p> 示例值：dsadamkdq
         */
        this.jobLevelId = builder.jobLevelId;
        /**
         * 职务 ID
         * <p> 示例值：dsandkjanjnda
         */
        this.jobId = builder.jobId;
        /**
         * 人员自定义字段
         * <p> 示例值：
         */
        this.matchingRuleDimension = builder.matchingRuleDimension;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getWorkLocationId() {
        return this.workLocationId;
    }

    public void setWorkLocationId(String workLocationId) {
        this.workLocationId = workLocationId;
    }

    public String getSocialSecurityCityId() {
        return this.socialSecurityCityId;
    }

    public void setSocialSecurityCityId(String socialSecurityCityId) {
        this.socialSecurityCityId = socialSecurityCityId;
    }

    public String getJobFamilyId() {
        return this.jobFamilyId;
    }

    public void setJobFamilyId(String jobFamilyId) {
        this.jobFamilyId = jobFamilyId;
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DimensionValue[] getMatchingRuleDimension() {
        return this.matchingRuleDimension;
    }

    public void setMatchingRuleDimension(DimensionValue[] matchingRuleDimension) {
        this.matchingRuleDimension = matchingRuleDimension;
    }

    public static class Builder {
        /**
         * 部门 ID
         * <p> 示例值：slnkdnaklsnda
         */
        private String departmentId;
        /**
         * 人员类型 ID
         * <p> 示例值：kajsdnjasdn
         */
        private String employeeTypeId;
        /**
         * 工作地点 ID
         * <p> 示例值：asbjldasnjdlwa
         */
        private String workLocationId;
        /**
         * 社保公积金缴纳地 ID
         * <p> 示例值：dsalndlnasl
         */
        private String socialSecurityCityId;
        /**
         * 序列 ID
         * <p> 示例值：bjlsadnas
         */
        private String jobFamilyId;
        /**
         * 职级 ID
         * <p> 示例值：dsadamkdq
         */
        private String jobLevelId;
        /**
         * 职务 ID
         * <p> 示例值：dsandkjanjnda
         */
        private String jobId;
        /**
         * 人员自定义字段
         * <p> 示例值：
         */
        private DimensionValue[] matchingRuleDimension;

        /**
         * 部门 ID
         * <p> 示例值：slnkdnaklsnda
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 人员类型 ID
         * <p> 示例值：kajsdnjasdn
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }


        /**
         * 工作地点 ID
         * <p> 示例值：asbjldasnjdlwa
         *
         * @param workLocationId
         * @return
         */
        public Builder workLocationId(String workLocationId) {
            this.workLocationId = workLocationId;
            return this;
        }


        /**
         * 社保公积金缴纳地 ID
         * <p> 示例值：dsalndlnasl
         *
         * @param socialSecurityCityId
         * @return
         */
        public Builder socialSecurityCityId(String socialSecurityCityId) {
            this.socialSecurityCityId = socialSecurityCityId;
            return this;
        }


        /**
         * 序列 ID
         * <p> 示例值：bjlsadnas
         *
         * @param jobFamilyId
         * @return
         */
        public Builder jobFamilyId(String jobFamilyId) {
            this.jobFamilyId = jobFamilyId;
            return this;
        }


        /**
         * 职级 ID
         * <p> 示例值：dsadamkdq
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }


        /**
         * 职务 ID
         * <p> 示例值：dsandkjanjnda
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 人员自定义字段
         * <p> 示例值：
         *
         * @param matchingRuleDimension
         * @return
         */
        public Builder matchingRuleDimension(DimensionValue[] matchingRuleDimension) {
            this.matchingRuleDimension = matchingRuleDimension;
            return this;
        }


        public CalculateParam build() {
            return new CalculateParam(this);
        }
    }
}
