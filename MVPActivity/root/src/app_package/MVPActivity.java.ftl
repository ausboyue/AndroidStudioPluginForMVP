package ${packageName};

<#if generateLayout>
import cn.icheny.plugin.mvp.demo.R;
</#if>
import cn.icheny.plugin.mvp.demo.module.base.BaseActivity;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : ${createTime}
 *     @desc   : ${commonClassName} Activity.
 *     @version: 1.0.1
 * </pre>
 */
public class ${activityClass} extends BaseActivity<${mvpInterface}.Presenter> implements ${mvpInterface}.View {

    @Override
    protected void initData() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected int layoutId() {
        return R.layout.${layoutName};
    }

    @Override
    public void showData() {

    }

    @Override
    public void setPresenter(${mvpInterface}.Presenter presenter) {
        // Bind presenter
        if (presenter == null) {
            presenter = new ${presenterClass}(this);
        }
    }
}
