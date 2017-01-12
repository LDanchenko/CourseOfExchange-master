package com.ldv.courseofexchange.rest;

import com.ldv.courseofexchange.rest.models.PrivatBankCourse;

import java.util.List;

import retrofit2.Call;

/**
 * Created by user on 28.11.2016.
 */

public class RestService {
    private static final String REGISTER_FLAG = "1";
    private RestClient restClient;//инстанс класса, который отвечает за домен,там где все связано

    public RestService() {
        restClient = new RestClient(); //тут инициализируем этот инстанст,потому что private
    }

    public Call<List<PrivatBankCourse>> privatBankCurrentCourse() { //IOEXception - чтоб не было трай кеч
        return restClient.getPrivatBankApi()
                .getPrivatCurrentCourse();
    }

}
