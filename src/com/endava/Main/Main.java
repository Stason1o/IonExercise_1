package com.endava.Main;

import com.endava.entity.enums.BookType;
import com.endava.entity.enums.PriceStrategyType;
import com.endava.entity.implementation.PureBookImpl;
import com.endava.entity.Book;
import com.endava.service.BookFactory;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class Main {
    public static void main(String[] args) {
//        ClassicBookImpl classicBook = new ClassicBookImpl((byte)9, 300, 20.8, "Checkers", "Pablo Picasso", 2017, "VERY UNINTERESTING BOOK");
//        FictionBookImpl fictionBook = new FictionBookImpl((byte)5, 250, 11.5, "Hobbies", "Maniac", 2006, "TIRED");
        //ScienceBookImpl scienceBook = new ScienceBookImpl((byte)10, 400, 14.2, "War and Piece", "");

        BookFactory bookFactory = new BookFactory();
        Book classicBook = bookFactory.createBook(BookType.CLASSIC, PriceStrategyType.NORMAL, (byte)9, 300, 20.8, "Checkers", "Pablo Picasso", 2017, "VERY UNINTERESTING BOOK");
        Book fictionBook = bookFactory.createBook(BookType.FICTION, PriceStrategyType.SPECIAL, (byte)5, 250, 11.5, "Hobbies", "Maniac", 2006, "TIRED");
        Book scienceBook = bookFactory.createBook(BookType.SCIENCE, PriceStrategyType.NORMAL, (byte)10, 400, 14.2, "War and Piece", "Hoobit", 1967, "Pretty Good");
        Book pureBook = bookFactory.createPureBook(new PureBookImpl(classicBook));

        System.out.println(classicBook);
        System.out.println(fictionBook);
        System.out.println(scienceBook);
        System.out.println(pureBook);
    }
}
