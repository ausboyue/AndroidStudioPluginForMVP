package cn.icheny.plugin.mvp.demo.module.zmodule;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.09.02
 *     @desc   :  MVP --> ZModule P --> Presenter. Child Presenter Implements Class For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public class ZModulePresenter implements IZModule.Presenter {

    private final IZModule.View view;

    /**
     * Constructor
     *
     * @param view
     */
    public ZModulePresenter(IZModule.View view) {
        this.view = view;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void doRefresh() {

    }
}
