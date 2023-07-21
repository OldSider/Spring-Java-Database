package ProviderITAcademy.ProjectDomain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Variables implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String fullName;
  private String email;
  private String userPhone;
  private String userId;
  private String gender;
  private String birth;
  private String userPassword;
  private String userZipCode;
  private String userDistrict;
  private String userCity;
  private String userState;
  private String userHouseNumber;

  public Variables() {
    super();
  }

  public Variables(
    Integer id,
    String fullName,
    String email,
    String userPhone,
    String userId,
    String gender,
    String birth,
    String userPassword,
    String userZipCode,
    String userDistrict,
    String userCity,
    String userState,
    String userHouseNumber
  ) {
    super();
    this.id = id;
    this.fullName = fullName;
    this.email = email;
    this.userPhone = userPhone;
    this.userId = userId;
    this.gender = gender;
    this.birth = birth;
    this.userPassword = userPassword;
    this.userZipCode = userZipCode;
    this.userDistrict = userDistrict;
    this.userCity = userCity;
    this.userState = userState;
    this.userHouseNumber = userHouseNumber;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(String userPhone) {
    this.userPhone = userPhone;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public String getUserZipCode() {
    return userZipCode;
  }

  public void setUserZipCode(String userZipCode) {
    this.userZipCode = userZipCode;
  }

  public String getUserDistrict() {
    return userDistrict;
  }

  public void setUserDistrict(String userDistrict) {
    this.userDistrict = userDistrict;
  }

  public String getUserCity() {
    return userCity;
  }

  public void setUserCity(String userCity) {
    this.userCity = userCity;
  }

  public String getUserState() {
    return userState;
  }

  public void setUserState(String userState) {
    this.userState = userState;
  }

  public String getUserHouseNumber() {
    return userHouseNumber;
  }

  public void setUserHouseNumber(String userHouseNumber) {
    this.userHouseNumber = userHouseNumber;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Variables other = (Variables) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }
}
