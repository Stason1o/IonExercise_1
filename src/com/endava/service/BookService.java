package com.endava.service;

import com.endava.entity.ClassicBook;
import com.endava.entity.FictionBook;
import com.endava.entity.ScienceBook;
import com.endava.generalclasses.GeneralBook;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class BookService {

    public BookService() {
    }

    public void setPrice(GeneralBook generalBook, double price){
        if(generalBook.getPopularity() > 9){
            generalBook.setPrice(price * 1.2);
        } else if(generalBook.getPopularity() < 4){
            generalBook.setPrice(price - 0.1 * price);
        }
    }

    public GeneralBook validate(GeneralBook generalBook){
        if(generalBook.getPopularity() > 9){
            generalBook.setPrice(generalBook.getPrice() - generalBook.getPrice() * 0.2);
            return generalBook;
        }else if (generalBook.getPopularity() < 4) {
            generalBook.setPrice(generalBook.getPrice() + generalBook.getPrice() * 0.1);
            return generalBook;
        }else return generalBook;
    }

    public ClassicBook createClassicBook(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String classicParameter){
        if(popularity > 9)
            price *= 1.2;
        else if(popularity < 4)
            price -= price * 0.1;
        return new ClassicBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter);
    }

    public FictionBook createFictionBook(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String classicParameter){
        if(popularity > 9)
            price *= 1.2;
        else if(popularity < 4)
            price -= price * 0.1;
        return new FictionBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter);
    }

    public ScienceBook createScienceBook(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String classicParameter){
        if(popularity > 9)
            price *= 1.2;
        else if(popularity < 4)
            price -= price * 0.1;
        return new ScienceBook(popularity, pagesQuant, price, bookName, authorName, year, classicParameter);
    }

    public void setPrice(GeneralBook generalBook, byte popularity, double price){
        if(popularity > 9)
            generalBook.setPrice(price *= 1.2);
        else if(popularity < 4)
            generalBook.setPrice(price * 0.1);
        else
            generalBook.setPrice(price);
    }

    public void setPopularity(GeneralBook generalBook, byte popularity){
        generalBook.setPopularity(popularity);
        if(popularity > 9) {
            generalBook.setPrice(generalBook.getPrice() * 1.2);
        }else if(popularity < 4){
            generalBook.setPrice(generalBook.getPrice() - generalBook.getPrice() * 0.1);
        }
    }

    public double ignorePopularity(byte popularity, double price){
        if(popularity > 9) {
            return price -= price * 0.2;
        } else if(popularity < 4){
            return price += price * 0.1;
        } else return price;
    }
}
