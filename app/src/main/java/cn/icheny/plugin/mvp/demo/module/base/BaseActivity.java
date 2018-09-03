package cn.icheny.plugin.mvp.demo.module.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  Base Activity，Do some base UI things.
 *     @version: 1.0.1
 * </pre>
 */
public abstract class BaseActivity<T extends IBasePresenter> extends AppCompatActivity implements IBaseView<T> {

    protected T presenter;
    protected Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        setPresenter(presenter);
        setContentView(getLayout());
        initData();
        initViews();
    }

    /**
     * Init data
     * Get data from Intent (Bundle) or Database or SharedPreferences....And ready  data which will be use.
     *
     * @return
     */
    protected abstract void initData();


    /**
     * Init view and show base UI
     *
     * @return
     */
    protected abstract void initViews();

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        injectView(view);
    }

    /**
     * load activity's layout
     * So you needn't use method {@link #setContentView(View) or  {@link #setContentView(int)  }
     * And you only need focus on{@link #layoutId()}}
     *
     * @return View ,It is "ContentView"
     */
    private View getLayout() {
        return LayoutInflater.from(this).inflate(layoutId(), null);
    }

    /**
     * @return
     */
    protected abstract int layoutId();


    /**
     * You can do some bind-view  operate .
     * For example, ButterKnife.bind() or DataBindingUtil.getBinding()
     *
     * @param view
     */
    protected void injectView(View view) {

    }

    @Override
    public void showProgress() {
        // Override this method
    }

    @Override
    public void hideProgress() {
        // Override this method
    }

    @Override
    public void doRefresh() {
        // Override this method
    }

    @Override
    public void showToast() {
        // Override this method
    }
}
