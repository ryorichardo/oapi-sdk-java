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

package com.lark.oapi.service.document_ai.v1.model;

import com.lark.oapi.core.response.EmptyData;
import com.lark.oapi.service.document_ai.v1.enums.*;
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

public class DocChunkTableDetail {
    /**
     * 全文的第n个表格
     * <p> 示例值：1
     */
    @SerializedName("table_idx")
    private Integer tableIdx;
    /**
     * 表格的所有文字内容，'\t\n'代表换行，'\t'代表新单元格
     * <p> 示例值：Code\tExecutable\tAST Matching\...
     */
    @SerializedName("text")
    private String text;
    /**
     * 表格中全部cell的数据
     * <p> 示例值：
     */
    @SerializedName("cells")
    private DocChunkTableRow[] cells;

    // builder 开始
    public DocChunkTableDetail() {
    }

    public DocChunkTableDetail(Builder builder) {
        /**
         * 全文的第n个表格
         * <p> 示例值：1
         */
        this.tableIdx = builder.tableIdx;
        /**
         * 表格的所有文字内容，'\t\n'代表换行，'\t'代表新单元格
         * <p> 示例值：Code\tExecutable\tAST Matching\...
         */
        this.text = builder.text;
        /**
         * 表格中全部cell的数据
         * <p> 示例值：
         */
        this.cells = builder.cells;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getTableIdx() {
        return this.tableIdx;
    }

    public void setTableIdx(Integer tableIdx) {
        this.tableIdx = tableIdx;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DocChunkTableRow[] getCells() {
        return this.cells;
    }

    public void setCells(DocChunkTableRow[] cells) {
        this.cells = cells;
    }

    public static class Builder {
        /**
         * 全文的第n个表格
         * <p> 示例值：1
         */
        private Integer tableIdx;
        /**
         * 表格的所有文字内容，'\t\n'代表换行，'\t'代表新单元格
         * <p> 示例值：Code\tExecutable\tAST Matching\...
         */
        private String text;
        /**
         * 表格中全部cell的数据
         * <p> 示例值：
         */
        private DocChunkTableRow[] cells;

        /**
         * 全文的第n个表格
         * <p> 示例值：1
         *
         * @param tableIdx
         * @return
         */
        public Builder tableIdx(Integer tableIdx) {
            this.tableIdx = tableIdx;
            return this;
        }


        /**
         * 表格的所有文字内容，'\t\n'代表换行，'\t'代表新单元格
         * <p> 示例值：Code\tExecutable\tAST Matching\...
         *
         * @param text
         * @return
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }


        /**
         * 表格中全部cell的数据
         * <p> 示例值：
         *
         * @param cells
         * @return
         */
        public Builder cells(DocChunkTableRow[] cells) {
            this.cells = cells;
            return this;
        }


        public DocChunkTableDetail build() {
            return new DocChunkTableDetail(this);
        }
    }
}
