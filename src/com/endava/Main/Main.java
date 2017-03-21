package com.endava.Main;

import com.endava.entity.ClassicBook;
import com.endava.entity.FictionBook;
import com.endava.entity.PureBook;
import com.endava.entity.ScienceBook;
import com.endava.generalclasses.GeneralBook;
import com.endava.service.BookFactory;
import com.endava.service.BookService;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class Main {
    public static void main(String[] args) {
//        ClassicBook classicBook = new ClassicBook((byte)9, 300, 20.8, "Checkers", "Pablo Picasso", 2017, "VERY UNINTERESTING BOOK");
//        FictionBook fictionBook = new FictionBook((byte)5, 250, 11.5, "Hobbies", "Maniac", 2006, "TIRED");
        //ScienceBook scienceBook = new ScienceBook((byte)10, 400, 14.2, "War and Piece", "");

        BookService bookService = new BookService();
        bookService.createClassicBook((byte)9, 300, 20.8, "Checkers", "Pablo Picasso", 2017, "VERY UNINTERESTING BOOK");

        BookFactory bookFactory = new BookFactory();
        GeneralBook classicBook = bookFactory.getBook("Classic Book", "normal", (byte)9, 300, 20.8, "Checkers", "Pablo Picasso", 2017, "VERY UNINTERESTING BOOK");
        GeneralBook fictionBook = bookFactory.getBook("Fiction Book", "special", (byte)5, 250, 11.5, "Hobbies", "Maniac", 2006, "TIRED");
        GeneralBook scienceBook = bookFactory.getBook("Science Book", "normal", (byte)10, 400, 14.2, "War and Piece", "Hoobit", 1967, "Pretty Good");
        GeneralBook pureBook = bookFactory.getBook(new PureBook(classicBook));

        System.out.println(classicBook);
        System.out.println(fictionBook);
        System.out.println(scienceBook);
        System.out.println(pureBook);
    }
}
