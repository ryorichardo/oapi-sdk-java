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

package com.lark.oapi.service.mail.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.mail.v1.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class ListPublicMailboxMemberReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
     * <p> 示例值：xxx
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 分页大小
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * The unique ID or email address of a public mailbox
     * <p> 示例值：xxxxxxxxxxxxxxx or test_public_mailbox@xxx.xx
     */
    @Path
    @SerializedName("public_mailbox_id")
    private String publicMailboxId;

    // builder 开始
    public ListPublicMailboxMemberReq() {
    }

    public ListPublicMailboxMemberReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
         * <p> 示例值：xxx
         */
        this.pageToken = builder.pageToken;
        /**
         * 分页大小
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * The unique ID or email address of a public mailbox
         * <p> 示例值：xxxxxxxxxxxxxxx or test_public_mailbox@xxx.xx
         */
        this.publicMailboxId = builder.publicMailboxId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPublicMailboxId() {
        return this.publicMailboxId;
    }

    public void setPublicMailboxId(String publicMailboxId) {
        this.publicMailboxId = publicMailboxId;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
        private Integer pageSize; // 分页大小
        private String publicMailboxId; // The unique ID or email address of a public mailbox

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.mail.v1.enums.ListPublicMailboxMemberUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.mail.v1.enums.ListPublicMailboxMemberUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该page_token 获取查询结果
         * <p> 示例值：xxx
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 分页大小
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The unique ID or email address of a public mailbox
         * <p> 示例值：xxxxxxxxxxxxxxx or test_public_mailbox@xxx.xx
         *
         * @param publicMailboxId
         * @return
         */
        public Builder publicMailboxId(String publicMailboxId) {
            this.publicMailboxId = publicMailboxId;
            return this;
        }

        public ListPublicMailboxMemberReq build() {
            return new ListPublicMailboxMemberReq(this);
        }
    }
}
