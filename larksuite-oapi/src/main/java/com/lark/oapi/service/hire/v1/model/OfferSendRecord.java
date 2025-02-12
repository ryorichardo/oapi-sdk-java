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

public class OfferSendRecord {
    /**
     * offer 发送记录 id
     * <p> 示例值：1718959426734
     */
    @SerializedName("offer_send_record_id")
    private String offerSendRecordId;
    /**
     * 操作人 user id
     * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
     */
    @SerializedName("operator_user_id")
    private String operatorUserId;
    /**
     * offer 发送时间
     * <p> 示例值：1718959426734
     */
    @SerializedName("send_time")
    private String sendTime;
    /**
     * offer 状态
     * <p> 示例值：1
     */
    @SerializedName("offer_letter_status")
    private Integer offerLetterStatus;
    /**
     * offer 邮件信息
     * <p> 示例值：
     */
    @SerializedName("email_info")
    private OfferEmailInfo emailInfo;
    /**
     * 跟进记录
     * <p> 示例值：
     */
    @SerializedName("acceptance_list")
    private Acceptance[] acceptanceList;
    /**
     * offer 文件列表
     * <p> 示例值：
     */
    @SerializedName("offer_file_list")
    private OfferFile[] offerFileList;
    /**
     * offer 签署信息
     * <p> 示例值：
     */
    @SerializedName("offer_signature_info")
    private OfferSignatureInfo offerSignatureInfo;

    // builder 开始
    public OfferSendRecord() {
    }

    public OfferSendRecord(Builder builder) {
        /**
         * offer 发送记录 id
         * <p> 示例值：1718959426734
         */
        this.offerSendRecordId = builder.offerSendRecordId;
        /**
         * 操作人 user id
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        this.operatorUserId = builder.operatorUserId;
        /**
         * offer 发送时间
         * <p> 示例值：1718959426734
         */
        this.sendTime = builder.sendTime;
        /**
         * offer 状态
         * <p> 示例值：1
         */
        this.offerLetterStatus = builder.offerLetterStatus;
        /**
         * offer 邮件信息
         * <p> 示例值：
         */
        this.emailInfo = builder.emailInfo;
        /**
         * 跟进记录
         * <p> 示例值：
         */
        this.acceptanceList = builder.acceptanceList;
        /**
         * offer 文件列表
         * <p> 示例值：
         */
        this.offerFileList = builder.offerFileList;
        /**
         * offer 签署信息
         * <p> 示例值：
         */
        this.offerSignatureInfo = builder.offerSignatureInfo;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOfferSendRecordId() {
        return this.offerSendRecordId;
    }

    public void setOfferSendRecordId(String offerSendRecordId) {
        this.offerSendRecordId = offerSendRecordId;
    }

    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public void setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
    }

    public String getSendTime() {
        return this.sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getOfferLetterStatus() {
        return this.offerLetterStatus;
    }

    public void setOfferLetterStatus(Integer offerLetterStatus) {
        this.offerLetterStatus = offerLetterStatus;
    }

    public OfferEmailInfo getEmailInfo() {
        return this.emailInfo;
    }

    public void setEmailInfo(OfferEmailInfo emailInfo) {
        this.emailInfo = emailInfo;
    }

    public Acceptance[] getAcceptanceList() {
        return this.acceptanceList;
    }

    public void setAcceptanceList(Acceptance[] acceptanceList) {
        this.acceptanceList = acceptanceList;
    }

    public OfferFile[] getOfferFileList() {
        return this.offerFileList;
    }

    public void setOfferFileList(OfferFile[] offerFileList) {
        this.offerFileList = offerFileList;
    }

    public OfferSignatureInfo getOfferSignatureInfo() {
        return this.offerSignatureInfo;
    }

    public void setOfferSignatureInfo(OfferSignatureInfo offerSignatureInfo) {
        this.offerSignatureInfo = offerSignatureInfo;
    }

    public static class Builder {
        /**
         * offer 发送记录 id
         * <p> 示例值：1718959426734
         */
        private String offerSendRecordId;
        /**
         * 操作人 user id
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         */
        private String operatorUserId;
        /**
         * offer 发送时间
         * <p> 示例值：1718959426734
         */
        private String sendTime;
        /**
         * offer 状态
         * <p> 示例值：1
         */
        private Integer offerLetterStatus;
        /**
         * offer 邮件信息
         * <p> 示例值：
         */
        private OfferEmailInfo emailInfo;
        /**
         * 跟进记录
         * <p> 示例值：
         */
        private Acceptance[] acceptanceList;
        /**
         * offer 文件列表
         * <p> 示例值：
         */
        private OfferFile[] offerFileList;
        /**
         * offer 签署信息
         * <p> 示例值：
         */
        private OfferSignatureInfo offerSignatureInfo;

        /**
         * offer 发送记录 id
         * <p> 示例值：1718959426734
         *
         * @param offerSendRecordId
         * @return
         */
        public Builder offerSendRecordId(String offerSendRecordId) {
            this.offerSendRecordId = offerSendRecordId;
            return this;
        }


        /**
         * 操作人 user id
         * <p> 示例值：ou_ce613028fe74745421f5dc320bb9c709
         *
         * @param operatorUserId
         * @return
         */
        public Builder operatorUserId(String operatorUserId) {
            this.operatorUserId = operatorUserId;
            return this;
        }


        /**
         * offer 发送时间
         * <p> 示例值：1718959426734
         *
         * @param sendTime
         * @return
         */
        public Builder sendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }


        /**
         * offer 状态
         * <p> 示例值：1
         *
         * @param offerLetterStatus
         * @return
         */
        public Builder offerLetterStatus(Integer offerLetterStatus) {
            this.offerLetterStatus = offerLetterStatus;
            return this;
        }


        /**
         * offer 邮件信息
         * <p> 示例值：
         *
         * @param emailInfo
         * @return
         */
        public Builder emailInfo(OfferEmailInfo emailInfo) {
            this.emailInfo = emailInfo;
            return this;
        }


        /**
         * 跟进记录
         * <p> 示例值：
         *
         * @param acceptanceList
         * @return
         */
        public Builder acceptanceList(Acceptance[] acceptanceList) {
            this.acceptanceList = acceptanceList;
            return this;
        }


        /**
         * offer 文件列表
         * <p> 示例值：
         *
         * @param offerFileList
         * @return
         */
        public Builder offerFileList(OfferFile[] offerFileList) {
            this.offerFileList = offerFileList;
            return this;
        }


        /**
         * offer 签署信息
         * <p> 示例值：
         *
         * @param offerSignatureInfo
         * @return
         */
        public Builder offerSignatureInfo(OfferSignatureInfo offerSignatureInfo) {
            this.offerSignatureInfo = offerSignatureInfo;
            return this;
        }


        public OfferSendRecord build() {
            return new OfferSendRecord(this);
        }
    }
}
