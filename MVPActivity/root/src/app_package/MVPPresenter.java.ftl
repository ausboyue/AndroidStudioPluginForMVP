package ${packageName};

/**
 * <pre>
 *     @author : www.icheny.cn
 *     @e-mail : ausboyue@gmail.com
 *     @time   : ${createTime}
 *     @desc   :  MVP --> ${commonClassName} P --> Presenter. Child Presenter Implements Class For This Module.
 *     @version: 1.0.1
 * </pre>
 */
public class ${presenterClass} implements ${mvpInterface}.Presenter {

    private final ${mvpInterface}.View view;

    /**
     * Constructor
     *
     * @param view
     */
    public ${presenterClass}(${mvpInterface}.View view) {
        this.view = view;
    }

    @Override
    public void loadData() {

    }

    @Override
    public void doRefresh() {

    }
}
