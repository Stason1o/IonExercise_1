package com.endava.entity;

/**
 * Created by sbogdanschi on 20/03/2017.
 */
public abstract class Book {
    protected byte popularity;
    protected int pagesQuant;
    protected double price;
    protected String bookName;
    protected String authorName;
    protected int year;

    public Book() {
    }

    public Book(byte popularity, int pagesQuant, double price, String bookName, String authorName, int year) {
        this.setPopularity(popularity);
        this.setPagesQuant(pagesQuant);
        this.setPrice(price);
        this.setBookName(bookName);
        this.setAuthorName(authorName);
        this.setYear(year);
    }

    public byte getPopularity() {
        return popularity;
    }

    public void setPopularity(byte popularity) {
        this.popularity = popularity;
    }

    public int getPagesQuant() {
        return pagesQuant;
    }

    public void setPagesQuant(int pagesQuant) {
        this.pagesQuant = pagesQuant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        if (popularity != that.popularity) return false;
        if (pagesQuant != that.pagesQuant) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (year != that.year) return false;
        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        if (authorName != null ? !authorName.equals(that.authorName) : that.authorName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) popularity;
        result = 31 * result + pagesQuant;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "popularity=" + popularity +
                ", pagesQuant=" + pagesQuant +
                ", price=" + price +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year;
    }
}
