package cn.icheny.plugin.mvp.demo.module.xmodule;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  MVP --> P --> Presenter. Child Presenter Implements Class For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public class XModulePresenter implements IXModule.Presenter {

    private final IXModule.View view;

    /**
     * Constructor
     *
     * @param view
     */
    public XModulePresenter(IXModule.View view) {
        this.view = view;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void doRefresh() {

    }
}
