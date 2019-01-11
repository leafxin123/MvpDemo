package com.wenjie.api;

import com.wenjie.entity.New;
import com.wenjie.entity.Token;
import com.wenjie.entity.Topic;
import com.wenjie.entity.UserDetail;
import java.util.List;
import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * ProjectName: MvpDemo
 * PackageName com.wenjie.api
 * Author: wenjie
 * Date: 2019-01-11 12:18
 * Description:
 */
public interface UserService {
    /**
     * 获取 Token (一般在登录时调用)
     *
     * @param client_id     客户端 id
     * @param client_secret 客户端私钥
     * @param grant_type    授权方式 - 密码
     * @param username      用户名
     * @param password      密码
     * @return Token 实体类
     */
    @POST("https://www.diycode.cc/oauth/token")
    @FormUrlEncoded
    Observable<Response<Token>> getToken(
            @Field("client_id") String client_id, @Field("client_secret") String client_secret,
            @Field("grant_type") String grant_type, @Field("username") String username,
            @Field("password") String password);



    /**
     * 获取当前登录者的详细资料
     *
     * @return 用户详情
     */
    @GET("users/me.json")
    Observable<Response<UserDetail>> getMe();

}
