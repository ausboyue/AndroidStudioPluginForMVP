package ${packageName};

import cn.icheny.plugin.mvp.demo.module.base.IBasePresenter;
import cn.icheny.plugin.mvp.demo.module.base.IBaseView;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : ${createTime}
 *     @desc   :  MVP --> ${commonClassName} VP --> View,Presenter. Child View And Child Presenter Interface For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public interface ${mvpInterface} {

    interface View extends IBaseView<Presenter> {
        /**
         * show data
         */
        void showData();

    }

    interface Presenter extends IBasePresenter {
        /**
         * load data
         */
        void loadData();
    }
}
