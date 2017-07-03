package com.infullmobile.android.infullmvp.sample.activity.di;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.infullmobile.android.infullmvp.sample.activity.SampleActivity;
import com.infullmobile.android.infullmvp.sample.activity.SampleActivityModel;
import com.infullmobile.android.infullmvp.sample.activity.SampleActivityPresenter;
import com.infullmobile.android.infullmvp.sample.activity.SampleActivityView;
import com.infullmobile.android.infullmvp.sample.activity.TwoPagesAdapter;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleActivityModule {

    private SampleActivity sampleActivity;

    public SampleActivityModule(SampleActivity sampleActivity) {
        this.sampleActivity = sampleActivity;
    }

    @Provides
    @SampleActivityScope
    Context providesContext() {
        return sampleActivity;
    }

    @Provides
    @SampleActivityScope
    FragmentManager providesFragmentManager() {
        return sampleActivity.getSupportFragmentManager();
    }

    @Provides
    @SampleActivityScope
    protected FragmentStatePagerAdapter providesPagerAdapter(FragmentManager fragmentManager) {
        return new TwoPagesAdapter(fragmentManager);
    }

    @Provides
    @SampleActivityScope
    SampleActivityView providesSampleActivityView() {
        return new SampleActivityView();
    }

    @Provides
    @SampleActivityScope
    SampleActivityModel providesSampleActivityModel() {
        return new SampleActivityModel();
    }

    @Provides
    @SampleActivityScope
    SampleActivityPresenter providesAddNewItemPresenter(SampleActivityView sampleActivityView,
                                                         SampleActivityModel sampleActivityModel) {
        return new SampleActivityPresenter(sampleActivityView, sampleActivityModel);
    }
}
