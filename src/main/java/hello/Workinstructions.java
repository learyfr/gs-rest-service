package hello;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
public class Workinstructions {
    @Id
    @GeneratedValue
//    private Integer id;

    @Column(name = "`Unit Nbr`")
    private String unitnbr;

    public String getUnitnbr() {
        return unitnbr;
    }

    public void setUnitnbr(String unitnbr) {
        this.unitnbr = unitnbr;
    }

//    private String email;
/*
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


*/

//    public String getUnitNumber() {
//        return unitNumber;
//    }
//
//    public void setUnitNumber(String unitNumber) {
//        this.unitNumber = unitNumber;
//    }
}
