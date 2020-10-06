package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Gs3uADkbCf6MEgxEpSTU04NP6xJNzwEbbSf5XepO")
                .clientKey("3bELfIXYrKLndTD3Y560FKfaqxz2gYspSoGwTEet")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
