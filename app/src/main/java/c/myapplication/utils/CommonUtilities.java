package c.myapplication.utils;

import android.content.Context;
import android.widget.Toast;

import c.myapplication.database.DBHelper;

/**
 * Created by User on 07/10/2017.
 */

public class CommonUtilities {

    // A Singleton Class Creates Object if not created
    public static DBHelper getDBObject(Context context){
        DBHelper dbHelper = DBHelper.getInstance(context);
        return dbHelper;
    }
}
