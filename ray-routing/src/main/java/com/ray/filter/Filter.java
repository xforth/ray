package com.ray.filter;

import com.ray.context.RequestContext;

/**
 * Created by haiyan@meili-inc.com on 2019/1/30
 */
public interface Filter {

    void invoke(RequestContext requestContext);
}
