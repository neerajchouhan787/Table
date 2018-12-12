package table;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;



public class ScreenUtils {

	public static int getScreenWidth(Context context) {
		final WindowManager windowManager = ((Activity) context).getWindow().getWindowManager();
		final Display display = windowManager.getDefaultDisplay();
		
		return display.getWidth();
	}

	public static int getScreenHeight(Context context) {
		final WindowManager windowManager = ((Activity) context).getWindow().getWindowManager();
		final Display display = windowManager.getDefaultDisplay();
		
		return display.getHeight();
	}
}
