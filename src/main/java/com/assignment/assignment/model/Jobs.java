package com.assignment.assignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document(collection = "jobs")
public class Jobs {

    @Id
    private String id;

    private String asset_id;
    private String description;

    private List<SubJobs> subJobs;


    public Jobs(String asset_id, String description, List<SubJobs> subJobs) {
        this.asset_id = asset_id;
        this.description = description;
        this.subJobs = subJobs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SubJobs> getSubjobs() {
        return subJobs;
    }

    public void setSubjobs(List<SubJobs> subjobs) {
        this.subJobs = subjobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jobs jobs = (Jobs) o;
        return Objects.equals(id, jobs.id) &&
                Objects.equals(asset_id, jobs.asset_id) &&
                Objects.equals(description, jobs.description) &&
                Objects.equals(subJobs, jobs.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, asset_id, description, subJobs);
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "id=" + id +
                ", asset_id='" + asset_id + '\'' +
                ", description='" + description + '\'' +
                ", subjobs=" + subJobs +
                '}';
    }
}
