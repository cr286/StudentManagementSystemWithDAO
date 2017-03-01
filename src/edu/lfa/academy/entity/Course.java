
package edu.lfa.academy.entity;

import java.sql.Date;

/**
 *
 * @author charm_000
 */
public class Course {
    private int id,facilatorId;
    private String name, price, description;
    private Date addedDate, modifiedDate;
    private boolean status;
    Course(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFacilatorId() {
        return facilatorId;
    }

    public void setFacilatorId(int facilatorId) {
        this.facilatorId = facilatorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + ", facilatorId=" + facilatorId + ", name=" + name + ", price=" + price + ", description=" + description + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
    
    
}
