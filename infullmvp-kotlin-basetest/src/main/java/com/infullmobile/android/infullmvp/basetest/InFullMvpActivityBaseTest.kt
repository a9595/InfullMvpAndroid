package com.infullmobile.android.infullmvp.basetest

/*

abstract class InFullMvpActivityBaseTest<
        T : InFullMvpActivity<PresenterType, PresentedViewType, BindingType>,
        PresenterType : Presenter<PresentedViewType, Any?>,
        out PresentedViewType : PresentedActivityView<PresenterType, Any?>,
        in BindingType : ViewDataBinding> {

    lateinit var testedActivity: T
        private set

    val testedPresenter: PresenterType
        get() = testedActivity.presenter
    val testedView: PresentedViewType
        get() = testedActivity.presentedView

    @Before
    open fun setUp() {
        val controller = activity
        testedActivity = controller.get()
        substituteModules(testedActivity)
        controller.postCreate(null).visible()
    }

    private val activity: ActivityController<T>
        get() = Robolectric.buildActivity(testActivityClass).withIntent(activityIntent).create()

    protected abstract val testActivityClass: Class<T>

    open protected val activityIntent: Intent
        get() = Intent(RuntimeEnvironment.application, testActivityClass)

    protected fun getString(stringResourceId: Int): String {
        return RuntimeEnvironment.application.resources.getString(stringResourceId)
    }

    open fun substituteModules(activity: T) {
        */
/* NO OP *//*

    }
}
*/
