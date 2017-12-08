package mock.mvp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by BalaKrishnan on 08-12-2017.
 */
@Singleton
@Component(modules=ApplicationModule.class)
public interface ApplicationComponent {

void inject (MainActivity target);
}
