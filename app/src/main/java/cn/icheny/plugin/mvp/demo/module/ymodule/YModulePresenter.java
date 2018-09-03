package cn.icheny.plugin.mvp.demo.module.ymodule;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  MVP --> P --> Presenter. Child Presenter Implements Class For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public class YModulePresenter implements IYModule.Presenter {

    private final IYModule.View view;

    /**
     * Constructor
     *
     * @param view
     */
    public YModulePresenter(IYModule.View view) {
        this.view = view;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void doRefresh() {

    }
}
