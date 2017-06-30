package com.infullmobile.android.infullmvp.sample.activity;

/*
@RunWith(RobolectricGradleTestRunner.class)
public class SampleActivityTest extends InFullMvpActivityBaseTest<
        SampleActivity, SampleActivityPresenter, SampleActivityView, ViewDataBinding> {

    private FragmentStatePagerAdapter mockFragmentStatePagerAdapter = mock(FragmentStatePagerAdapter.class);

    @NonNull
    @Override
    protected Class<SampleActivity> getTestActivityClass() {
        return SampleActivity.class;
    }

    @Override
    public void substituteModules(@NonNull final SampleActivity activity) {
        super.substituteModules(activity);
        activity.sampleActivityGraph.setAddNewItemModule(new TestSampleActivityModule(activity));
    }

    @Test
    public void shouldSetAdapterOnViewsBound() {
        assertThat(getTestedView().getPager().getAdapter())
                .isEqualTo(mockFragmentStatePagerAdapter);
    }

    private final class TestSampleActivityModule extends SampleActivityModule {

        public TestSampleActivityModule(final SampleActivity sampleActivity) {
            super(sampleActivity);
        }

        @Override
        @Provides
        @SampleActivityScope
        protected FragmentStatePagerAdapter providesPagerAdapter(FragmentManager fragmentManager) {
            return mockFragmentStatePagerAdapter;
        }
    }
}
*/
