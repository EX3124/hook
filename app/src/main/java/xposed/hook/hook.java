package xposed.hook;

import androidx.annotation.Keep;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

@Keep
public class hook implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) {
        if (lpparam.packageName.equals("com.xposedscope"))
            mainhook(lpparam);
    }

    public void mainhook(XC_LoadPackage.LoadPackageParam lpparam) {

    }
}
