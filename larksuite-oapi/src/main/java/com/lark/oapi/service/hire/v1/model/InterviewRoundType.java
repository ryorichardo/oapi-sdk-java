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

public class InterviewRoundType {
    /**
     * 面试轮次类型 ID
     * <p> 示例值：7012129842917869868
     */
    @SerializedName("id")
    private String id;
    /**
     * 面试轮次类型业务 ID
     * <p> 示例值：7012129842917869868
     */
    @SerializedName("biz_id")
    private String bizId;
    /**
     * 面试轮次类型名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 职位流程类型
     * <p> 示例值：1
     */
    @SerializedName("process_type")
    private Integer processType;
    /**
     * 启用状态
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;
    /**
     * 面试评价表
     * <p> 示例值：
     */
    @SerializedName("interview_assessment_template_info")
    private InterviewRoundTypeAssessmentTemplate interviewAssessmentTemplateInfo;

    // builder 开始
    public InterviewRoundType() {
    }

    public InterviewRoundType(Builder builder) {
        /**
         * 面试轮次类型 ID
         * <p> 示例值：7012129842917869868
         */
        this.id = builder.id;
        /**
         * 面试轮次类型业务 ID
         * <p> 示例值：7012129842917869868
         */
        this.bizId = builder.bizId;
        /**
         * 面试轮次类型名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 职位流程类型
         * <p> 示例值：1
         */
        this.processType = builder.processType;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        this.activeStatus = builder.activeStatus;
        /**
         * 面试评价表
         * <p> 示例值：
         */
        this.interviewAssessmentTemplateInfo = builder.interviewAssessmentTemplateInfo;
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

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Integer getProcessType() {
        return this.processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public Integer getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public InterviewRoundTypeAssessmentTemplate getInterviewAssessmentTemplateInfo() {
        return this.interviewAssessmentTemplateInfo;
    }

    public void setInterviewAssessmentTemplateInfo(InterviewRoundTypeAssessmentTemplate interviewAssessmentTemplateInfo) {
        this.interviewAssessmentTemplateInfo = interviewAssessmentTemplateInfo;
    }

    public static class Builder {
        /**
         * 面试轮次类型 ID
         * <p> 示例值：7012129842917869868
         */
        private String id;
        /**
         * 面试轮次类型业务 ID
         * <p> 示例值：7012129842917869868
         */
        private String bizId;
        /**
         * 面试轮次类型名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 职位流程类型
         * <p> 示例值：1
         */
        private Integer processType;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        private Integer activeStatus;
        /**
         * 面试评价表
         * <p> 示例值：
         */
        private InterviewRoundTypeAssessmentTemplate interviewAssessmentTemplateInfo;

        /**
         * 面试轮次类型 ID
         * <p> 示例值：7012129842917869868
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 面试轮次类型业务 ID
         * <p> 示例值：7012129842917869868
         *
         * @param bizId
         * @return
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }


        /**
         * 面试轮次类型名称
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
         * 职位流程类型
         * <p> 示例值：1
         *
         * @param processType
         * @return
         */
        public Builder processType(Integer processType) {
            this.processType = processType;
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：1
         *
         * @param activeStatus
         * @return
         */
        public Builder activeStatus(Integer activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }


        /**
         * 面试评价表
         * <p> 示例值：
         *
         * @param interviewAssessmentTemplateInfo
         * @return
         */
        public Builder interviewAssessmentTemplateInfo(InterviewRoundTypeAssessmentTemplate interviewAssessmentTemplateInfo) {
            this.interviewAssessmentTemplateInfo = interviewAssessmentTemplateInfo;
            return this;
        }


        public InterviewRoundType build() {
            return new InterviewRoundType(this);
        }
    }
}
