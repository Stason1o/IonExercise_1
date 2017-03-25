package com.endava.entity.implementation;

import com.endava.entity.Book;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public final class PureBookImpl extends Book {

    private String bookParameter;

    public PureBookImpl() {
    }


    public PureBookImpl(Book book) {
        this.setPopularity(book.getPopularity());
        this.setPagesQuant(book.getPagesQuant());
        this.setPrice(book.getPrice());
        this.setBookName(book.getBookName());
        this.setAuthorName(book.getAuthorName());
        this.setYear(book.getYear());
        checkBook(book);
    }

    public String getBookParameter() {
        return bookParameter;
    }

    public void setBookParameter(String bookParameter) {
        this.bookParameter = bookParameter;
    }

    public void checkBook(Book book){
        if(book instanceof ClassicBookImpl){
            this.setBookParameter(((ClassicBookImpl) book).getClassicParameter());
        }
        if(book instanceof FictionBookImpl){
            this.setBookParameter(((FictionBookImpl) book).getFantasyParameter());
        }
        if(book instanceof ScienceBookImpl){
            this.setBookParameter(((ScienceBookImpl) book).getScienceParameter());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PureBookImpl pureBookImpl = (PureBookImpl) o;

        return bookParameter.equals(pureBookImpl.bookParameter);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bookParameter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PureBookImpl" + super.toString() +
                ", bookParameter='" + bookParameter + '\'' +
                '}';
    }
}
