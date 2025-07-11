package model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "regions")
public class Region {

    @Id
    @Column(name = "region_id")
    private int regionId;

    @Column(name = "region_name")
    private String regionName;

    @CreationTimestamp
    @Column(name = "created_date", updatable = false)
    private LocalDate createdDate;

    @CreationTimestamp
    @Column(name = "created_time", updatable = false)
    private LocalTime createdTime;

    // Constructors
    public Region() {}

    public Region(int regionId, String regionName) {
        this.regionId = regionId;
        this.regionName = regionName;
    }

    // Getters and Setters
    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalTime getCreatedTime() {
        return createdTime;
    }

    // toString()
    @Override
    public String toString() {
        return "Region [regionId=" + regionId +
               ", regionName=" + regionName +
               ", createdDate=" + createdDate +
               ", createdTime=" + createdTime + "]";
    }
}
