package com.example.boatcheck.ConfigRetrofit;

/**
 * Class intial send data to server and reposene data from a server
 */
public class APIUtils {
    public static final String Base_Url="http://192.168.1.8:8080/Doan/public/";
    public  static DataClient getData()  {

        return RetrofitClient.getClient(Base_Url).create(DataClient.class);
    }
}
