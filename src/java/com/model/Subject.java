/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author Saugat
 */
public class Subject {

    private String SubjectCode;
    private String SubjectName;
    private int SemesterId;
    private String FacultyId;

    /**
     * @return the SubjectCode
     */
    public String getSubjectCode() {
        return SubjectCode;
    }

    /**
     * @param SubjectCode the SubjectCode to set
     */
    public void setSubjectCode(String SubjectCode) {
        this.SubjectCode = SubjectCode;
    }

    /**
     * @return the SubjectName
     */
    public String getSubjectName() {
        return SubjectName;
    }

    /**
     * @param SubjectName the SubjectName to set
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }

    /**
     * @return the SemesterId
     */
    public int getSemesterId() {
        return SemesterId;
    }

    /**
     * @param SemesterId the SemesterId to set
     */
    public void setSemesterId(int SemesterId) {
        this.SemesterId = SemesterId;
    }

    /**
     * @return the FacultyId
     */
    public String getFacultyId() {
        return FacultyId;
    }

    /**
     * @param FacultyId the FacultyId to set
     */
    public void setFacultyId(String FacultyId) {
        this.FacultyId = FacultyId;
    }

}
