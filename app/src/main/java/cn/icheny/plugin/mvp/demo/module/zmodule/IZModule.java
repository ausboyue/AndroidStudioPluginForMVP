package cn.icheny.plugin.mvp.demo.module.zmodule;

import cn.icheny.plugin.mvp.demo.module.base.IBasePresenter;
import cn.icheny.plugin.mvp.demo.module.base.IBaseView;

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.09.02
 *     @desc   :  MVP --> ZModule VP --> View,Presenter. Child View And Child Presenter Interface For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public interface IZModule {

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
