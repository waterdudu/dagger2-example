package com.x.xdagger2;

/**
 * Created by dudu on 15/3/16.
 */

import android.app.Application;

import javax.inject.Inject;

public class MyApplication extends Application {
    private static AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = Dagger_AppComponent.builder().appModule(new AppModule(this)).build();
    }

    public static void inject(MainActivity target) {
        component.inject(target);
    }

    public static AppComponent getComponent() {
        return component;
    }

}