package com.endava.entity;

import com.endava.generalclasses.GeneralBook;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public class ClassicBook extends GeneralBook{
    private String classicParameter;

    public ClassicBook() {
    }

    public ClassicBook(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year, String classicParameter) {
        super(popularity, pagesQuant, price, bookName, authorName, year);
        this.classicParameter = classicParameter;
    }

    public String getClassicParameter() {
        return classicParameter;
    }

    public void setClassicParameter(String classicParameter) {
        this.classicParameter = classicParameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ClassicBook that = (ClassicBook) o;

        return classicParameter.equals(that.classicParameter);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + classicParameter.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ClassicBook" + super.toString() +
                "classicParameter='" + classicParameter + '\'' +
                '}';
    }
}
