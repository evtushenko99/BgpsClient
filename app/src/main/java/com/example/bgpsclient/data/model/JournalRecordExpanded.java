package com.example.bgpsclient.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JournalRecordExpanded {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("isInTime")
    @Expose
    private boolean isInTime;
    @SerializedName("count")
    @Expose
    private int count;
    @SerializedName("studentId")
    @Expose
    private int studentId;
    @SerializedName("studyPlanId")
    @Expose
    private int studyPlanId;
    @SerializedName("markId")
    @Expose
    private int markId;
    @SerializedName("studentFulName")
    @Expose
    private String studentFulName;
    @SerializedName("subjectName")
    @Expose
    private String subjectName;
    @SerializedName("subjectShortName")
    @Expose
    private String subjectShortName;
    @SerializedName("examType")
    @Expose
    private String examType;
    @SerializedName("markName")
    @Expose
    private String markName;
    @SerializedName("markValue")
    @Expose
    private String markValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInTime() {
        return isInTime;
    }

    public void setInTime(boolean inTime) {
        isInTime = inTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudyPlanId() {
        return studyPlanId;
    }

    public void setStudyPlanId(int studyPlanId) {
        this.studyPlanId = studyPlanId;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public String getStudentFulName() {
        return studentFulName;
    }

    public void setStudentFulName(String studentFulName) {
        this.studentFulName = studentFulName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectShortName() {
        return subjectShortName;
    }

    public void setSubjectShortName(String subjectShortName) {
        this.subjectShortName = subjectShortName;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getMarkName() {
        return markName;
    }

    public void setMarkName(String markName) {
        this.markName = markName;
    }

    public String getMarkValue() {
        return markValue;
    }

    public void setMarkValue(String markValue) {
        this.markValue = markValue;
    }
}
