package com.semih.monolithicarchitecture.constants;

public class Urls {
    //1. step versioning
    //http://localhost:9090/sb01
    public static final String VERSION = "/sb01";

    //2. step module
    //http://localhost:9090/sb01/web/
    //http://localhost:9090/sb01/api
    public static final String WEB = "/web";
    public static final String API = "/api";

    //3. step controller
    //http://localhost:9090/sb01/web/sales
    //http://localhost:9090/sb01/api/sales
    public static final String CLIENT = "/client";
    public static final String PRODUCT = "/product";
    public static final String SALES = "/sales";
    public static final String INFORMATION = "/information";

    //4. step methods
    //http://localhost:9090/sb01/web/sales/save
    //http://localhost:9090/sb01/api/sales/save

    public static final String INDEX = "/index";
    public static final String SAVE = "/save";
    public static final String UPDATE = "/update";
    public static final String GET_ALL = "/getAll";
    public static final String DELETE = "/delete";
    public static final String SAVE_ALL = "/saveAll";

    public static final String FIND_ALL = "/findAll";
    public static final String FIND_BY_ID = "/findById";

    /**
     * API --> Client Controller
     */
    public static final String GET_ALL_BY_ADDRESS = "/getallbyaddress";
    public static final String GET_ALL_BY_NAME = "/getallbyname";
    public static final String GET_ALL_BY_NAME_AND_ADDRESS = "/getallbynameandaddress";
    public static final String GET_ALL_BY_CREATED_DATE = "/getallbycreateddate";
    public static final String GET_OPTIONAL_BY_NAME = "/getoptionalbyname";
    /**
     * API --> Product Controller
     */
    public static final String SAVE_PARAM = "/saveparam";
    public static final String SAVE_PARAM_DTO = "/saveparamdto";
    /**
     * API --> Information Controller
     */
    public static final String INFO = "/info";
    public static final String DESCRIPTION = "/description";
}
