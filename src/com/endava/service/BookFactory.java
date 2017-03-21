package com.endava.service;

import com.endava.entity.ClassicBook;
import com.endava.entity.FictionBook;
import com.endava.entity.PureBook;
import com.endava.entity.ScienceBook;
import com.endava.generalclasses.GeneralBook;
import com.endava.generalclasses.PriceStrategy;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class BookFactory implements PriceStrategy{


    public GeneralBook getBook(String bookType,String priceStrategy,
                               byte popularity,
                               int pagesQuant,
                               double price,
                               String bookName,
                               String authorName,
                               int year,
                               String classicParameter) {
        if (bookType == null) {
            return null;
        }
        if(priceStrategy.equalsIgnoreCase("Normal")) {
            if (bookType.equalsIgnoreCase("Classic Book")) {
                return generateSimplePrice(new ClassicBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType.equalsIgnoreCase("Fiction Book")) {
                return generateSimplePrice(new FictionBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType.equalsIgnoreCase("Science Book")) {
                return generateSimplePrice(new ScienceBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            } else {
                System.out.println("There is no such book. Possible variants: \"Classic Book\", \"Fiction Book\", \"Science Book\"");
                return null;
            }
        }else if(priceStrategy.equalsIgnoreCase("Special")){
            if (bookType.equalsIgnoreCase("Classic Book")) {
                return generateSpecialPrice(new ClassicBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType.equalsIgnoreCase("Fiction Book")) {
                return generateSpecialPrice(new FictionBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType.equalsIgnoreCase("Science Book")) {
                return generateSpecialPrice(new ScienceBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            } else {
                System.out.println("There is no such book. Possible variants: \"Classic Book\", \"Fiction Book\", \"Science Book\"");
                return null;
            }
        }else {
            System.out.println("There's no such king of price strategy. Available: \"Normal\", \"Special\"");
            return null;
        }
    }

    public PureBook getBook(PureBook pureBook){
        if(pureBook.getPopularity() == 8) {
            pureBook.setPrice(pureBook.getPrice() - pureBook.getPrice() * 0.1);
            return pureBook;
        }else if(pureBook.getPopularity() >= 9){
            pureBook.setPrice(pureBook.getPrice() - pureBook.getPrice() * 0.2);
            return pureBook;
        }else if(pureBook.getPopularity() < 4){
            pureBook.setPrice(pureBook.getPrice() + pureBook.getPopularity() * 0.1);
            return pureBook;
        }else return pureBook;
    }

    @Override
    public GeneralBook generateSimplePrice(GeneralBook generalBook) {
        if(generalBook.getPopularity() > 9){
            generalBook.setPrice(generalBook.getPrice() * 1.2);
            return generalBook;
        } else if(generalBook.getPopularity() < 4){
            generalBook.setPrice(generalBook.getPrice() - 0.1 * generalBook.getPrice());
            return generalBook;
        }else return generalBook;
    }

    @Override
    public GeneralBook generateSpecialPrice(GeneralBook generalBook) {
        int chance = (int)Math.random() * 1;
        if(generalBook.getPopularity() > 8 && generalBook.getPopularity() <= 9){
            generalBook.setPrice(generalBook.getPrice() * 1.1);
            return generalBook;
        } else if(generalBook.getPopularity() <= 1 && !(generalBook instanceof FictionBook)){
            if(chance == 0) {
                generalBook.setPrice(generalBook.getPrice() - 0.1 * generalBook.getPrice());
                return generalBook;
            }else {
                generalBook.setPrice(0);
                return generalBook;
            }
        }else return generalBook;
    }

}
