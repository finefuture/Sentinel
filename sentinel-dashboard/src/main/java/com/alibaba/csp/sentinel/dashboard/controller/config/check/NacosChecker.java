package com.alibaba.csp.sentinel.dashboard.controller.config.check;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import static com.alibaba.csp.sentinel.dashboard.Constants.CONFIG_CHANGE_CHECKER;
import static com.alibaba.csp.sentinel.dashboard.Constants.DATASOURCE_NACOS;

/**
 * do some check if use Nacos as DataSource
 *
 * @author longqiang
 */
@Component(DATASOURCE_NACOS + CONFIG_CHANGE_CHECKER)
@ConditionalOnProperty(name = "disableNacos", havingValue = "false", matchIfMissing = true)
public class NacosChecker implements Checker {

    @Override
    public boolean checkOperator(String operator, String app, String ip, Integer port) {
        return true;
    }
}
