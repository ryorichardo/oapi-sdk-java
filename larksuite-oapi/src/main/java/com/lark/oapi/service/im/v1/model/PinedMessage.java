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

package com.lark.oapi.service.im.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.im.v1.enums.*;
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

public class PinedMessage {
    /**
     * Pin的操作信息
     * <p> 示例值：
     */
    @SerializedName("pin")
    private Pin pin;
    /**
     * 被Pin的消息实体
     * <p> 示例值：
     */
    @SerializedName("message")
    private Message message;

    // builder 开始
    public PinedMessage() {
    }

    public PinedMessage(Builder builder) {
        /**
         * Pin的操作信息
         * <p> 示例值：
         */
        this.pin = builder.pin;
        /**
         * 被Pin的消息实体
         * <p> 示例值：
         */
        this.message = builder.message;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Pin getPin() {
        return this.pin;
    }

    public void setPin(Pin pin) {
        this.pin = pin;
    }

    public Message getMessage() {
        return this.message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public static class Builder {
        /**
         * Pin的操作信息
         * <p> 示例值：
         */
        private Pin pin;
        /**
         * 被Pin的消息实体
         * <p> 示例值：
         */
        private Message message;

        /**
         * Pin的操作信息
         * <p> 示例值：
         *
         * @param pin
         * @return
         */
        public Builder pin(Pin pin) {
            this.pin = pin;
            return this;
        }


        /**
         * 被Pin的消息实体
         * <p> 示例值：
         *
         * @param message
         * @return
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }


        public PinedMessage build() {
            return new PinedMessage(this);
        }
    }
}
