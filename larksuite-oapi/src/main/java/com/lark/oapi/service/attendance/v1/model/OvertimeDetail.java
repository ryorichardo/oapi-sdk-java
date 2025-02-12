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

package com.lark.oapi.service.attendance.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.attendance.v1.enums.*;
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

public class OvertimeDetail {
    /**
     * 加班明细ID
     * <p> 示例值：1
     */
    @SerializedName("id")
    private String id;
    /**
     * 加班明细用户ID(根据date_type_id)
     * <p> 示例值：7271137794704015379
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 加班开始时间格式（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
     * <p> 示例值：2006-01-02 00:00:00
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 加班结束时间（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
     * <p> 示例值：2006-01-02 00:00:00
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 加班时长，两位小数
     * <p> 示例值：0.5
     */
    @SerializedName("duration")
    private String duration;
    /**
     * 加班单位
     * <p> 示例值：1
     */
    @SerializedName("unit")
    private Integer unit;
    /**
     * 日期类型
     * <p> 示例值：1
     */
    @SerializedName("date_type")
    private Integer dateType;
    /**
     * 结算方式
     * <p> 示例值：1
     */
    @SerializedName("settle_type")
    private Integer settleType;
    /**
     * 生效时间时间戳
     * <p> 示例值：1694592064
     */
    @SerializedName("effective_time")
    private String effectiveTime;
    /**
     * 流程开始时间戳
     * <p> 示例值：1694592064
     */
    @SerializedName("progress_start_time")
    private String progressStartTime;
    /**
     * 加班日期
     * <p> 示例值：2006-01-02
     */
    @SerializedName("date")
    private String date;
    /**
     * 数据更新时间
     * <p> 示例值：2023-12-31
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 是否是综合工时产生的加班明细
     * <p> 示例值：false
     */
    @SerializedName("is_time_bank")
    private Boolean isTimeBank;
    /**
     * 加班明细对应的审批单ID，如果为空代表改加班明细不是审批转入的
     * <p> 示例值：1234
     */
    @SerializedName("instance_id")
    private String instanceId;

    // builder 开始
    public OvertimeDetail() {
    }

    public OvertimeDetail(Builder builder) {
        /**
         * 加班明细ID
         * <p> 示例值：1
         */
        this.id = builder.id;
        /**
         * 加班明细用户ID(根据date_type_id)
         * <p> 示例值：7271137794704015379
         */
        this.userId = builder.userId;
        /**
         * 加班开始时间格式（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         */
        this.startTime = builder.startTime;
        /**
         * 加班结束时间（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         */
        this.endTime = builder.endTime;
        /**
         * 加班时长，两位小数
         * <p> 示例值：0.5
         */
        this.duration = builder.duration;
        /**
         * 加班单位
         * <p> 示例值：1
         */
        this.unit = builder.unit;
        /**
         * 日期类型
         * <p> 示例值：1
         */
        this.dateType = builder.dateType;
        /**
         * 结算方式
         * <p> 示例值：1
         */
        this.settleType = builder.settleType;
        /**
         * 生效时间时间戳
         * <p> 示例值：1694592064
         */
        this.effectiveTime = builder.effectiveTime;
        /**
         * 流程开始时间戳
         * <p> 示例值：1694592064
         */
        this.progressStartTime = builder.progressStartTime;
        /**
         * 加班日期
         * <p> 示例值：2006-01-02
         */
        this.date = builder.date;
        /**
         * 数据更新时间
         * <p> 示例值：2023-12-31
         */
        this.updateTime = builder.updateTime;
        /**
         * 是否是综合工时产生的加班明细
         * <p> 示例值：false
         */
        this.isTimeBank = builder.isTimeBank;
        /**
         * 加班明细对应的审批单ID，如果为空代表改加班明细不是审批转入的
         * <p> 示例值：1234
         */
        this.instanceId = builder.instanceId;
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

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Integer getDateType() {
        return this.dateType;
    }

    public void setDateType(Integer dateType) {
        this.dateType = dateType;
    }

    public Integer getSettleType() {
        return this.settleType;
    }

    public void setSettleType(Integer settleType) {
        this.settleType = settleType;
    }

    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getProgressStartTime() {
        return this.progressStartTime;
    }

    public void setProgressStartTime(String progressStartTime) {
        this.progressStartTime = progressStartTime;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsTimeBank() {
        return this.isTimeBank;
    }

    public void setIsTimeBank(Boolean isTimeBank) {
        this.isTimeBank = isTimeBank;
    }

    public String getInstanceId() {
        return this.instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public static class Builder {
        /**
         * 加班明细ID
         * <p> 示例值：1
         */
        private String id;
        /**
         * 加班明细用户ID(根据date_type_id)
         * <p> 示例值：7271137794704015379
         */
        private String userId;
        /**
         * 加班开始时间格式（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         */
        private String startTime;
        /**
         * 加班结束时间（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         */
        private String endTime;
        /**
         * 加班时长，两位小数
         * <p> 示例值：0.5
         */
        private String duration;
        /**
         * 加班单位
         * <p> 示例值：1
         */
        private Integer unit;
        /**
         * 日期类型
         * <p> 示例值：1
         */
        private Integer dateType;
        /**
         * 结算方式
         * <p> 示例值：1
         */
        private Integer settleType;
        /**
         * 生效时间时间戳
         * <p> 示例值：1694592064
         */
        private String effectiveTime;
        /**
         * 流程开始时间戳
         * <p> 示例值：1694592064
         */
        private String progressStartTime;
        /**
         * 加班日期
         * <p> 示例值：2006-01-02
         */
        private String date;
        /**
         * 数据更新时间
         * <p> 示例值：2023-12-31
         */
        private String updateTime;
        /**
         * 是否是综合工时产生的加班明细
         * <p> 示例值：false
         */
        private Boolean isTimeBank;
        /**
         * 加班明细对应的审批单ID，如果为空代表改加班明细不是审批转入的
         * <p> 示例值：1234
         */
        private String instanceId;

        /**
         * 加班明细ID
         * <p> 示例值：1
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 加班明细用户ID(根据date_type_id)
         * <p> 示例值：7271137794704015379
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 加班开始时间格式（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 加班结束时间（2006-01-02 00:00:00,无时区信息，参照时区是提交时候的时区）
         * <p> 示例值：2006-01-02 00:00:00
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 加班时长，两位小数
         * <p> 示例值：0.5
         *
         * @param duration
         * @return
         */
        public Builder duration(String duration) {
            this.duration = duration;
            return this;
        }


        /**
         * 加班单位
         * <p> 示例值：1
         *
         * @param unit
         * @return
         */
        public Builder unit(Integer unit) {
            this.unit = unit;
            return this;
        }

        /**
         * 加班单位
         * <p> 示例值：1
         *
         * @param unit {@link com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeUnitEnum}
         * @return
         */
        public Builder unit(com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeUnitEnum unit) {
            this.unit = unit.getValue();
            return this;
        }


        /**
         * 日期类型
         * <p> 示例值：1
         *
         * @param dateType
         * @return
         */
        public Builder dateType(Integer dateType) {
            this.dateType = dateType;
            return this;
        }

        /**
         * 日期类型
         * <p> 示例值：1
         *
         * @param dateType {@link com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeDateTypeEnum}
         * @return
         */
        public Builder dateType(com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeDateTypeEnum dateType) {
            this.dateType = dateType.getValue();
            return this;
        }


        /**
         * 结算方式
         * <p> 示例值：1
         *
         * @param settleType
         * @return
         */
        public Builder settleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }

        /**
         * 结算方式
         * <p> 示例值：1
         *
         * @param settleType {@link com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeSettleTypeEnum}
         * @return
         */
        public Builder settleType(com.lark.oapi.service.attendance.v1.enums.OvertimeDetailOvertimeSettleTypeEnum settleType) {
            this.settleType = settleType.getValue();
            return this;
        }


        /**
         * 生效时间时间戳
         * <p> 示例值：1694592064
         *
         * @param effectiveTime
         * @return
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }


        /**
         * 流程开始时间戳
         * <p> 示例值：1694592064
         *
         * @param progressStartTime
         * @return
         */
        public Builder progressStartTime(String progressStartTime) {
            this.progressStartTime = progressStartTime;
            return this;
        }


        /**
         * 加班日期
         * <p> 示例值：2006-01-02
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 数据更新时间
         * <p> 示例值：2023-12-31
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 是否是综合工时产生的加班明细
         * <p> 示例值：false
         *
         * @param isTimeBank
         * @return
         */
        public Builder isTimeBank(Boolean isTimeBank) {
            this.isTimeBank = isTimeBank;
            return this;
        }


        /**
         * 加班明细对应的审批单ID，如果为空代表改加班明细不是审批转入的
         * <p> 示例值：1234
         *
         * @param instanceId
         * @return
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }


        public OvertimeDetail build() {
            return new OvertimeDetail(this);
        }
    }
}
