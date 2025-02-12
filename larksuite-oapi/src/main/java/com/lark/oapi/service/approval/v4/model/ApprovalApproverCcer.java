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

package com.lark.oapi.service.approval.v4.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.approval.v4.enums.*;
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

public class ApprovalApproverCcer {
    /**
     * 审批/抄送人类型， ; 1. 当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3；;; 2. 当 type 为 Personal 时，需要填写对应的user_id ，用于指定用户；;; 3. 当 approver 为 Free 发起人自选时，不需要指定 user_id 和level；;; 4. ccer不支持 Free 发起人自选
     * <p> 示例值：Supervisor
     */
    @SerializedName("type")
    private String type;
    /**
     * 用户id，根据user_id_type填写
     * <p> 示例值：f7cb567e
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 审批级数，当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3
     * <p> 示例值：3
     */
    @SerializedName("level")
    private String level;

    // builder 开始
    public ApprovalApproverCcer() {
    }

    public ApprovalApproverCcer(Builder builder) {
        /**
         * 审批/抄送人类型， ; 1. 当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3；;; 2. 当 type 为 Personal 时，需要填写对应的user_id ，用于指定用户；;; 3. 当 approver 为 Free 发起人自选时，不需要指定 user_id 和level；;; 4. ccer不支持 Free 发起人自选
         * <p> 示例值：Supervisor
         */
        this.type = builder.type;
        /**
         * 用户id，根据user_id_type填写
         * <p> 示例值：f7cb567e
         */
        this.userId = builder.userId;
        /**
         * 审批级数，当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3
         * <p> 示例值：3
         */
        this.level = builder.level;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public static class Builder {
        /**
         * 审批/抄送人类型， ; 1. 当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3；;; 2. 当 type 为 Personal 时，需要填写对应的user_id ，用于指定用户；;; 3. 当 approver 为 Free 发起人自选时，不需要指定 user_id 和level；;; 4. ccer不支持 Free 发起人自选
         * <p> 示例值：Supervisor
         */
        private String type;
        /**
         * 用户id，根据user_id_type填写
         * <p> 示例值：f7cb567e
         */
        private String userId;
        /**
         * 审批级数，当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3
         * <p> 示例值：3
         */
        private String level;

        /**
         * 审批/抄送人类型， ; 1. 当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3；;; 2. 当 type 为 Personal 时，需要填写对应的user_id ，用于指定用户；;; 3. 当 approver 为 Free 发起人自选时，不需要指定 user_id 和level；;; 4. ccer不支持 Free 发起人自选
         * <p> 示例值：Supervisor
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * 审批/抄送人类型， ; 1. 当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3；;; 2. 当 type 为 Personal 时，需要填写对应的user_id ，用于指定用户；;; 3. 当 approver 为 Free 发起人自选时，不需要指定 user_id 和level；;; 4. ccer不支持 Free 发起人自选
         * <p> 示例值：Supervisor
         *
         * @param type {@link com.lark.oapi.service.approval.v4.enums.ApprovalApproverCcerTypeEnum}
         * @return
         */
        public Builder type(com.lark.oapi.service.approval.v4.enums.ApprovalApproverCcerTypeEnum type) {
            this.type = type.getValue();
            return this;
        }


        /**
         * 用户id，根据user_id_type填写
         * <p> 示例值：f7cb567e
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 审批级数，当 type 为 Supervisor、SupervisorTopDown、DepartmentManager 、DepartmentManagerTopDown 这 4 种时，需要在 level 中填写对应的级数，例如：由下往上三级主管审批，level = 3
         * <p> 示例值：3
         *
         * @param level
         * @return
         */
        public Builder level(String level) {
            this.level = level;
            return this;
        }


        public ApprovalApproverCcer build() {
            return new ApprovalApproverCcer(this);
        }
    }
}
