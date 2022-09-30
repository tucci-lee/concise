package com.tuccicode.concise.id;

/**
 * id生成器
 *
 * @author tucci.lee
 */
@FunctionalInterface
public interface IdGenerator {
    /**
     * 获取一个id
     *
     * @return id
     */
    long next();
}
