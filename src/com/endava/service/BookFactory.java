package com.endava.service;

import com.endava.entity.enums.BookType;
import com.endava.entity.enums.PriceStrategyType;
import com.endava.entity.implementation.ClassicBookImpl;
import com.endava.entity.implementation.FictionBookImpl;
import com.endava.entity.implementation.PureBookImpl;
import com.endava.entity.implementation.ScienceBookImpl;
import com.endava.entity.Book;
import com.endava.entity.PriceStrategy;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class BookFactory implements PriceStrategy{


    public Book createBook(BookType bookType, PriceStrategyType priceStrategyType,
                               byte popularity,
                               int pagesQuant,
                               double price,
                               String bookName,
                               String authorName,
                               int year,
                               String classicParameter) {
        if(priceStrategyType == PriceStrategyType.NORMAL) {
            if (bookType == BookType.CLASSIC) {
                return generateSimplePrice(new ClassicBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType == BookType.FICTION) {
                return generateSimplePrice(new FictionBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType == BookType.SCIENCE) {
                return generateSimplePrice(new ScienceBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            } else {
                System.out.println("There is no such book. Possible variants: \"Classic Book\", \"Fiction Book\", \"Science Book\"");
                return null;
            }
        }else if(priceStrategyType == PriceStrategyType.SPECIAL){
            if (bookType == BookType.CLASSIC) {
                return generateSpecialPrice(new ClassicBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType == BookType.FICTION) {
                return generateSpecialPrice(new FictionBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            }
            if (bookType == BookType.FICTION) {
                return generateSpecialPrice(new ScienceBookImpl(popularity, pagesQuant, price, bookName, authorName, year, classicParameter));
            } else {
                System.out.println("There is no such book. Possible variants: \"Classic Book\", \"Fiction Book\", \"Science Book\"");
                return null;
            }
        }else {
            System.out.println("There's no such king of price strategy. Available: \"Normal\", \"Special\"");
            return null;
        }
    }

    public PureBookImpl createPureBook(Book book){
        if(book.getPopularity() == 8) {
            book.setPrice(book.getPrice() - book.getPrice() * 0.1);
            return (PureBookImpl) book;
        }else if(book.getPopularity() >= 9){
            book.setPrice(book.getPrice() - book.getPrice() * 0.2);
            return (PureBookImpl) book;
        }else if(book.getPopularity() < 4){
            book.setPrice(book.getPrice() + book.getPopularity() * 0.1);
            return (PureBookImpl) book;
        }else return (PureBookImpl) book;
    }

    @Override
    public Book generateSimplePrice(Book book) {
        if(book.getPopularity() > 9){
            book.setPrice(book.getPrice() * 1.2);
            return book;
        } else if(book.getPopularity() < 4){
            book.setPrice(book.getPrice() - 0.1 * book.getPrice());
            return book;
        }else return book;
    }

    @Override
    public Book generateSpecialPrice(Book book) {
        int chance = (int)Math.random() * 1;
        if(book.getPopularity() > 8 && book.getPopularity() <= 9){
            book.setPrice(book.getPrice() * 1.1);
            return book;
        } else if(book.getPopularity() <= 1 && !(book instanceof FictionBookImpl)){
            if(chance == 0) {
                book.setPrice(book.getPrice() - 0.1 * book.getPrice());
                return book;
            }else {
                book.setPrice(0);
                return book;
            }
        }else return book;
    }

}
