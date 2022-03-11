package com.example.parstagram;
import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TDGBE59bqtCdXJrcx0o2VTMkW7fLnpfyFlfpJ0eV")
                .clientKey("ZyRJXrNckR0GITSc7yG8I7j9dpAxFFJ1wxiCDxXx")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
