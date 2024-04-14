/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poe1;

/**
 *
 * @author LeoAddinall_ST10441154_ST10441154@vcconnect.edu.za
 */
public class UserInfo {

    private String FirstName;// Stores the first name of the user
    private String LastName;// Stores the last name of the user
    private String PassWord;// Stores the password of the user
    private String UserName;// Stores the username of the user

    //Default constructor for UserInfo class.
    public UserInfo() {
    }

    //Parameterized constructor for UserInfo class.
    //Own code
    public UserInfo(String FirstName, String LastName, String PassWord, String UserName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.PassWord = PassWord;
        this.UserName = UserName;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @return the PassWord
     */
    public String getPassWord() {
        return PassWord;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @param PassWord the PassWord to set
     */
    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

}
