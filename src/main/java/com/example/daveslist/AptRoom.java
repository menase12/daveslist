package com.example.daveslist;

        import org.hibernate.validator.constraints.NotEmpty;
        import org.springframework.format.annotation.DateTimeFormat;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.validation.constraints.Max;
        import javax.validation.constraints.Min;
        import javax.validation.constraints.NotNull;
        import javax.validation.constraints.Size;

@Entity
public class AptRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    //@Size(min=5, max=40)
    private String address;

    @NotNull
    @NotEmpty
    //@Size(min=5, max=30)
    private String city;

    @NotNull
    @NotEmpty
    //@Size(min=2, max=2)
    private String state;

    @NotNull
    @NotEmpty
    //@Min(0)
    private String price;

    private String description;

    private String rules;

    private String wifi; // (yes/no),

    private String cable; // cable (none/basic/premium)

    private String privateBathroom; // private bathroom (yes/no).

    @NotNull
    private String rented;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getCable() {
        return cable;
    }

    public void setCable(String cable) {
        this.cable = cable;
    }

    public String getPrivateBathroom() {
        return privateBathroom;
    }

    public void setPrivateBathroom(String privateBathroom) {
        this.privateBathroom = privateBathroom;
    }

    public String getRented() {
        return rented;
    }

    public void setRented(String rented) {
        this.rented = rented;
    }
}
