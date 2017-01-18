package com.anhuaiyuan.yijia.db;

import android.content.Context;

import com.ab.db.orm.AbDBHelper;
import com.anhuaiyuan.yijia.user.model.User;


public class DBInsideHelper extends AbDBHelper {
	private static final String DBNAME = "yijia.db";
    
	private static final int DBVERSION = 2;
	
	private static final Class<?>[] clazz = {User.class};

	public DBInsideHelper(Context context) {
		super(context, DBNAME, null, DBVERSION, clazz);
	}

}



