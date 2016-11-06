package com.tolgaduran.android.reportcard;

/**
 * Created by Java_Engineer on 06.11.2016.
 */

public class ReportCard {
    private String subjectName;
    private int subjectIcon;
    private String grade;

    public ReportCard(){
        super();
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public String getGrade(){
        return this.grade;
    }
    public int getSubjectIcon(){
        return this.subjectIcon;
    }

    public ReportCard(int icon, String subjectName, String grade) {
        super();
        this.subjectIcon = icon;
        this.subjectName = subjectName  ;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Your choice got \n" + grade+ " Grade in "+ subjectName ;
    }
}

