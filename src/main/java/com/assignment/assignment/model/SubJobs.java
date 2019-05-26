package com.assignment.assignment.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class SubJobs {


    private String cricket_discovery;
    private String catalogue_discovery;


    public SubJobs(String cricket_discovery, String catalogue_discovery) {
        this.cricket_discovery = cricket_discovery;
        this.catalogue_discovery = catalogue_discovery;
    }


    public String getCricket_discovery() {
        return cricket_discovery;
    }

    public void setCricket_discovery(String cricket_discovery) {
        this.cricket_discovery = cricket_discovery;
    }

    public String getCatalogue_discovery() {
        return catalogue_discovery;
    }

    public void setCatalogue_discovery(String catalogue_discovery) {
        this.catalogue_discovery = catalogue_discovery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubJobs subjobs = (SubJobs) o;
        return Objects.equals(cricket_discovery, subjobs.cricket_discovery) &&
                Objects.equals(catalogue_discovery, subjobs.catalogue_discovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cricket_discovery, catalogue_discovery);
    }

}
