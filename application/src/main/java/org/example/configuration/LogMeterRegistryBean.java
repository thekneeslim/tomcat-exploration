package org.example.configuration;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.logging.LoggingMeterRegistry;
import io.micrometer.core.instrument.logging.LoggingRegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class LogMeterRegistryBean {

    @Bean
    LoggingMeterRegistry logMeterRegistry() {
        return new LoggingMeterRegistry(new LoggingRegistryConfig() {
            @Override
            public Duration step() {
                return Duration.ofSeconds(5);
            }

            @Override
            public String get(String key) {
                return null;
            }
        }, Clock.SYSTEM);
    }
}
