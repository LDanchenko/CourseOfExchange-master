package com.ldv.courseofexchange.rest;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class RestClient {

    public static final String BASE_URL = "https://api.privatbank.ua/p24api/"; //доменное имя сервера
    private PrivatBankApi privatBankApi; //создаем обьект интерфейса - запрос

    //в конструкторе нужно сконфигурировать ретрофит
    public RestClient() {

        //конфигурируем логин интерсептор (перехватчик)
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        //конфигурируем хттп клиент
        OkHttpClient okHttpClient = new OkHttpClient.Builder() //чтоб при каждом запросе видить логи!
                .addInterceptor(logging)
                .build();

        //конфигурируем ретрофит
        Retrofit retrofit = new Retrofit.Builder()//в билдер ретрофита передаем
                .baseUrl(BASE_URL)//адрес сервера по которому будем формироваться запрос
                .client(okHttpClient)//передали логининтерсептор
                .addConverterFactory(GsonConverterFactory.create())//мост который говорить gson распарсить json на модель
                .build();


        privatBankApi = retrofit.create(PrivatBankApi.class); //запрос связали с ретрофитом
    }

    public PrivatBankApi getPrivatBankApi() {
        return privatBankApi;
    }
}
