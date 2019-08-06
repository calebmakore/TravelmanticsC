package com.cloudssystems.travelmantics;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;


public class FirebaseUtl {
    public static FirebaseDatabase mFirebaseDataBase;
    public static DatabaseReference mDatabaseReference;
    private static  FirebaseUtl firebaseUtl;
    public  static  ArrayList<TravelDeal> mDeals;
    private FirebaseUtl (){}

    public static void  openFbReference(String ref){
        if(firebaseUtl == null){
            firebaseUtl = new FirebaseUtl();
            mFirebaseDataBase = FirebaseDatabase.getInstance();
            mDeals = new ArrayList<TravelDeal>();
        }

        mDatabaseReference = mFirebaseDataBase.getReference().child(ref);
    }
}
