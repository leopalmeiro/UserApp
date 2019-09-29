package com.userappapi.models;

/**
 * User
 */
public class User {

    private Integer _id;
    private String name;
    private String avatar;

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param _id the _id to set
     */
    public void set_id(Integer _id) {
        this._id = _id;
    }

    /**
     * @return the avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the _id
     */
    public Integer get_id() {
        return _id;
    }

    public User(Integer id, String name, String avatar){
        this._id = id;
        this.name = name;
        this.avatar = avatar;
    }
}