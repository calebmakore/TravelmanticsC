package com.cloudssystems.travelmantics;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class FirebaseUtil {
    public static FirebaseDatabase mFirebaseDataBase;
    public static DatabaseReference mDatabaseReference;
    private static FirebaseUtil firebaseUtil;

    public  static  ArrayList<TravelDeal> mDeals;
    private FirebaseUtil(){}

    public static void  openFbReference(String ref){
        if(firebaseUtil == null){
            firebaseUtil = new FirebaseUtil();
            mFirebaseDataBase = FirebaseDatabase.getInstance();
        }
        mDeals = new ArrayList<TravelDeal>();
        mDatabaseReference = mFirebaseDataBase.getReference().child(ref);
    }



}
