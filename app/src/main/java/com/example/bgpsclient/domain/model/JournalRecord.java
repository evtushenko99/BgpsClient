package com.example.bgpsclient.domain.model;

public class JournalRecord {
    private int id;
    private int count;
    private String studentFulName;
    private String subjectName;
    private String subjectShortName;
    private String examType;
    private String markName;
    private String markValue;


    public JournalRecord(int id, int count, String studentFulName, String subjectName, String subjectShortName, String examType, String markName, String markValue) {
        this.id = id;
        this.count = count;
        this.studentFulName = studentFulName;
        this.subjectName = subjectName;
        this.subjectShortName = subjectShortName;
        this.examType = examType;
        this.markName = markName;
        this.markValue = markValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
