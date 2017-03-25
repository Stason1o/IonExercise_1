package com.endava.entity.implementation;

import com.endava.entity.Book;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class ScienceBookImpl extends Book {
    private String scienceParameter;

    public ScienceBookImpl() {
    }

    public ScienceBookImpl(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String scienceParameter) {
        super(popularity, pagesQuant, price, bookName, authorName, year);
        this.scienceParameter = scienceParameter;
    }

    public String getScienceParameter() {
        return scienceParameter;
    }

    public void setScienceParameter(String scienceParameter) {
        this.scienceParameter = scienceParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ScienceBookImpl that = (ScienceBookImpl) o;

        return scienceParameter.equals(that.scienceParameter);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + scienceParameter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ScienceBookImpl" + super.toString() +
                ", scienceParameter='" + scienceParameter + '\'' +
                '}';
    }
}
