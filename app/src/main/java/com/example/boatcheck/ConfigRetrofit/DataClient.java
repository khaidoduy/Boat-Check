package com.example.boatcheck.ConfigRetrofit;

import com.example.boatcheck.Boat;
import com.example.boatcheck.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface DataClient {

    @POST("Signin")
    Call<String> Signin(@Body User user);

    @POST("Signup")
    Call<String> SignUp(@Body User user);

    @FormUrlEncoded
    @POST("LayThongTinUser")
    Call<String> PostUser
            (@Field("IDUser") String idUser);


    @POST("AddBoat")
    Call<String> addBoat
      (@Body Boat boat);

    @FormUrlEncoded
    @POST("ListBoat")
    Call<String> addBoat
            (@Field("idUser") String idUserTau);

    @POST("ChiTieuTau")
    Call<String> trangThaiTau
            (@Field("IdTau") String idTau);
}
