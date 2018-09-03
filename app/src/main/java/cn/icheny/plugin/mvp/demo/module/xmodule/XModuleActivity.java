package cn.icheny.plugin.mvp.demo.module.xmodule;

import cn.icheny.plugin.mvp.demo.R;
import cn.icheny.plugin.mvp.demo.module.base.BaseActivity;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  XModule Activity.
 *     @version: 1.0.1
 * </pre>
 */
public class XModuleActivity extends BaseActivity<IXModule.Presenter> implements IXModule.View {


    @Override
    protected void initData() {

    }

    @Override
    protected void initViews() {

    }


    @Override
    protected int layoutId() {
        return R.layout.activity_xmodule;
    }


    @Override
    public void showData() {

    }


    @Override
    public void setPresenter(IXModule.Presenter presenter) {
        // Bind presenter
        if (presenter == null) {
            presenter = new XModulePresenter(this);
        }
    }
}
