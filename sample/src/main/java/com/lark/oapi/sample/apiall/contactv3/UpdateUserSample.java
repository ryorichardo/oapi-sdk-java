package com.lark.oapi.sample.apiall.contactv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.contact.v3.model.*;

import java.util.HashMap;

// PUT /open-apis/contact/v3/users/:user_id
public class UpdateUserSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        UpdateUserReq req = UpdateUserReq.newBuilder()
                .userId("ou_7dab8a3d3cdcc9da365777c7ad535d62")
                .userIdType("open_id")
                .departmentIdType("open_department_id")
                .user(User.newBuilder()
                        .name("张三")
                        .enName("San Zhang")
                        .nickname("Alex Zhang")
                        .email("zhangsan@gmail.com")
                        .mobile("+41446681800")
                        .mobileVisible(false)
                        .gender(0)
                        .avatarKey("2500c7a9-5fff-4d9a-a2de-3d59614ae28g")
                        .departmentIds(new String[]{})
                        .leaderUserId("ou_7dab8a3d3cdcc9da365777c7ad535d62")
                        .city("杭州")
                        .country("CN")
                        .workStation("北楼-H34")
                        .joinTime(2147483647)
                        .employeeNo("1")
                        .employeeType(1)
                        .orders(new UserOrder[]{})
                        .customAttrs(new UserCustomAttr[]{})
                        .enterpriseEmail("demo@mail.com")
                        .jobTitle("xxxxx")
                        .isFrozen(false)
                        .build())
                .build();

        // 发起请求
        UpdateUserResp resp = client.contact().v3().user().update(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
