package com.employee.CRUDdemo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="individuals")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PersonId")
    int personId;

    @Column(name="FirstName")
    String firstName;

    @Column(name = "MiddleName")
    String middleName;
    @Column(name="FirstLastName")
    String firstLastName;
    @Column(name="SecondLastName")
    String secondLastName;
    @Column(name="MaritalStatus")
    String maritalStatus;
    @Column(name="BirthDate")
    Date birthDate;

    @Column(name="Nacionality")
    String nacionality;

    @Column(name="NumberOfDependents")
    int numberOfDependents;

    @Column(name="DwellingType")
    String dwellingType;

    @Column(name="IsDwellingFreeOfEncumbrance")
    int sDwellingFreeOfEncumbrance;

    @Column(name="DoesBizActivities")
   int doesBizActivities;

    @Column(name="HiringType")
    String hiringType;


    public Employee(String firstName, String middleName, String firstLastName, String secondLastName,
                    String maritalStatus, Date birthDate, String nacionality, int numberOfDependents, String dwellingType,
                    int sDwellingFreeOfEncumbrance, int doesBizActivities, String hiringType) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.maritalStatus = maritalStatus;
        this.nacionality = nacionality;
        this.numberOfDependents = numberOfDependents;
        this.dwellingType = dwellingType;
        this.sDwellingFreeOfEncumbrance = sDwellingFreeOfEncumbrance;
        this.doesBizActivities = doesBizActivities;
        this.hiringType = hiringType;
        this.birthDate = birthDate;
    }

    public Employee() {
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getNacionality() {
        return nacionality;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public String getDwellingType() {
        return dwellingType;
    }

    public int getsDwellingFreeOfEncumbrance() {
        return sDwellingFreeOfEncumbrance;
    }

    public int getDoesBizActivities() {
        return doesBizActivities;
    }

    public String getHiringType() {
        return hiringType;
    }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    //    public Date getBirthDate() {
//        return birthDate;
//    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    public void setDwellingType(String dwellingType) {
        this.dwellingType = dwellingType;
    }

    public void setsDwellingFreeOfEncumbrance(int sDwellingFreeOfEncumbrance) {
        this.sDwellingFreeOfEncumbrance = sDwellingFreeOfEncumbrance;
    }

    public void setDoesBizActivities(int doesBizActivities) {
        this.doesBizActivities = doesBizActivities;
    }

    public void setHiringType(String hiringType) {
        this.hiringType = hiringType;
    }
//    public void setBirthDate(Date birthDate) {
//        this.birthDate = birthDate;
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstLastName='" + firstLastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
              //  ", birthDate=" + birthDate +
                '}';
    }
}
