package org.pdrake.starbucksbackend.entity;

public class Users {
    private Integer userId;
    private String email;
    private Integer stars;
    private Float funds;

    public Integer getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Float getFunds() {
        return funds;
    }

    public void setFunds(Float funds) {
        this.funds = funds;
    }
}
