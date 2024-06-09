package com.unialex.products.utils.queries;

public class Queries {
    public static final String GET_MORE_EXPENSIVE = "SELECT name FROM (SELECT name FROM product ORDER BY price DESC) WHERE ROWNUM = 1";
    public static final String GET_MORE_EXPENSIVE_THAN_5000 = "SELECT * FROM product WHERE price > 5000 ORDER BY price ASC";
}
