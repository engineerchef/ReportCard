package com.tolgaduran.android.reportcard;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Java_Engineer on 06.11.2016.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard>{
    Context context;
    int id;
    ReportCard listDetails[]=null;

    public ReportCardAdapter(Context context,int id, ReportCard[] lists){
        super(context,id,lists);
        this.id=id;
        this.context=context;
        this.listDetails=lists;
    }

    static class ReportCardDetails{
        ImageView subIcon;
        TextView subName;
        TextView subGrade;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list=convertView;
        ReportCardDetails reportCardBox=null;

        if (list==null){
            LayoutInflater inflater=((Activity)context).getLayoutInflater();
            list=inflater.inflate(id,parent,false);

            reportCardBox=new ReportCardDetails();
            reportCardBox.subIcon=(ImageView)list.findViewById(R.id.subjectImage);
            reportCardBox.subName=(TextView)list.findViewById(R.id.subjectName);
            reportCardBox.subGrade=(TextView)list.findViewById(R.id.subjectGrade);

            list.setTag(reportCardBox);
        }else {
            reportCardBox=(ReportCardDetails)list.getTag();
        }

        ReportCard Card=listDetails[position];

        reportCardBox.subName.setText(Card.getSubjectName());
        reportCardBox.subGrade.setText(Card.getGrade());
        reportCardBox.subIcon.setImageResource(Card.getSubjectIcon());

        return list;
    }
}
