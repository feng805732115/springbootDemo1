package com.springboot.springbootDemo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "smbms_user")
public class SmbmsUser {

  @Id
  @GeneratedValue
  private Long id;
  private String userCode;
  private String userName;
  private String userPassword;
  private Long gender;
  private java.sql.Date birthday;
  private String phone;
  private String address;
  private Long userRole;
  private Long createdBy;
  private java.sql.Timestamp creationDate;
  private Long modifyBy;
  private java.sql.Timestamp modifyDate;
  private String idPicPath;
  private String workPicPath;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public Long getUserRole() {
    return userRole;
  }

  public void setUserRole(Long userRole) {
    this.userRole = userRole;
  }


  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public Long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Long modifyBy) {
    this.modifyBy = modifyBy;
  }


  public java.sql.Timestamp getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(java.sql.Timestamp modifyDate) {
    this.modifyDate = modifyDate;
  }


  public String getIdPicPath() {
    return idPicPath;
  }

  public void setIdPicPath(String idPicPath) {
    this.idPicPath = idPicPath;
  }


  public String getWorkPicPath() {
    return workPicPath;
  }

  public void setWorkPicPath(String workPicPath) {
    this.workPicPath = workPicPath;
  }

}
