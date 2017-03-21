package com.endava.entity;

import com.endava.generalclasses.GeneralBook;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class FictionBook extends GeneralBook{
    private String fantasyParameter;

    public FictionBook() {
    }

    public FictionBook(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String fantasyParameter) {
        super(popularity, pagesQuant, price, bookName, authorName, year);
        this.fantasyParameter = fantasyParameter;
    }

    public String getFantasyParameter() {
        return fantasyParameter;
    }

    public void setFantasyParameter(String fantasyParameter) {
        this.fantasyParameter = fantasyParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        FictionBook that = (FictionBook) o;

        return fantasyParameter.equals(that.fantasyParameter);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + fantasyParameter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FictionBook" + super.toString() +
                ", fantasyParameter='" + fantasyParameter + '\'' +
                '}';
    }
}
