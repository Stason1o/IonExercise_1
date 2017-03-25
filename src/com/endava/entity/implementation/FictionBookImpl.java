package com.endava.entity.implementation;

import com.endava.entity.Book;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class FictionBookImpl extends Book {
    private String fantasyParameter;

    public FictionBookImpl() {
    }

    public FictionBookImpl(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String fantasyParameter) {
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

        FictionBookImpl that = (FictionBookImpl) o;

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
        return "FictionBookImpl" + super.toString() +
                ", fantasyParameter='" + fantasyParameter + '\'' +
                '}';
    }
}
