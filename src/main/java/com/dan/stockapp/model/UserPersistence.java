package com.dan.stockapp.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By Dan on 2017/10/21
 */
@Entity
@Table(name = "USER")
@NamedQuery(name="fetchByUserName", query="SELECT p FROM UserPersistence p where p.userName=?")
public class UserPersistence {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USERID")
    private int userId;

    @Column(name = "USERNAME")
    private  String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "PASSWORD")
    private  String password;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "UESER_STOCK", joinColumns = @JoinColumn(name = "USERID", referencedColumnName = "USERID"),
            inverseJoinColumns = @JoinColumn(name = "STOCKID", referencedColumnName = "STOCKID"))
    private Set<StockPersistence> stocks = new HashSet<StockPersistence>();

    public Set<StockPersistence> getStocks() {
        return stocks;
    }

    public void setStocks(Set<StockPersistence> stocks) {
        this.stocks = stocks;
    }


}
