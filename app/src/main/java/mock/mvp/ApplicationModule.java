package mock.mvp;
import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by BalaKrishnan on 08-12-2017.
 */
@Module
public class ApplicationModule {
    private Application application;
    public ApplicationModule(Application application){
        this.application=application;
    }
    @Provides
    @Singleton
    public Context provideContext(){
        return application;
    }
}

