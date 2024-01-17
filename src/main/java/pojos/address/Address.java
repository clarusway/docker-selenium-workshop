package pojos.address;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    @JsonProperty
    private String firstname;

    @JsonProperty
    private String lastname;

    @JsonProperty
    private String company;

    @JsonProperty
    private String address;

    @JsonProperty
    private String address2;

    @JsonProperty
    private String country;

    @JsonProperty
    private String state;

    @JsonProperty
    private String city;

    @JsonProperty
    private String zipCode;

    @JsonProperty
    private String mobileNumber;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}
