package com.example.broadcastbestprictice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
//������� ActivityCollector
public class ActivityCollector {
	
	public static List<Activity> activities = new ArrayList<Activity>();
	//��ӻ
	public static void addActivity(Activity activity) {
		activities.add(activity);
	}
	//�Ƴ��
	public static void removeActivity(Activity activity) {
		activities.remove(activity);
	}
	//���洢��List�Ļȫ������
	public static void finishAll() {
		for (Activity activity : activities) {
			if (!activity.isFinishing()) {
				activity.finish();
			}
		}
	}
}