package cn.icheny.plugin.mvp.demo.module.zmodule;

import cn.icheny.plugin.mvp.demo.R;
import cn.icheny.plugin.mvp.demo.module.base.BaseActivity;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.09.02
 *     @desc   : ZModule Activity.
 *     @version: 1.0.1
 * </pre>
 */
public class ZModuleActivity extends BaseActivity<IZModule.Presenter> implements IZModule.View {

    @Override
    protected void initData() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int layoutId() {
        return R.layout.activity_zmodule;
    }

    @Override
    public void showData() {

    }

    @Override
    public void setPresenter(IZModule.Presenter presenter) {
        // Bind presenter
        if (presenter == null) {
            presenter = new ZModulePresenter(this);
        }
    }
}
