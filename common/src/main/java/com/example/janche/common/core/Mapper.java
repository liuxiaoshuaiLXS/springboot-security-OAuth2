package com.example.janche.common.core;

import tk.mybatis.mapper.common.*;

/**
 * <P></P>
 *
 * @author lirong
 * @version v1.0
 * @since 2018/1/25 11:45
 */
public interface Mapper<T> extends
        BaseMapper<T>,
        MySqlMapper<T>,
        IdsMapper<T>,
        ConditionMapper<T>,
        ExampleMapper<T>{
}
