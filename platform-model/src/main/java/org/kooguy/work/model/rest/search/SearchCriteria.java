package org.kooguy.work.model.rest.search;

import org.kooguy.work.model.spi.search.ISearchCriteria;

public class SearchCriteria implements ISearchCriteria {
    /** Search criteria for getting all records */
    public static SearchCriteria
            ALL = new SearchCriteria(1, 0);

    /** Page number to view */
    private Integer pageNumber;

    /** Number of records in a page of results */
    private Integer pageSize;

    public SearchCriteria() {
        this(1, 100);
    }

    public SearchCriteria(Integer pageNumber, Integer pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
