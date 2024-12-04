package gbl.huang.common.constants;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public enum RedisMode {
    STANDALONE("STANDALONE", "单机模式"),
    SENTINEL("SENTINEL", "sentinel模式"),
    CLUSTER("CLUSTER", "cluster模式");
    final String name;
    final String desc;
}
