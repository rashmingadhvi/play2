package models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by rashmin.gadhvi on 6/1/2016.
 */
@Entity
public class UserModel{
    @Id
    private Integer userID;
    private String name;

    
}
