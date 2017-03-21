package com.endava.entity;

import com.endava.generalclasses.GeneralBook;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public final class PureBook extends GeneralBook{

    private String bookParameter;

    public PureBook() {
    }


    public PureBook(GeneralBook generalBook) {
        this.setPopularity(generalBook.getPopularity());
        this.setPagesQuant(generalBook.getPagesQuant());
        this.setPrice(generalBook.getPrice());
        this.setBookName(generalBook.getBookName());
        this.setAuthorName(generalBook.getAuthorName());
        this.setYear(generalBook.getYear());
        checkBook(generalBook);
    }

    public String getBookParameter() {
        return bookParameter;
    }

    public void setBookParameter(String bookParameter) {
        this.bookParameter = bookParameter;
    }

    public void checkBook(GeneralBook generalBook){
        if(generalBook instanceof ClassicBook){
            this.setBookParameter(((ClassicBook) generalBook).getClassicParameter());
        }
        if(generalBook instanceof FictionBook){
            this.setBookParameter(((FictionBook) generalBook).getFantasyParameter());
        }
        if(generalBook instanceof ScienceBook){
            this.setBookParameter(((ScienceBook) generalBook).getScienceParameter());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PureBook pureBook = (PureBook) o;

        return bookParameter.equals(pureBook.bookParameter);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + bookParameter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PureBook" + super.toString() +
                ", bookParameter='" + bookParameter + '\'' +
                '}';
    }
}
