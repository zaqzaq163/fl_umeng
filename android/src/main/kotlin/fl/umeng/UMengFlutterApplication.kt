package fl.umeng

import android.content.pm.PackageManager
import android.util.Log
import com.umeng.commonsdk.UMConfigure
import io.flutter.app.FlutterApplication


class UMengFlutterApplication : FlutterApplication() {
    override fun onCreate() {
        super.onCreate()
        try {
            val bundle = applicationInfo.metaData
            packageManager.getApplicationInfo(
                applicationInfo.packageName,
                PackageManager.GET_META_DATA
            )
            val apiKey: String? = bundle.getString("UMENG_APPKEY")
            Log.d("测试", "kimmy=$apiKey")
            UMConfigure.preInit(this, "5e3f96f3cb23d2a070000048", "Umeng")
        } catch (e: Exception) {
            Log.d("测试", e.toString())
        }

    }
}