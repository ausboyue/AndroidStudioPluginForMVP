package cn.icheny.plugin.mvp.demo.module.base;


/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : 2018.08.25
 *     @desc   :  MVP --> View --> interface
 *     @version: 1.0.1
 * </pre>
 */
public interface IBaseView<T extends IBasePresenter> {

    //====== There are some base methods that should be overide for show UI =======//

    void doRefresh();

    void showProgress();

    void hideProgress();

    void showToast();

    /**
     * Bind presenter
     */
    void setPresenter(T presenter);

    //..................More methods you may add here
}
