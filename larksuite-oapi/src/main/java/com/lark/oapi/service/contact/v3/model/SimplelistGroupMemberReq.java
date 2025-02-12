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

package com.lark.oapi.service.contact.v3.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.contact.v3.enums.*;
import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lark.oapi.core.utils.Strings;
import com.lark.oapi.core.response.BaseResponse;

public class SimplelistGroupMemberReq {
    /**
     * 分页大小
     * <p> 示例值：50
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
     * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;
    /**
     * 欲获取成员ID类型。;当member_type=user时候，member_id_type表示user_id_type，枚举值open_id, union_id和user_id。;当member_type=department时候，member_id_type表示department_id_type，枚举值open_id和department_id。
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("member_id_type")
    private String memberIdType;
    /**
     * 欲获取的用户组成员类型。
     * <p> 示例值：user
     */
    @Query
    @SerializedName("member_type")
    private String memberType;
    /**
     * 用户组ID
     * <p> 示例值：g128187
     */
    @Path
    @SerializedName("group_id")
    private String groupId;

    // builder 开始
    public SimplelistGroupMemberReq() {
    }

    public SimplelistGroupMemberReq(Builder builder) {
        /**
         * 分页大小
         * <p> 示例值：50
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
         */
        this.pageToken = builder.pageToken;
        /**
         * 欲获取成员ID类型。;当member_type=user时候，member_id_type表示user_id_type，枚举值open_id, union_id和user_id。;当member_type=department时候，member_id_type表示department_id_type，枚举值open_id和department_id。
         * <p> 示例值：open_id
         */
        this.memberIdType = builder.memberIdType;
        /**
         * 欲获取的用户组成员类型。
         * <p> 示例值：user
         */
        this.memberType = builder.memberType;
        /**
         * 用户组ID
         * <p> 示例值：g128187
         */
        this.groupId = builder.groupId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public String getMemberIdType() {
        return this.memberIdType;
    }

    public void setMemberIdType(String memberIdType) {
        this.memberIdType = memberIdType;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getGroupId() {
        return this.groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public static class Builder {
        private Integer pageSize; // 分页大小
        private String pageToken; // 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
        private String memberIdType; // 欲获取成员ID类型。;当member_type=user时候，member_id_type表示user_id_type，枚举值open_id, union_id和user_id。;当member_type=department时候，member_id_type表示department_id_type，枚举值open_id和department_id。
        private String memberType; // 欲获取的用户组成员类型。
        private String groupId; // 用户组ID

        /**
         * 分页大小
         * <p> 示例值：50
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 分页标记，第一次请求不填，表示从头开始遍历；分页查询结果还有更多项时会同时返回新的 page_token，下次遍历可采用该 page_token 获取查询结果
         * <p> 示例值：AQD9/Rn9eij9Pm39ED40/dk53s4Ebp882DYfFaPFbz00L4CMZJrqGdzNyc8BcZtDbwVUvRmQTvyMYicnGWrde9X56TgdBuS+JKiSIkdexPw=
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        /**
         * 欲获取成员ID类型。;当member_type=user时候，member_id_type表示user_id_type，枚举值open_id, union_id和user_id。;当member_type=department时候，member_id_type表示department_id_type，枚举值open_id和department_id。
         * <p> 示例值：open_id
         *
         * @param memberIdType
         * @return
         */
        public Builder memberIdType(String memberIdType) {
            this.memberIdType = memberIdType;
            return this;
        }

        /**
         * 欲获取成员ID类型。;当member_type=user时候，member_id_type表示user_id_type，枚举值open_id, union_id和user_id。;当member_type=department时候，member_id_type表示department_id_type，枚举值open_id和department_id。
         * <p> 示例值：open_id
         *
         * @param memberIdType {@link com.lark.oapi.service.contact.v3.enums.SimplelistGroupMemberMemberIdTypeEnum}
         * @return
         */
        public Builder memberIdType(com.lark.oapi.service.contact.v3.enums.SimplelistGroupMemberMemberIdTypeEnum memberIdType) {
            this.memberIdType = memberIdType.getValue();
            return this;
        }

        /**
         * 欲获取的用户组成员类型。
         * <p> 示例值：user
         *
         * @param memberType
         * @return
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        /**
         * 欲获取的用户组成员类型。
         * <p> 示例值：user
         *
         * @param memberType {@link com.lark.oapi.service.contact.v3.enums.SimplelistGroupMemberMemberTypeEnum}
         * @return
         */
        public Builder memberType(com.lark.oapi.service.contact.v3.enums.SimplelistGroupMemberMemberTypeEnum memberType) {
            this.memberType = memberType.getValue();
            return this;
        }

        /**
         * 用户组ID
         * <p> 示例值：g128187
         *
         * @param groupId
         * @return
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public SimplelistGroupMemberReq build() {
            return new SimplelistGroupMemberReq(this);
        }
    }
}
