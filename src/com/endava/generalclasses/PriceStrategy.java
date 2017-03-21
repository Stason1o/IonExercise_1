package com.endava.generalclasses;

import com.endava.entity.FictionBook;

/**
 * Created by sbogdanschi on 21/03/2017.
 */
public interface PriceStrategy {
    GeneralBook generateSimplePrice(GeneralBook generalBook);
    GeneralBook generateSpecialPrice(GeneralBook generalBook);

}
