package com.lhedrick.golftourneyfinder.models;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
public class UserProfileDetails {

    @Id
    @GeneratedValue
    @Column(name = "profile_id")
    private int profileId;

    private String firstName;

    private String lastName;

    private String location;

    @Column(length = 500)
    private String aboutMe;

    @OneToMany(mappedBy = "authorProfile", cascade = CascadeType.ALL)
    private List<Tournament> tournamentsAuthored;

    @OneToMany(mappedBy = "userProfile", cascade = CascadeType.ALL)
    private List<UserReview> tourFeedback;

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public List<Tournament> getTournamentsAuthored() {
        return tournamentsAuthored;
    }

    public void setToursAuthored(List<Tournament> tournamentsAuthored) {
        this.tournamentsAuthored = tournamentsAuthored;
    }

}
