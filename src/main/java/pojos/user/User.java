package pojos.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import pojos.address.Address;

public class User {

    @JsonProperty
    private String title;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String password;

    @JsonProperty
    private int day_of_birth;

    @JsonProperty
    private int month_of_birth;

    @JsonProperty
    private int year_of_birth;

    @JsonProperty
    private Address address;

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getDay_of_birth() {
        return day_of_birth;
    }

    public int getMonth_of_birth() {
        return month_of_birth;
    }

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public Address getAddress() {
        return address;
    }
}
