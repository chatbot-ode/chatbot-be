package org.koreait.global.configs;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "python.path")
public class PythonProperties {
    private String base;    // 파이썬 설치 경로
    private String model;   // model 경로
}
