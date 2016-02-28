package com.example.broadcastbestprictice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
//活动管理器 ActivityCollector
public class ActivityCollector {
	
	public static List<Activity> activities = new ArrayList<Activity>();
	//添加活动
	public static void addActivity(Activity activity) {
		activities.add(activity);
	}
	//移除活动
	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}
	//将存储在List的活动全部销毁
	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}