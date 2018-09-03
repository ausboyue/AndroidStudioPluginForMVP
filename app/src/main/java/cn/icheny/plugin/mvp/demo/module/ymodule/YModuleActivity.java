package cn.icheny.plugin.mvp.demo.module.ymodule;

import cn.icheny.plugin.mvp.demo.R;
import cn.icheny.plugin.mvp.demo.module.base.BaseActivity;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  YModule Activity.
 *     @version: 1.0.1
 * </pre>
 */
public class YModuleActivity extends BaseActivity<IYModule.Presenter> implements IYModule.View {

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
    public void setPresenter(IYModule.Presenter presenter) {
        // Bind presenter
        if (presenter == null) {
            presenter = new YModulePresenter(this);
        }
    }
}
