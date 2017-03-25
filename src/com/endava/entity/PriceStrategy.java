package com.endava.entity;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public interface PriceStrategy {
    Book generateSimplePrice(Book book);
    Book generateSpecialPrice(Book book);

}
