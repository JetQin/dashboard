package io.github.jetqin.config.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="sec")
public class SecurityProperties {

    private String keyStore;
    private String keyAlias;
    private String keyPassword;
}
