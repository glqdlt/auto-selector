package com.glqdlt.example.autoselectquery;

public class Pagrequest {
    private Integer limitSize;
    private Integer pageNumber;

    public Integer getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getOffset() {
        return getPageNumber() * getLimitSize();
    }
}
